package au.net.woodberry.spring.shopify.model.admin;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "count")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Count {

    private final int count;

    public Count(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
