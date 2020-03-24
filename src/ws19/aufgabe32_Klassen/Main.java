package ws19.aufgabe32_Klassen;
import java.util.Scanner;

class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        /** SET NUMBER OF PERSONS */
        System.out.print("Anzahl der Personen: ");
        Personen[] p = new Personen[scan.nextInt()];
        System.out.println("*".repeat(50));

        /** READ ARRAY PERSONS */
        for(int i = 0; i < p.length; i++) {
            System.out.println("Daten für Person" + (i+1) + " eingeben: ");
            p[i] = new Personen();
            p[i].read();
            System.out.println("*".repeat(80));
            System.out.println();
        }

        /** PRINT ARRAY PERSONS */
        for(int i = 0; i < p.length; i++){
            System.out.println("Person" + i + ":");
            p[i].print();
            System.out.println("*".repeat(80));
            System.out.println();
        }

        /** IF PNR PERSONS */
t:       while(true){
           for(int i = 0; i < p.length; i++){
               System.out.println("Personalnummer eingeben: ");
               if(p[i].isNr(scan.nextInt())){
                   p[i].print();
                   break t;
               }
           }
       }
    }
}