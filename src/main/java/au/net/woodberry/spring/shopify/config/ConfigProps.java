package au.net.woodberry.spring.shopify.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@Validated
@Configuration
@ConfigurationProperties(prefix = "woodberry.spring.shopify")
public class ConfigProps {

    @NotNull
    private PrivateAuth privateAuth;

    @NotNull
    private String baseUrl;

    public static class PrivateAuth {

        @NotNull
        private String username;

        @NotNull
        private String password;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    public PrivateAuth getPrivateAuth() {
        return privateAuth;
    }

    public void setPrivateAuth(PrivateAuth privateAuth) {
        this.privateAuth = privateAuth;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
}
