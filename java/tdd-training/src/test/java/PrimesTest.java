import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PrimesTest {

    @Test
    public void primes() throws Exception {
        assertPrimes(Primes.of(1), 1);
        assertPrimes(Primes.of(2), 2);
        assertPrimes(Primes.of(4), 2, 2);
        assertPrimes(Primes.of(6), 2, 3);
        assertPrimes(Primes.of(8), 2, 2, 2);
        assertPrimes(Primes.of(9), 3, 3);
        assertPrimes(Primes.of(2 * 3 * 5 * 7 * 11 * 97), 2, 3, 5, 7, 11, 97);
    }

    private void assertPrimes(List<Integer> list, Integer... expected) {
        Assert.assertEquals(Arrays.asList(expected), list);
    }
}