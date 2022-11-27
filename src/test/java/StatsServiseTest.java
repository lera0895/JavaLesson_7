
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import java.util.Collections;

public class StatsServiseTest {

    @Test
    public void shouldSum() {
        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        StartsServise servise = new StartsServise();

        long actual = servise.sum(sales);
        long expected = 9 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldMax() {
        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        StartsServise servise = new StartsServise();

        long actual = servise.maxSales(sales);
        long expected = 8;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldMin() {
        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        StartsServise servise = new StartsServise();

        long actual = servise.minSales(sales);
        long expected = 9;
        Assertions.assertEquals(expected, actual);

    }
}
