package au.net.woodberry.spring.shopify.config;

import au.net.woodberry.spring.shopify.api.client.interceptors.LoggingInterceptor;
import au.net.woodberry.spring.shopify.api.client.interceptors.PrivateAuthInterceptor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;

@Configuration
public class ClientApiConfiguration {

    @Autowired
    private ConfigProps configProps;

    @Bean
    public RestTemplate privateAuthRestTemplate(MappingJackson2HttpMessageConverter messageConverter) {

        // Buffer the request/response so it can be intercepted and read.
        ClientHttpRequestFactory factory = new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory());

        RestTemplate restTemplate = new RestTemplate(factory);
        restTemplate.setMessageConverters(Collections.singletonList(messageConverter));
        ConfigProps.PrivateAuth privateAuth = configProps.getPrivateAuth();
        restTemplate.setInterceptors(Arrays.asList(
                new BasicAuthorizationInterceptor(privateAuth.getUsername(), privateAuth.getPassword()),
                new PrivateAuthInterceptor(privateAuth.getBaseUrl()),
                new LoggingInterceptor()));
        return restTemplate;
    }

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        mapper.setDateFormat(new StdDateFormat());
        return mapper;
    }

    @Bean
    public MappingJackson2HttpMessageConverter jackson2HttpMessageConverter(ObjectMapper objectMapper) {
        return new MappingJackson2HttpMessageConverter(objectMapper);
    }
}
