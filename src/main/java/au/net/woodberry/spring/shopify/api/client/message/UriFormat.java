package au.net.woodberry.spring.shopify.api.client.message;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import org.springframework.stereotype.Component;

@Component
public class UriFormat {

    private StringBuilder builder = new StringBuilder();

    @JsonAnySetter
    public void addToUri(String name, Object property) {
        if (builder.length() > 0) {
            builder.append("&");
        }
        builder.append(name).append("=").append(property);
    }

    @Override
    public String toString() {
        return builder.toString();
    }
}
