package au.net.woodberry.spring.shopify.api.client;

import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Basic operations that all shopify resources have.
 * @param <T> The input type
 * @param <S> A response output type
 */
public interface ShopifyResource<T, S> {

    /**
     * Creates a new resource
     * @param resource The resource to create
     * @return A response to the created resource
     */
    ResponseEntity<S> createNew(T resource);

    /**
     * Modify an existing resource
     * @param id The id of the resource
     */
    void modifyExisting(long id);

    /**
     * Removes a resource
     * @param id The id of the resource
     */
    void remove(long id);
}
