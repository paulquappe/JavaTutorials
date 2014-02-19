package com.LogicExp;
       // sollte es nicht möglich sein, anstatt alle calc methoden einzlen zu erzeugen alles in einer methode abzuhandeln? problem ist, dass ich immer nur einen return wert habe, vielleicht doch eine void bentuzen?
/**
 * Created with IntelliJ IDEA.
 * User: jdahlke
 * Date: 07.02.14
 * Time: 09:57
 * To change this template use File | Settings | File Templates.
 */
public class LogicExp {

    public boolean calcA(int i, int j, int k){

        //int i=0, j=0, k = 0;


        if(i !=0 && j!=0 && k!=0){
             return  true;
        }
        else return false;
     }

    public boolean calcB(int i){

        if(i%17==0 && i>0){
           return true;
        }
        else return false;
     }

    public boolean calcC(int j){
        if(j%2==0 && j>=20 && j<=40 ){
            return true;
        }
        else return false;
    }

    public boolean calcD(int k){
        if((k%3==0 && k%5==0) || (k%5==0 && k%7==0) || (k%5==0 && k%11==0)){
            return true;
        }
        else return false;
    }
    public boolean calcE(boolean b, boolean c, boolean d){
        if((b && c && d) || (!b && !c && !d)){
            return true;
        }
        else return false;
    }

    public boolean calcF(boolean b, boolean c, boolean d){
        if((b || c || d) || (b && c && d)){
            return true;
        }
        else return false;


    }


    //Konstruktor
    public LogicExp(){

        System.out.println("calcA: "+calcA(1, 2, 3));
        System.out.println("calcB: "+calcB(34));
        System.out.println("calcC: " +calcC(22));
        System.out.println("calcD: " +calcD(2));
        System.out.println("calcE: "+ calcE(false, true, true));
        System.out.println("calcF: "+ calcF(false, false, false));
    }


    public static void main(String[] args) {
        new LogicExp();
    }


}
