package au.net.woodberry.spring.shopify.api.client.resource;

import au.net.woodberry.spring.shopify.api.client.ShopifyReadonlyResource;
import au.net.woodberry.spring.shopify.api.client.message.ResponseDeserializer;
import au.net.woodberry.spring.shopify.model.admin.AbandonedCheckout;
import au.net.woodberry.spring.shopify.model.admin.Count;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class AbandonCheckoutsResource implements ShopifyReadonlyResource<AbandonedCheckout> {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ResponseDeserializer deserializer;
    
    @Override
    public ResponseEntity<Count> getCount() {
        return restTemplate.getForEntity("/admin/checkouts/count.json", Count.class);
    }

    @Override
    public ResponseEntity<List<AbandonedCheckout>> retrieveList() {
        ResponseEntity<JsonNode> entity = restTemplate.getForEntity("/admin/checkouts.json", JsonNode.class);
        return new ResponseEntity<>(deserializer.asList(entity.getBody().get("checkouts"), AbandonedCheckout.class),
                entity.getHeaders(), entity.getStatusCode());
    }

    @Override
    public ResponseEntity<AbandonedCheckout> receiveSingle(long id) {
        return null;
    }
}
