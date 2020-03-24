package ws19.aufgabe17_Teiler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Zahl eingeben:");

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        teiler(input);
        System.out.println(); // Leerzeile
        System.out.println("-".repeat(40)); // Strich
        System.out.println(); // Leerzeile
        primTeiler(input);
    }

    private static void teiler(int input) {

        System.out.println("Teiler von: " + input);

        int anzahl = 0;

        for (int i = 2; i < input; i++) {

            if (input%i == 0) {

                if (i<1000) {
                    System.out.print(i + "\t\t");
                } else {
                    System.out.print(i + "\t");
                }

                anzahl++;

                if(anzahl%5 == 0) {
                    System.out.println();
                }
            }
        }
    }

    private static void primTeiler(int input) {

        System.out.println("Primfaktoren - von: " + input);

        StringBuilder sb = new StringBuilder();

        for (int i = 2; i < input; i++) {

            if (input%i == 0) {

                sb.append(i).append("*"); // i+* 5*6*

                input /= i; // in = in / 2
                i = 1;
            }
        }
        sb.setLength(sb.length() - 1);
        String s = sb.toString();
        s = s + "*" + input;
        System.out.println(s);
    }
}
