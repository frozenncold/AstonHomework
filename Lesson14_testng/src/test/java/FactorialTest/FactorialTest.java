package FactorialTest;

import org.Factorial.Factorial;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;

public class FactorialTest {
    @Test
    void test() {
        BigInteger fct = Factorial.calculateFct(3);
        Assert.assertEquals(new BigInteger(String.valueOf(6)), new BigInteger(String.valueOf(fct)));
    }

    @Test
    void test2() {
        Assert.assertThrows(ArithmeticException.class, () -> Factorial.calculateFct(-1));
    }

    @Test
    void test3() {
        BigInteger fct = Factorial.calculateFct(0);
        Assert.assertEquals(new BigInteger(String.valueOf(1)), new BigInteger(String.valueOf(fct)));
    }
}
