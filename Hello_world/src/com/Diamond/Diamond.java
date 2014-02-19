package com.Diamond;

/**
 * Created with IntelliJ IDEA.
 * User: jdahlke
 * Date: 14.02.14
 * Time: 09:32
 * To change this template use File | Settings | File Templates.
 */
public class Diamond {

    public static void main(String[] args) {


        int h = 5;
        int b = 1;

        for (int i = 1; i < h; i++) {
            String s = "";
            for (int j = 0; j < (h - i); j++) {
                s += ".";
            }
            for (int j = 0; j <= b; i++) {
                s += "+";
            }
            for (int j = 0; j <= (h - i); j++) {
                s += ".";
            }
            b += 2;
            System.out.println(s);
        }
    }

}
