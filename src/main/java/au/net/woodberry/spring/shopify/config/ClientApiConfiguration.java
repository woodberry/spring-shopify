package au.net.woodberry.spring.shopify.config;

import au.net.woodberry.spring.shopify.api.client.interceptors.LoggingInterceptor;
import au.net.woodberry.spring.shopify.api.client.interceptors.BaseUrlInterceptor;
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

    /**
     * A configured shopify-compatible RestTemplate for making calls to the shopify-api via
     * private-auth
     *
     * @param messageConverter A JSON message converter
     * @param baseUrlInterceptor  An interceptor for adding the base URL to a request
     * @param loggingInterceptor An interceptor for logging request / response
     * @return A customized rest template for using the shopify api via private auth
     */
    @Bean
    public RestTemplate privateAuthRestTemplate(MappingJackson2HttpMessageConverter messageConverter,
                                                BaseUrlInterceptor baseUrlInterceptor,
                                                LoggingInterceptor loggingInterceptor) {

        // Buffer the request/response so it can be intercepted and read.
        ClientHttpRequestFactory factory = new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory());

        RestTemplate restTemplate = new RestTemplate(factory);
        restTemplate.setMessageConverters(Collections.singletonList(messageConverter));
        ConfigProps.PrivateAuth privateAuth = configProps.getPrivateAuth();
        restTemplate.setInterceptors(Arrays.asList(
                new BasicAuthorizationInterceptor(privateAuth.getUsername(), privateAuth.getPassword()),
                baseUrlInterceptor, loggingInterceptor));
        return restTemplate;
    }

    /**
     * Creates a configured object mapper.
     *
     * @return The objectmapper suitable for serialize/asObject Shopify request/response.
     */
    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        mapper.setDateFormat(new StdDateFormat());
        return mapper;
    }

    @Bean
    public MappingJackson2HttpMessageConverter messageConverter(ObjectMapper objectMapper) {
        return new MappingJackson2HttpMessageConverter(objectMapper);
    }

    @Bean
    public LoggingInterceptor loggingInterceptor() {
        return new LoggingInterceptor();
    }

    @Bean
    public BaseUrlInterceptor baseUrlInterceptor(ConfigProps configProps) {
        return new BaseUrlInterceptor(configProps.getBaseUrl());
    }
}
