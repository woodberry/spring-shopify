package au.net.woodberry.spring.shopify.api.client;

import au.net.woodberry.spring.shopify.model.admin.Count;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ShopifyReadonlyResource<S> {

    ResponseEntity<Count> getCount();

    /**
     * Returns all resources
     * @return The list of all resources
     */
    ResponseEntity<List<S>> retrieveList();

    /**
     * Retrieve a single resource
     * @param id The id of the resource
     * @return The found resource
     */
    ResponseEntity<S> receiveSingle(long id);
}
