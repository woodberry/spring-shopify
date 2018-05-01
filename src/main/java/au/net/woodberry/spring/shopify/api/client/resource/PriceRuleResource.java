package au.net.woodberry.spring.shopify.api.client.resource;

import au.net.woodberry.spring.shopify.api.client.message.MappingSupport;
import au.net.woodberry.spring.shopify.model.admin.PriceRule;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PriceRuleResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private MappingSupport mappingSupport;

    public ResponseEntity<PriceRule> createNew(PriceRule resource) {
        ResponseEntity<JsonNode> entity = restTemplate.postForEntity("/admin/price_rules.json", resource, JsonNode.class);
        return new ResponseEntity<>(mappingSupport.asObject(entity.getBody().get("price_rule"), PriceRule.class),
                entity.getHeaders(), entity.getStatusCode());
    }
}
