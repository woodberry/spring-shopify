package au.net.woodberry.spring.shopify.api.client.message;

import au.net.woodberry.spring.shopify.model.admin.Count;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

/**
 * Convenience methods for working with an object mapper. This class is mostly used
 * for de-serializing responses.
 */
@Component
public class MappingSupport {

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

    public String convertParams(Count.QueryFilter queryFilter) {
        return mapper.convertValue(queryFilter, UriFormat.class).toString();
    }
}
