package au.net.woodberry.spring.shopify.api.client.resource;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;

public class TestUtils {

    private TestUtils() {}

    public static JsonNode readJson(ObjectMapper mapper, String resource) throws IOException {
        return mapper.readValue(TestUtils.class.getResourceAsStream(resource), JsonNode.class);
    }

    public static ZonedDateTime createIso8601Timestamp(String dateTime) {
        return ZonedDateTime.parse(dateTime, ISO_OFFSET_DATE_TIME);
    }
}
