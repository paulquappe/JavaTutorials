package com.strings;
import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: jdahlke
 * Date: 05.02.14
 * Time: 11:21
 * To change this template use File | Settings | File Templates.
 */
public class string {

    public static void main(String[] args) throws IOException {
        String text;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Eingabe :");
        text = input.readLine();
        System.out.println("Ausgabe: "+text);


    }

}
