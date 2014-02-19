package com.largestPrime;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: jdahlke
 * Date: 05.02.14
 * Time: 16:10
 * To change this template use File | Settings | File Templates.
 */
public class largestPrime {

    public static boolean isPrime(int n) {
        // sieb des erostheos um von vorherein schon alle / 2 zahlen auschließen zu können

        if (n == 2) return true;
        if (n % 2 == 0 || n == 1) return false;
        long limit = (long)Math.sqrt(n);
        for (int i = 3; i <= limit; i += 2)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String args[]) {
        // http://docs.oracle.com/javase/7/docs/api/java/lang/Long.html#parseLong(java.lang.String)
        long n = Long.parseLong("600851475143");
        int max = 0;
        while (n != 1) {
            int i = 2;
            while (i <= n) {
                if (isPrime(i) && n % i == 0) {
                    if (i > max) max = i;
                    n /= i;
                    break;
                }
                ++i;
            }
        }
        System.out.println(max);
    }


}
