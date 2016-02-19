import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Primes {


    public static List<Integer> of(int i) {
        if (i == 1) return Arrays.asList(1);

        List<Integer> integers = new ArrayList<Integer>();
        for (int divisor = 2; divisor <= i; ++divisor) {
            for (; i % divisor == 0; i /= divisor) {
                integers.add(divisor);
            }
        }
        return integers;
    }
}
