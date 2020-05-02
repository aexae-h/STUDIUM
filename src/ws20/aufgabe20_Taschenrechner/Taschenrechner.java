package ws20.aufgabe20_Taschenrechner;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Taschenrechner {
    static Scanner scanner = new Scanner(System.in);

    // Methode um eine Berechnung zu überprüfen
    static int[] checkBerechnung(String[] s) throws NumberFormatException, ExceptionMissingEqualSign, ExceptionWrongOperator {
        // Liste mit gültigen Operatoren
        Pattern regex = Pattern.compile("[*+-/]");
        // Array für Zahlen die zurückgeliefert werden
        int[] returnNumbers = new int[2];

        // Versuche String in Integer Werte umzuwandeln
        try {
            returnNumbers[0] = Integer.parseInt(s[0]);
            returnNumbers[1] = Integer.parseInt(s[2]);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        // Prüfen ob es einen gültigen Operator gibt
        if (!regex.matcher(s[1]).find()) {
            throw new ExceptionWrongOperator("Falscher Operator");
        }

        // Prüfen ob es ein Gleichheitszeichen gibt
        if (s.length < 4) {
            throw new ExceptionMissingEqualSign("Gleichheitszeichen fehlt");
        }
        // Prüfen ob es überhaupt ein Gleichheitszeichen ist
        else if(!s[3].equals("=")){
            throw new ExceptionMissingEqualSign("Falscher Wert statt Gleichheitszeichen gefunden");
        }

        return returnNumbers;
    }

    // Haupt-Methode zum Berechnen
    static int berechnen() {
        int[] zahlen = {0, 0};

        // Input
        System.out.println("Rechnung eingeben");
        String zuBerechnen = scanner.nextLine();
        // split
        String[] split = zuBerechnen.split("\\s+");

        // Berechnung prüfen und umgewandelete Zahlen abspeichern
        try {
            zahlen = checkBerechnung(split);
        } catch (ExceptionMissingEqualSign | ExceptionWrongOperator e) {
            e.printStackTrace();
        }

        // Je nach Operator die Operation ausführen
        switch (split[1]) {
            case "+":
                return new Addition().func(zahlen[0], zahlen[1]);
            case "-":
                return new Subtraktion().func(zahlen[0], zahlen[1]);
            case "*":
                return new Multiplikation().func(zahlen[0], zahlen[1]);
            case "/":
                return new Division().func(zahlen[0], zahlen[1]);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(berechnen());
    }

}
