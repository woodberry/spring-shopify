package au.net.woodberry.spring.shopify.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "woodberry.spring.shopify")
public class ConfigProps {

    private PrivateAuth privateAuth;

    public static class PrivateAuth {
        private String baseUrl;
        private String username;
        private String password;

        public String getBaseUrl() {
            return baseUrl;
        }

        public void setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
        }

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
}
