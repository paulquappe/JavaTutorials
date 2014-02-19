package com.Amoebe;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: jdahlke
 * Date: 10.02.14
 * Time: 15:39
 * To change this template use File | Settings | File Templates.
 */
public class Einstieg {


    public Einstieg(){
        ArrayList<Amoebe> list1 = new ArrayList<Amoebe>();
        Amoebe am1 = new Amoebe();
        Amoebe am2 = new Amoebe();

        list1.add(am1);
        list1.add(am2);


        am1.setBreite(5);
        am1.setGender(true);
        am1.amFeed();

        am2.setBreite(6);
        am2.setGender(false);
        am2.amFeed();
        am2.amFeed();
        am2.amFeed();

        list1.add(am1.amSplit());


        System.out.println(am1.getSize());
        System.out.println(am1.getGender());
        System.out.println(list1.size());
        System.out.println(am1.toString());
        System.out.println(am2.toString());






    }





    public static void main(String[] args) {

          new Einstieg();




        /*Amoebe am = new Amoebe();
        am.setGender(true);
        am.setBreite(10);
        am.amFeed();
        am.amHunger();

        System.out.println(am.getGender());
        System.out.println(am.getSize());*/

    }

}
