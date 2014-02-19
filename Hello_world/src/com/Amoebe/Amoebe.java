package com.Amoebe;

/**
 * Created with IntelliJ IDEA.
 * User: jdahlke
 * Date: 10.02.14
 * Time: 09:48
 * To change this template use File | Settings | File Templates.
 */


/*------------------------------------------------------------------------------------------------
        4i. Amöben

        Die Klasse Amoeba repräsentiert eine Amöbe, ein mikroskopisch kleines
        Lebewesen. Für diese Aufgabe sind zwei Eigenschaften von Amöben
        interessant: das unveränderliche Geschlecht (weiblich oder männlich) und
        die veränderliche Größe (ganzzahlig, positiv). Definieren Sie die Klasse
        Amoeba mit den folgenden Methoden:

        Amoeba(boolean f) Konstruktor für eine neue weibliche (Aufruf mit
        true) oder männliche (false) Amöbe der Größe 1.

        boolean isFemale() Getter für das Geschlecht (Ergebnis true =
        weiblich, false = männlich).

        int getSize() Getter für die Größe.

        Amoeba feed() füttert diese Amöbe, die dabei um 1 wächst. Gibt diese
        Amöbe zurück.

        Amoeba hunger() lässt diese Amöbe hungern, die dabei um 1 schrumpft.
        Die Mindestgröße ist 1. Auch wenn eine Amöbe hungert, wird sie nicht
        mehr kleiner als 1. Gibt diese Amöbe zurück.

        String toString() Definieren Sie die Methode folgendermaßen:

public String toString() {
        return String.format("Amoeba(%c,%d)", isFemale()? 'f': 'm', getSize());
}

        Amoeba split() Diese Amöbe versucht eine neue Amöbe abzuspalten, die
        als Ergebnis zurückgeliefert wird. Wenn diese Amöbe kleiner als 5
        ist, ist sie zu klein zum Teilen und verändert sich nicht. Der
        Rückgabewert ist in diesem Fall null. Die neue Amöbe hat das gleiche
        Geschlecht und die halbe Größe (abgerundet) wie diese Amöbe. Diese
        Amöbe schrumpft dabei um die Größe der neuen, abgespaltenen Amöbe.
        Die Summe der Größen bleibt also gleich.

        Amoeba join(Amoeba other) Diese Amöbe vereinigt sich mit der anderen
        Amöbe other und produziert eine neue Amöbe, die als Ergebnis
        zurückgegeben wird. Wenn zwei Amöben das gleiche Geschlecht oder die
        gleiche Größe haben, mögen sie sich nicht vereinigen. In diesem Fall
        ist das Ergebnis null. Andernfalls entsteht eine neue Amöbe der
        Größe 1 mit dem gleichen Geschlecht, wie die größere Eltern-Amöbe.
        Die Eltern-Amöben bleiben unverändert.

        Amoeba attack(Amoeba enemy) Diese Amöbe greift die andere Amöbe enemy
        an. Wenn beide Amöben männlich (weibliche Amöben haben andere Mittel
        und Wege, um sich auseinanderzusetzen) und unterschiedlich groß
        sind, dann schrumpft die kleinere Amöbe auf Größe 1. Die andere
        wächst entsprechend an. Die Summe der Größen bleibt also gleich.
        Andernfalls geschieht nichts. Die Methode gibt diese Amöbe zurück.

        ------------------------------------------------------------------------------------------------*/






//bei dieser aufgabe scheitere ich noch daran: wie erzeugt man eine neue insnaz der klasse amoebe in einer methode .split ? syntax problem beim bennennen, vielleicht braucht man ein dynamisches array in dem die
    // amöben gesammelt werden
public class Amoebe {

    private int size=1;
    private boolean isFemale;

    int counter=1;


    public boolean getGender(){
        return isFemale;
    }

    public void setGender(boolean a){
        isFemale = a;
    }


         //immer bei return getXYZ nennen
    public int getSize(){
        return size;
    }
               //kein rückgabetype deswegen void
    public void setBreite(int b){
         size= b;
    }

    public int amFeed(){
       return size +=1;
    }

    public int amHunger(){
        if(size>1)
        {return size -=1;}
        else{return size=1;}
    }


    public Amoebe amSplit(){


       if(getSize()>=5){
         new Amoebe ();

       }
       return new Amoebe();

    }

    public String toString() {
        return String.format("Amoeba(%c,%d)", getGender()? 'f': 'm', getSize());
    }


}
