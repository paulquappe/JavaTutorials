package com.Lotto;


/**
 * Created with IntelliJ IDEA.
 * User: jdahlke
 * Date: 06.02.14
 * Time: 16:55
 * To change this template use File | Settings | File Templates.
 */
public class Lotto {

    public void ziehung(){

        int rounds = 6;
        int num;
        int counter=0;

        for(int i = 0; i<rounds; i++){
             num = (int) (Math.random() *49);
             counter ++;
            System.out.println("Durchlauf Nummer " + counter+ ". Die Zahl ist:" +num );

        }
     }

        // konstruktor
    public Lotto(){
        ziehung();
    }


    public static void main(String[] args) {
                new Lotto();
    }

}
