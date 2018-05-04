package au.net.woodberry.spring.shopify.api.client.resource;

import au.net.woodberry.spring.shopify.model.admin.AbandonedCheckout;
import au.net.woodberry.spring.shopify.model.admin.Count;
import au.net.woodberry.spring.shopify.model.admin.Status;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.List;

import static au.net.woodberry.spring.shopify.api.client.resource.TestUtils.createIso8601Timestamp;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.mockito.AdditionalMatchers.eq;
import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AbandonCheckoutsResourceTest {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ObjectMapper mapper;

    @Autowired
    private AbandonCheckoutsResource resource;
    private MockRestServiceServer mockedShopifyServer;

    @Before
    public void beforeTest() {
        this.mockedShopifyServer = MockRestServiceServer
                .bindTo(restTemplate)
                .bufferContent()
                .build();
    }

    @Test
    public void testGetCount() throws IOException {
        JsonNode response = TestUtils.readJson(mapper, "/admin/checkouts/count.json");

        mockedShopifyServer.expect(requestTo(endsWith("/admin/checkouts/count.json?since_id=0")))
                .andExpect(method(HttpMethod.GET))
                .andRespond(withSuccess(response.toString(), MediaType.APPLICATION_JSON));

        ResponseEntity<Count> count = resource.getCount(new Count.QueryFilter());
        assertThat(count.getBody()).isNotNull();
        assertThat(count.getBody().getCount()).isEqualTo(119);
        mockedShopifyServer.verify();
    }

    @Test
    public void testGetCountWithQueryFilter() throws IOException {

        final String timestamp = "2011-12-03T10:15:30+01:00";
        final ZonedDateTime zdt = createIso8601Timestamp(timestamp);

        Count.QueryFilter filter = new Count.QueryFilter();
        filter.setStatus(Status.OPEN);
        filter.setCreatedAtMax(zdt);
        filter.setCreatedAtMin(zdt);
        filter.setSinceId(1000);
        filter.setUpdatedAtMax(zdt);
        filter.setUpdatedAtMin(zdt);

        JsonNode response = TestUtils.readJson(mapper, "/admin/checkouts/count.json");

        String expectedRequest = "/admin/checkouts/count.json?since_id=1000" +
                "&created_at_min=2011-12-03T10:15:30+01:00" +
                "&created_at_max=2011-12-03T10:15:30+01:00" +
                "&updated_at_min=2011-12-03T10:15:30+01:00" +
                "&updated_at_max=2011-12-03T10:15:30+01:00" +
                "&status=open";
        mockedShopifyServer.expect(requestTo(endsWith(expectedRequest)))
                .andExpect(method(HttpMethod.GET))
                .andRespond(withSuccess(response.toString(), MediaType.APPLICATION_JSON));

        resource.getCount(filter);
        mockedShopifyServer.verify();
    }

    @Test
    public void testRetrieveList() throws IOException {
        JsonNode response = TestUtils.readJson(mapper, "/admin/checkouts/abandoned-checkouts.json");

        mockedShopifyServer.expect(requestTo(endsWith("/admin/checkouts.json")))
                .andExpect(method(HttpMethod.GET))
                .andRespond(withSuccess(response.toString(), MediaType.APPLICATION_JSON));

        ResponseEntity<List<AbandonedCheckout>> retrieveList = resource.retrieveList();
        assertThat(retrieveList.getBody()).isNotNull();
        assertThat(retrieveList.getBody())
                .hasSize(2)
                .extracting("id")
                .containsOnly(358330204170L, 412087877642L);
        mockedShopifyServer.verify();
    }
}
