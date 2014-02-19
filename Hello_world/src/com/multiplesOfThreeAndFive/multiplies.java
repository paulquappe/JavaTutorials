package com.multiplesOfThreeAndFive;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: jdahlke
 * Date: 05.02.14
 * Time: 11:56
 * To change this template use File | Settings | File Templates.
 */
public class multiplies {






    public static void result(){
        int sum = 0;
        ArrayList <Integer> halter = new ArrayList<Integer>();
        int number = 1000;

     for(int i = 0; i<number ; i++ ){
         if(i%3==0 || i%5==0){
             halter.add(i);
             System.out.println("ausgabe1 "+i);
         }
     }

     for(int k:halter){

         sum += k;

         System.out.println("ausgabe2 "+sum);
     }
    }

    public static void main ( String [] args){
       result();

    }
}
