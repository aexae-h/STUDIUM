package ws20.aufgabe9_treeZeile;

import java.util.Scanner;

public class Zeile {
    static Scanner scanner = new Scanner(System.in);

    Teilzeile root;

    Zeile(String s) {
        root = Teilzeile.createTeilzeile(s);
    }

    // Ausgabe der Zeile -> Aufruf objektorientiert
    private String printZeile() {
        return root.printZeileOO();
    }

    // Ausgabe der Struktur -> Aufruf objektorientiert
    private String printStruktur() {
        return "||"+ root.printStrukturOO() + "|";
    }

    // Instanziieren einer Zeile über Scanner
    private static Zeile newZeileScanner(){
        try{
            return new Zeile(scanner.nextLine());
        }catch (Exception e){
            throw new IllegalArgumentException("Ungültige Eingabe !!");
        }
    }

    public static void main(String[] args) {
        // neue Instanz
        Zeile meineZeile = new Zeile("AABCCCCC");
        // Ausgabe der Zeile
        System.out.println(meineZeile.printZeile());
        // Ausgabe der Struktur
        System.out.println(meineZeile.printStruktur());
        // Trenner
        System.out.println("---------------");
        // Deklaration von neuer Zeile
        Zeile neueZeile;
        // Instanziierung über Scanner Methode
        neueZeile = newZeileScanner();
        // Ausgabe der Struktur
        System.out.println(neueZeile.printStruktur());
    }

}
