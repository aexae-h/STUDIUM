package ws19.aufgabe36_Personen;


import java.util.Scanner;

class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        setArrayPersonen();
    }

    private static void setArrayPersonen (){

        Personen[] persons = new Personen[3000];
        // convert persons to string

        System.out.println("*".repeat(46));
        System.out.println("* Personalnummer - Name - Postleitzahl - Ort *");
        System.out.println("*".repeat(46));

        for (int i = 0; i < persons.length; i++){

            System.out.println("Daten für Person" + i + " eingeben:");
            persons[i] = new Personen(scan.nextInt(),scan.next(),scan.nextInt(),scan.next());
            System.out.println("Pnr: " + persons[i].getPnr() +  "\nName: " + persons[i].getName() + "\nZip: " + persons[i].getZip() + "\nOrt: " + persons[i].getOrt());
            System.out.println();
        }
    }
}