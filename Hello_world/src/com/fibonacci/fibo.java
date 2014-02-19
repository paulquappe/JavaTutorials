package com.fibonacci;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * Created with IntelliJ IDEA.
 * User: jdahlke
 * Date: 05.02.14
 * Time: 14:40
 * To change this template use File | Settings | File Templates.
 */
/*
public class fibo {

       // prüfe ob die zahl gerade oder ungerade ist    if (x % 2) {  x is odd *//*
 }
       // hiermit kann ich rekursiv die fibonacci folge einer bestimmten zahl ausgeben,
       // allerdings muss ich wahrscheinlich iterativ vorgehen, da ich ja alle zahlen in einer arraylist vorhalten muss,
       // um zu prüfen ob sie even oder uneven sind und diesen dann als summe zusammefassen



    static int compute (int i){
        if(i<=0){return 0;}
        else if(i==1){return 1;}
        else{
            return compute(i-2)+compute(i-1);
        }
}


    public static void main (String[] args) throws Exception
    {

        System.out.println("Enter number:");

        BufferedReader r=new BufferedReader(
                new InputStreamReader(System.in));

        String aLine=r.readLine();

        int n=Integer.parseInt(aLine);

        int result=compute(n);

        System.out.println("Fib("+n+")="+result);
    }
}
*/

    // hier iterativ aber nochmals neuer versuch, da die eingabe von n=4000000 nicht der aufgabe entspricht, da ja das result in halter maxmimal so groß sein darf
/*
public class fibo {


    ArrayList <Integer> halter = new ArrayList<Integer>();
    int sum = 0;

    static int compute(int n){
        if(n<=0){return 0;}
        else if(n==1){return 1;}
        else{
            int a=0;
            int b=1;
            int i = 2;

                while(i<=n){
                    int aa= b;
                    int bb = a+b;
                    a= aa;
                    b=bb;
                    i++;
                }
            return b;
             }

    }

    public static void main (String[] args) throws Exception
    {

        System.out.println("Enter number:");

        BufferedReader r=new BufferedReader(
                new InputStreamReader(System.in));

        String aLine=r.readLine();

        int n=Integer.parseInt(aLine);

        int result=compute(n);

        System.out.println("Fib("+n+")="+result);
    }

}
*/

/*
public class fibo{


    public static int compute(){

        int sum = 0;
        int fibNum = 0;
        ArrayList <Integer> fibList = new ArrayList<Integer>();
        ArrayList <Integer> evenNumsFibList = new ArrayList<Integer>();



         while(fibNum < 144){
             int lastValue =  fibList.get(fibList.size()-1);
             int secondToLastValue =  fibList.get(fibList.size()-2);

             fibNum = secondToLastValue + lastValue;

             if (fibNum < 144)
             {
                 fibList.add(fibNum);
             }
         }

        for(int i = 0; i<fibList.size(); i++){
            if  (fibList.get(i) % 2 == 0)
            {
                evenNumsFibList.add(fibList.get(i));
            }
        }

        for (int i = 0; i < evenNumsFibList.size(); i++)
        {
            sum +=  evenNumsFibList.get(i);
        }
              return sum;

    }

    public static void main(String[] args) {
        System.out.println(compute());
    }

}*/
public class fibo{


public static void main(String args[]) {

int fib1 = 1;
int fib2 = 1;
int fib3;
int sum = 0;
while ((fib3 = fib1 + fib2) < 4000000) {
        if (fib3 % 2 == 0) sum += fib3;
fib1 = fib2;
fib2 = fib3;
}
        System.out.println(sum);
}
}