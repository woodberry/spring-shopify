package au.net.woodberry.spring.shopify.api.client.resource;

import au.net.woodberry.spring.shopify.api.client.ShopifyResource;
import au.net.woodberry.spring.shopify.model.admin.PriceRule;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class PriceRuleResource implements ShopifyResource<PriceRule, PriceRule> {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ObjectMapper mapper;

    @Override
    public ResponseEntity<PriceRule> createNew(PriceRule resource) {
        return restTemplate.postForEntity("/admin/price_rules.json", resource, PriceRule.class);
    }

    @Override
    public void modifyExisting(long id) {
    }

    @Override
    public List<PriceRule> retrieveList() {
        return null;
    }

    @Override
    public PriceRule receiveSingle(long id) {
        return null;
    }

    @Override
    public void remove(long id) {

    }
}
