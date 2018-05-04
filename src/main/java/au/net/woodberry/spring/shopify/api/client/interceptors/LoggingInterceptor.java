package au.net.woodberry.spring.shopify.api.client.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

@Component
public class LoggingInterceptor implements ClientHttpRequestInterceptor {

    private static final Logger LOG = LoggerFactory.getLogger(LoggingInterceptor.class);

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        logRequest(request, body);
        ClientHttpResponse response = execution.execute(request, body);
        logResponse(response);
        return response;
    }

    private void logRequest(HttpRequest request, byte[] body) throws IOException {
        LOG.info("============================ Request begin ===============================================");
        LOG.info("URI         : {}", request.getURI());
        LOG.info("Method      : {}", request.getMethod());
        LOG.info("Headers     : {}", request.getHeaders());
        LOG.info("Request body: {}", new String(body, "UTF-8"));
        LOG.info("============================ Request end =================================================");
    }

    private void logResponse(ClientHttpResponse response) throws IOException {
        LOG.info("============================ Response begin ==============================================");
        LOG.info("Status code  : {}", response.getStatusCode());
        LOG.info("Status text  : {}", response.getStatusText());
        LOG.info("Headers      : {}", response.getHeaders());
        LOG.info("Response body: {}", StreamUtils.copyToString(response.getBody(), Charset.defaultCharset()));
        LOG.info("============================ Response end ================================================");
    }
}
