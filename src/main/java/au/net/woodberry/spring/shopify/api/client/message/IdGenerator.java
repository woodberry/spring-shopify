package au.net.woodberry.spring.shopify.api.client.message;

public class IdGenerator {

    private static final long LEFT_LIMIT = 1000000000L;
    private static final long RIGHT_LIMIT = 9999999999L;

    private IdGenerator(){}

    /**
     * @return A random-enough id.
     */
    public static long generate() {
        return LEFT_LIMIT + (long) (Math.random() * (RIGHT_LIMIT - LEFT_LIMIT));
    }
}
