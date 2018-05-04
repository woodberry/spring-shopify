package au.net.woodberry.spring.shopify.api.client.interceptors;

import java.net.URI;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Appends a base URL to the request so that resource classes do not need to inject these themselves.
 */
@Component
public class BaseUrlInterceptor implements ClientHttpRequestInterceptor {

    private final String baseUrl;

    public BaseUrlInterceptor(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        return execution.execute(new HttpRequest() {
            @Override
            public String getMethodValue() {
                return request.getMethodValue();
            }
            @Override
            public URI getURI() {
                return URI.create(baseUrl + request.getURI().toString());
            }
            @Override
            public HttpHeaders getHeaders() {
                return request.getHeaders();
            }
        }, body);
    }
}
