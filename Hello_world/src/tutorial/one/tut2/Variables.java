package tutorial.one.tut2;

/**
 * Created with IntelliJ IDEA.
 * User: jdahlke
 * Date: 19.02.14
 * Time: 13:39
 * To change this template use File | Settings | File Templates.
 *
 * part 2
 * http://www.youtube.com/watch?v=TLo6ctMPSR4
 */
public class Variables {

    public static void main(String[] args) {
        int zahl1 = 3;
        System.out.println(zahl1);

        int zahl2= 6;
        System.out.println(zahl2);

        int sum = zahl1+zahl2;
        System.out.println(sum);

        //deklariere = erzeugen einer Varibale ohne wertzuweisung
        // initialisieren = weise einer deklarierten varibale einen wert zu

        int zahl3;
        //System.out.println(zahl3);   beachte die fehlermeldung
        // kann man dann später benutzen
        zahl3 = 4;

        System.out.println(zahl3);



    }

}
