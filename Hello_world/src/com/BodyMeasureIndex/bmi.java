package com.BodyMeasureIndex;

/**
 * Created with IntelliJ IDEA.
 * User: jdahlke
 * Date: 06.02.14
 * Time: 16:17
 * To change this template use File | Settings | File Templates.
 */



 // beachte die aufgaben stellung mit der expliziten typkonversion // man sollte also wohl nicht math round nutzen
public class bmi {
                            //gewicht = n, größe = m
    public void calc(double n, double m){

        double bmi = n/(m*m);
        //bmi = Math.round(bmi);

                                                // hier findet die explizite typkonversion statt (typeOf)
        System.out.println("dein BMI ist:" + (int)bmi);
    }

    // wie kann man console.readline benutzen in java?

    public bmi(){
        calc(75, 1.84);
    }

    public static void main(String[] args) {

        new bmi();

    }


}
