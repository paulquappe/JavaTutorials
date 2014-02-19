package com.Tree;

/**
 * Created with IntelliJ IDEA.
 * User: jdahlke
 * Date: 07.02.14
 * Time: 12:04
 * To change this template use File | Settings | File Templates.
 */
public class TreeEx {

    public static void main(String[] args) {
        /*         // anzhal felder
         int zahl = 9;
                        //5 ist anzahl reihen
        for(int i =1;i<=(zahl/2);i++){
            String s ="";
            for(int j = 0; j<(zahl-2); j++)
            {
                s += ".";
            }
            for(int k = 1; k<=i; k++ ){
                    s += "+";
            }
           for(int k = 1; k<=i; k++ ){
               // \escapen
                s += ".";
            }
         System.out.println(s);
        }*/

       /* for (int i = 1; i <=5; i++)

        {

            for (int j = 1; j <= (9/2 - i); j++)

            System.out.print(".");

            for (int j = 1; j<= i; j++)

            System.out.print("+");

            for (int j = (i - 1); j >= 1; j--)

            System.out.print("+");

            for (int j = (i - 1); j >= 1; j--)

                System.out.print(".");

            System.out.println();

        }*/


        int height = 5;
        int baum = 1;

        // lösung mit alex h.
        //
        for( int i = 1; i<=height; i++){
            String s ="";
             for(int i2 = 0; i2<((height-i)); i2++){
               s+=".";
             }
             for(int i2 = 1; i2<=baum; i2++){
                s+="*";
            }
            for(int i2 = 1; i2<=((height-i)); i2++){
                s+=".";
            }
            baum +=2;
         System.out.println(s);
        }
    }
}
