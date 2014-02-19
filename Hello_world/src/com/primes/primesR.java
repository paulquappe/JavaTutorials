package com.primes;

/**
 * Created with IntelliJ IDEA.
 * User: jdahlke
 * Date: 04.02.14
 * Time: 10:10
 * To change this template use File | Settings | File Templates.
 */
public class primesR {

    public static boolean isPrime(int n){

        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;

    }





    public static void main ( String [] args){
        System.out.println(isPrime(5));

    }

}
