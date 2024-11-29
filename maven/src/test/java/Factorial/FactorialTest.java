package Factorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

class FactorialTest {

    @Test
    void test() {
        BigInteger fct = Factorial.calculateFct(3);
        Assertions.assertEquals(new BigInteger(String.valueOf(6)), new BigInteger(String.valueOf(fct)));
    }

    @Test
    void test2() {
        Assertions.assertThrows(ArithmeticException.class, () -> Factorial.calculateFct(-1));
    }

    @Test
    void test3() {
        BigInteger fct = Factorial.calculateFct(0);
        Assertions.assertEquals(new BigInteger(String.valueOf(1)), new BigInteger(String.valueOf(fct)));
    }
}
