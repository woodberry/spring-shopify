package au.net.woodberry.spring.shopify.api.client.resource;

import au.net.woodberry.spring.shopify.api.client.message.MappingSupport;
import au.net.woodberry.spring.shopify.model.admin.AbandonedCheckout;
import au.net.woodberry.spring.shopify.model.admin.Count;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class AbandonCheckoutsResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private MappingSupport mappingSupport;
    
    public ResponseEntity<Count> getCount(Count.QueryFilter queryFilter) {
        String url = "/admin/checkouts/count.json" + "?" + mappingSupport.convertParams(queryFilter);
        ResponseEntity<JsonNode> entity = restTemplate.getForEntity(url, JsonNode.class);
        return new ResponseEntity<>(mappingSupport.asObject(entity.getBody().get("count"), Count.class),
                entity.getHeaders(), entity.getStatusCode());
    }

    public ResponseEntity<List<AbandonedCheckout>> retrieveList() {
        ResponseEntity<JsonNode> entity = restTemplate.getForEntity("/admin/checkouts.json", JsonNode.class);
        return new ResponseEntity<>(mappingSupport.asList(entity.getBody().get("checkouts"), AbandonedCheckout.class),
                entity.getHeaders(), entity.getStatusCode());
    }
}
