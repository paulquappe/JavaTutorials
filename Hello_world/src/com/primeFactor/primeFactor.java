package com.primeFactor;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: jdahlke
 * Date: 07.02.14
 * Time: 14:17
 * To change this template use File | Settings | File Templates.
 */
public class primeFactor {

    public static void main(String args[]) {
        System.out.print("Gib eine Zahl zur Faktorisierung ein: ");
        Scanner input = new Scanner(System.in);
                           //methode has Long next anschauen

        while (input.hasNextLong()) {
            long n = input.nextLong();  // get a number to factor
            System.out.print("Primfaktoren von " + n + " :");
            printPrimeFactorsOf(n);
            System.out.println("\n");
            break;
           // System.out.print("Gib eine neue Zahl zur Faktorisierung ein: ");
        }
    }

    public static void printPrimeFactorsOf(long n) {
        long d; // candidate divisor of n

        if (n > 1) { // No prime factors if not > 1.
            // Search for the smallest divisor d of n, where d > 1.
            // Note that this divisor must be prime.

            // For-loop uses an empty body to search for smallest divisor.
            for (d = 2; n % d > 0; d++)
                ;

            // We found a divisor d, which is the smallest remaining prime
            // factor.
            System.out.print(d + " ");

            printPrimeFactorsOf(n / d); // factor what remains
        }
    }

}
