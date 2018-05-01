package au.net.woodberry.spring.shopify.model.admin;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.time.ZonedDateTime;

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

    /**
     * An object that can be used to filter the results of a query
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class QueryFilter {

        private long sinceId;
        private ZonedDateTime createdAtMin;
        private ZonedDateTime createdAtMax;
        private ZonedDateTime updatedAtMin;
        private ZonedDateTime updatedAtMax;
        private Status status;

        public long getSinceId() {
            return sinceId;
        }

        public void setSinceId(long sinceId) {
            this.sinceId = sinceId;
        }

        public ZonedDateTime getCreatedAtMin() {
            return createdAtMin;
        }

        public void setCreatedAtMin(ZonedDateTime createdAtMin) {
            this.createdAtMin = createdAtMin;
        }

        public ZonedDateTime getCreatedAtMax() {
            return createdAtMax;
        }

        public void setCreatedAtMax(ZonedDateTime createdAtMax) {
            this.createdAtMax = createdAtMax;
        }

        public ZonedDateTime getUpdatedAtMin() {
            return updatedAtMin;
        }

        public void setUpdatedAtMin(ZonedDateTime updatedAtMin) {
            this.updatedAtMin = updatedAtMin;
        }

        public ZonedDateTime getUpdatedAtMax() {
            return updatedAtMax;
        }

        public void setUpdatedAtMax(ZonedDateTime updatedAtMax) {
            this.updatedAtMax = updatedAtMax;
        }

        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }
    }
}
