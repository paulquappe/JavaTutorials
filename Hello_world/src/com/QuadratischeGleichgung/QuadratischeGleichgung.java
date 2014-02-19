package com.QuadratischeGleichgung;

/**
 * Created with IntelliJ IDEA.
 * User: jdahlke
 * Date: 06.02.14
 * Time: 17:17
 * To change this template use File | Settings | File Templates.
 */
public class QuadratischeGleichgung {

    public void calc(double a, double b, double c){

                //diskriminante  bestimmen !! achtung, es gibt unterschiedliche definitionen
        double d= (b*b) - (4*a*c);
        double x1;
        double x2;

        if(d<0){
            System.out.println("Es existiert keine reele Lösung.");
        }

        else if(d==0){
            x1 = (-b)/(2*a);
            System.out.println("Es existiert eine (reele) Lösung für die Gleichung: und x1 ist "+x1);

        }
        else if(d>0){
            x1=  (-b)/(2*a)-(StrictMath.sqrt(d));
            x2=  (-b)/(2*a)+(StrictMath.sqrt(d));

            System.out.println("Es existieren zwei (reele) Lösungen für die Gleichung. x1 ist: "+x1+" x2 ist: "+x2);
        }


        /*double x1 = (-b)+ (Math.sqrt((b*b)-(4*a*c)))/(2*a);
        double x2 = (-b)- (Math.sqrt((b*b)-(4*a*c)))/(2*a);


        System.out.println("x1 ist "+ (int)x1);
        System.out.println("x2 ist "+ (int)x2);*/

    }


    public QuadratischeGleichgung(){

        calc(5,6,5.2);
        calc(0,2,1);
        calc(1,-4,4);
        calc(1,2,15);

    }

    public static void main(String[] args) {

        new QuadratischeGleichgung();

    }


}
