package com.vocalCount;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: jdahlke
 * Date: 07.02.14
 * Time: 15:35
 * To change this template use File | Settings | File Templates.
 */
public class vocalCount {

    public void reader() throws Exception
    {
        int max = 1500;
        String lines[] = new String[max];

        FileReader fr = new FileReader("C:\\Users\\jdahlke\\Desktop\\IntelliJ_prjcts\\Insel_java_lessons\\Hello_world\\src\\com\\vocalCount\\lorem.txt");
        BufferedReader br = new BufferedReader(fr);

        String d;
        String halter;

        //testvars um die vokale zu zählen, können am ende wohl wieder rausgenommen werden
        String[] voc = {"a","e","i","o","u"};
        String str ="";
        char ch;

        int vokNum = 0;
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;

        int i= 0;
        int numberOfLines = 0;
        int numberOfWordsLine = 0;
        int numberOfWords = 0;
        int numberOfChars = 0;




        while((d=br.readLine()) !=null){

            String[] regexStr;
            int counter = 0;
            lines[i]=d;
            numberOfWordsLine = lines[i].split(" ").length;
            regexStr = new String[numberOfWordsLine];
            regexStr = lines[i].split(" ");
                for(int j=0;j<numberOfWordsLine; j++)
                {
                    counter += regexStr[j].length();
                }

            numberOfWords +=numberOfWordsLine;
            numberOfChars +=counter;
            i++;
            numberOfLines++;


            // pseudo for each in [] voc in br.read do countA-U++

          /*  for(int k=0;k<d.length();k++)
            {
                ch = str.charAt(i);

                if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' ||
                        ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
                    vokNum ++;
            }*/
        }

      /*  while((halter=br1.readLine()) != null){

            for(int k=0;k<halter.length();k++)
            {
                ch = str.charAt(i);

                if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' ||
                        ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
                    vokNum ++;
                System.out.println("Es wurden "+vokNum+" gezahelt.");
        }*/


        System.out.println("********");
        System.out.println("Es wurden "+numberOfLines+" Zeilen und "+numberOfWords+" Woerter und "+numberOfChars+" Zeichen verarbeitet.");
        System.out.println("********");


        br.close();

    }

     public void counterVok() throws Exception
     {
         try
         {
             BufferedReader in;
             String text;
             int lines= 0;
             int count = 0;
             int countA = 0;
             int countE = 0;
             int countI = 0;
             int countO = 0;
             int countU = 0;

             in = new BufferedReader(new FileReader("C:\\Users\\jdahlke\\Desktop\\IntelliJ_prjcts\\Insel_java_lessons\\Hello_world\\src\\com\\vocalCount\\lorem.txt"));

             while((text = in.readLine()) != null){
                // System.out.println(text);
                 text = text.toLowerCase();
                 for(int i = 0; i<text.length(); i++){
                     char c = text.charAt(i);
                     if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                         count++;

                         if(c=='a'){countA++;}
                         if(c=='e'){countE++;}
                         if(c=='i'){countI++;}
                         if(c=='o'){countO++;}
                         if(c=='u'){countU++;}

                     }
                 }
             }

             in.close();





             System.out.println("********");
             System.out.println("Es gibt "+count+" Vokale");
             System.out.println("Haufigkeit des Auftretens: ");
             System.out.println("Es gibt "+countA+" a. Das sind somit "+(getPercent(countA,count))+"% aller Vokale");
             System.out.println("Es gibt "+countE+" e. Das sind somit "+(getPercent(countE,count))+"% aller Vokale");
             System.out.println("Es gibt "+countI+" i. Das sind somit "+(getPercent(countI,count))+"% aller Vokale");
             System.out.println("Es gibt "+countO+" o. Das sind somit "+(getPercent(countO,count))+"% aller Vokale");
             System.out.println("Es gibt "+countU+" u. Das sind somit "+(getPercent(countU,count))+"% aller Vokale");
             System.out.println("********");
        }
         catch(IOException e){
            System.out.println("There was a problem:" + e);

         }
     }

    public float getPercent(int a, int b){

        float prozent;
        prozent= (a*100.0f)/b ;
        return prozent;
    }



    //


    public vocalCount(){
        try {
        reader();
        }
        catch(Exception e){
            System.out.println(e);
        }
        try {
            counterVok();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }




    public static void main(String[] args) {
                   new vocalCount();
    }
}
