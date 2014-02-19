package com.SatelliteTime;

/**
 * Created with IntelliJ IDEA.
 * User: jdahlke
 * Date: 06.02.14
 * Time: 10:14
 * To change this template use File | Settings | File Templates.
 */
public class SatelliteTime {


    public void calc (int n){

        // final weil, die int zur laufzeit nicht mehr verändert werden soll // final kann auch bei emthoden verwendet werden

        final int totalSec = n ;
        final int days = totalSec / 84600;
        int rest = totalSec % 86400;
        final int hours = rest / 3600;
        rest = rest%3600;
        final int minutes = rest / 60;
        rest = rest % 60;
        final int seconds = rest;

          // hier prin
       System.out.printf("%d days %d hours %d minutes %d seconds %n", days, hours, minutes, seconds);

    }


    //konstruktor
    public SatelliteTime() {
        calc(10000);
    }


    public static void main(String[] args) {


                new SatelliteTime();
    }
}
