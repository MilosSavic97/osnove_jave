package domaci13_12_2022;


import javax.print.attribute.standard.OrientationRequested;

public class Zadatak1 {
    public static void main(String[] args) {
        /* Napisati program koji stampa verziju softvera. Verzija softvera
        se sastoji od major, minor i patch brojeva.
        Koristan link za verzionisanje softvera. Odstampati na ekranu verziju softvera u formatu:
        [MAJOR].[MINOR].[PATCH]
*/
       //LAKSI NACIN  System.out.println("Current JVM version - " + System.getProperty("java.version"));

        //OR
        int major = 19;
        int minor = 0;
        int patch = 1;
        System.out.println("Software version is "+ major+ "." +minor +"."+patch);


    }
}
