package com.Zahlenraten;

import java.util.Scanner;


/**
 * Created with IntelliJ IDEA.
 * User: jdahlke
 * Date: 07.02.14
 * Time: 14:52
 * To change this template use File | Settings | File Templates.
 */
public class Zahlenraten {

    public static void main(String[] args) {

        int counter = 1;
        double zahl = (int)(Math.random() * 100);

        System.out.println("Willkommen! Bitte rate eine Zahl zwischen 1 und 100.");
        System.out.println(counter+". Versuch:");
        Scanner input = new Scanner(System.in);
                   // wie macht man den input zu type oif int?
        int input1 = input.nextInt();


        do {

            if(input1 > zahl ){
                counter ++;
                System.out.println("Meine Zahl ist kleiner als "+input1);
                System.out.println(counter+". Versuch:");
                input = new Scanner(System.in);
                input1 = input.nextInt();

            }
            else if(input1< zahl){
                counter++;
                System.out.println("Meine Zahl ist grö0er als "+input1);
                System.out.println(counter+". Versuch:");
                input = new Scanner(System.in);
                input1 = input.nextInt();
            }
            /*else *//*if(input1==zahl)*//*{
                System.out.println("Glückwunsch! Du hast meine Zahl beim "+counter+ ". Versuch erraten!");
                }*/

        }
        while(input1 !=  zahl);
        System.out.println("Glückwunsch! Du hast meine Zahl beim "+counter+ ". Versuch erraten!");
    }

}
