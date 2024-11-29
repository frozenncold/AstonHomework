package Factorial;

import java.math.BigInteger;

public class Factorial {

    public static BigInteger calculateFct(int a) {
        BigInteger ans = BigInteger.ONE;
        if (a < 0) {
            throw new ArithmeticException("Вы ввели отрицательный факториал");
        } else {
            for (long i = 2; i <= a; i++) {
                ans = ans.multiply(BigInteger.valueOf(i));
            }
        }
        return ans;
    }
}
