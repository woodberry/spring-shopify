package au.net.woodberry.spring.shopify.api.client.resource;

import au.net.woodberry.spring.shopify.api.client.ShopifyResource;
import au.net.woodberry.spring.shopify.api.client.message.ResponseDeserializer;
import au.net.woodberry.spring.shopify.model.admin.DiscountCode;
import au.net.woodberry.spring.shopify.model.admin.PriceRule;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class DiscountCodeResource implements ShopifyResource<DiscountCode, DiscountCode> {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ResponseDeserializer deserializer;

    @Override
    public ResponseEntity<DiscountCode> createNew(DiscountCode resource) {
        ResponseEntity<JsonNode> entity = restTemplate.postForEntity("/admin/price_rules/" + resource.getPriceRuleId() + "/discount_codes.json",
                resource, JsonNode.class);
        return new ResponseEntity<>(deserializer.asObject(entity.getBody().get("discount_code"), DiscountCode.class),
                entity.getHeaders(), entity.getStatusCode());
    }

    @Override
    public void modifyExisting(long id) {
    }

    @Override
    public void remove(long id) {
    }
}
