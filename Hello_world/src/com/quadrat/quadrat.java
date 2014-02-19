package com.quadrat;


/**
 * Created with IntelliJ IDEA.
 * User: jdahlke
 * Date: 04.02.14
 * Time: 09:54
 * To change this template use File | Settings | File Templates.
 */
public class quadrat {

    static int quadrat (int n)
    {
        return n*n;
    }

    static void ausgabe (int n){
        String s;
        int i;
        for(i=1;i<=n;i=i+1){
            s = "quadrat("+ i + ")=" + quadrat(i);

            System.out.println(s);

        }
    }

    public static void main (String [] args){
        ausgabe(10);
    }

}
