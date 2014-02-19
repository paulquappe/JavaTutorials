package com.fakultät;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: jdahlke
 * Date: 10.02.14
 * Time: 11:13
 * To change this template use File | Settings | File Templates.
 */
public class fakultaet {

    public int makeFak(int a) {
        int fak = 1;
        if (a >= 0) {
            while (a > 1) {
                fak = fak * a;
                a = a - 1;
            }
        }
        return fak;
    }


    //konstruktor

    public fakultaet() {

       /* Scanner s = new Scanner(System.in);
        System.out.print("Gib eine (nicht allzu große) Zahl für die Berechnung von Fakultät ein:");
        int a = s.nextInt();
*/
        //System.out.println(makeFak(2));




    }

    //achtung experiment mit scanner, vgl error und auskommetnierten block oben
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Gib eine (nicht allzu große) Zahl für die Berechnung von Fakultät ein:");
        int a = s.nextInt();
        fakultät am1 = new fakultät();
        System.out.println(am1.makeFak(a));


        Scanner s1 = new Scanner(System.in);
        System.out.print("Gib eine (nicht allzu große) Zahl für die Berechnung von Fakultät ein:");
        int a1 = s1.nextInt();



        fakultät am2 = new fakultät();



        //new fakultät();

        //System.out.println(am1.makeFak(a));
        System.out.println(am2.makeFak(a1));


    }
}
