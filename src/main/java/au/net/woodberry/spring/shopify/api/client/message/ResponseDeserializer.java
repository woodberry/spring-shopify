package au.net.woodberry.spring.shopify.api.client.message;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

@Component
public class ResponseDeserializer {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ObjectMapper mapper;

    public <T> List<T> asList(JsonNode jsonNode, Class<T> clazz) {
        final CollectionType collectionType = TypeFactory.defaultInstance().constructCollectionType(List.class, clazz);
        try {
            return mapper.readerFor(collectionType).readValue(jsonNode);
        } catch (IOException e) {
            throw new RuntimeException("An exception of type " + e.getClass().getSimpleName()
                    + " has occurred with message: " + e.getMessage(), e);
        }
    }

    public <T> T asObject(JsonNode jsonNode, Class<T> clazz) {
        try {
            return mapper.readerFor(clazz).readValue(jsonNode);
        } catch (IOException e) {
            throw new RuntimeException("An exception of type " + e.getClass().getSimpleName()
                    + " has occurred with message: " + e.getMessage(), e);
        }
    }
}
