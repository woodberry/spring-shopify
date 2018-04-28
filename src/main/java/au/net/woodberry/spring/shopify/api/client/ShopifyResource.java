package au.net.woodberry.spring.shopify.api.client;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ShopifyResource<T, S> {

    ResponseEntity<S> createNew(T resource);

    void modifyExisting(long id);

    List<T> retrieveList();

    T receiveSingle(long id);

    void remove(long id);
}
