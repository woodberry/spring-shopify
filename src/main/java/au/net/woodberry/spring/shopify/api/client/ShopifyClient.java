package au.net.woodberry.spring.shopify.api.client;

import au.net.woodberry.spring.shopify.api.client.message.IdGenerator;
import au.net.woodberry.spring.shopify.api.client.resource.AbandonCheckoutsResource;
import au.net.woodberry.spring.shopify.api.client.resource.DiscountCodeResource;
import au.net.woodberry.spring.shopify.api.client.resource.PriceRuleResource;
import au.net.woodberry.spring.shopify.model.admin.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;

@SpringBootApplication(scanBasePackages = "au.net.woodberry.spring.shopify")
@Component
public class ShopifyClient {

    @Autowired
    private PriceRuleResource priceRuleResource;

    @Autowired
    private DiscountCodeResource discountCodeResource;

    @Autowired
    private AbandonCheckoutsResource abandonCheckoutsResource;

    public PriceRuleResource getPriceRuleResource() {
        return priceRuleResource;
    }

    public DiscountCodeResource getDiscountCodeResource() {
        return discountCodeResource;
    }

    public AbandonCheckoutsResource getAbandonCheckoutsResource() {
        return abandonCheckoutsResource;
    }

    public static void main(String... args) {
        ConfigurableApplicationContext app = SpringApplication.run(ShopifyClient.class, args);
        ShopifyClient shopify = app.getBean(ShopifyClient.class);

        PriceRule priceRule = new PriceRule();
        priceRule.setCreatedAt(ZonedDateTime.now());
        priceRule.setId(IdGenerator.generate());
        priceRule.setTitle("FREE_SHIPPING_TEST_2");
        priceRule.setTargetType(TargetType.SHIPPING_LINE);
        priceRule.setTargetSelection(TargetSelection.ALL);
        priceRule.setAllocationMethod(AllocationMethod.EACH);
        priceRule.setValueType(ValueType.PERCENTAGE);
        priceRule.setValue(-100);
        priceRule.setOncePerCustomer(true);
        priceRule.setUsageLimit(1);
        priceRule.setCustomerSelection(CustomerSelection.ALL);
        priceRule.setStartsAt(ZonedDateTime.now());
        priceRule.setEndsAt(ZonedDateTime.now().plusWeeks(1));

//        ResponseEntity<PriceRule> priceRuleCreated = shopify.getPriceRuleResource().createNew(priceRule);
//        shopify.getDiscountCodeResource().createNew(DiscountCode.from(priceRuleCreated.getBody()));

        shopify.getAbandonCheckoutsResource().retrieveList();
    }
}
