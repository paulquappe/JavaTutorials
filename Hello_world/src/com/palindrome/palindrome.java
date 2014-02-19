package com.palindrome;

/**
 * Created with IntelliJ IDEA.
 * User: jdahlke
 * Date: 05.02.14
 * Time: 16:43
 * To change this template use File | Settings | File Templates.
 */
public class palindrome {

              //constructor benutzen um neue instanzen der objekte zu erzeugen

           // http://projecteuler.net/problem=4


    public static void main(String[] args) {
       // ermittle das größtmöglich produkt aus 2 mal 3 stellen 999*999
        int zahl = 999*999;


         IsPalindrome isP = new IsPalindrome();



        isP.runtime();

    }

}
