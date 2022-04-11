import junit.framework.Assert;
import lruCache.LruCacheImpl;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class LruCacheTest {

    @SuppressWarnings("deprecation")
    @Test
    public void getSetTest() {
        LruCacheImpl<Integer, Integer> cache = new LruCacheImpl<Integer, Integer>();

        cache.set(1, 4);
        Assert.assertEquals((int)cache.get(1), 4);

        cache.set(2, 13);
        cache.set(3, 25);
        cache.set(4, 90);

        assertNull(cache.get(1));
    }

    @Test
    public void getSizeTest() {
        LruCacheImpl<Integer, Integer> cache = new LruCacheImpl<Integer, Integer>();

        cache.set(1, 5);
        cache.set(2, 10);

        assertEquals(cache.getSize(), 2);
    }

    @Test
    public void getMaxSizeTest() {
        LruCacheImpl<Integer, Integer> cache = new LruCacheImpl<Integer, Integer>();

        assertEquals(cache.getLimit(), 3);
    }

    @Test
    public void getTest() {
        LruCacheImpl<Integer, Integer> cache = new LruCacheImpl<Integer, Integer>();
        cache.set(1, 5);

        assertEquals((int)cache.get(1), 5);
    }
}
