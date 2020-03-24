package ws19.aufgabe21_Caesar;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Code eingeben:");
        String input = scan.nextLine();

        System.out.println("e -> encrypt || d -> decrypt");
        String sw = scan.nextLine();

        System.out.println("Versatz:");
        int versatz = scan.nextInt();

        String newInput = lowToUp(input); // lower to upper

        switch(sw) {
            case "e": case "E":
                System.out.println(cryptText(newInput, versatz));
                break;
            case "d": case "D":
                System.out.println(decryptText(newInput, versatz));
                break;
            default:
                for (int i = 1; i <= 25; i++) {
                    System.out.println(decryptText(newInput, i));
                }
        }
    }


    /** lower case to upper case */
    private static String lowToUp(String input){


        StringBuilder sb = new StringBuilder(input);

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {

                char cnew = (char)(input.charAt(i) - 0x20); // lower to upper
                sb.setCharAt(i, cnew);
            }
        }
        return sb.toString();
    }


    /** einzelne chars crypten */
    private static char crypt (char c, int n) {
        char cnew;
        char CplusN = (char)(c+n);

        /** Sonderzeichen ignorieren*/
        if(c > 'Z' || c < 'A') {
            return c;
        }

        /** Überprüfung ob Versatz außerhalb von A-Z liegt + char verschieben*/
        if(CplusN > 'Z') {
            int diff = CplusN - 'Z';
            cnew = (char)('A' + diff -1);
        } else { cnew = CplusN;}
        return cnew;
    }


    /** einzelne chars decrypten */
    private static char decrypt (char c, int n) {
        char cnew;
        char CminN = (char)(c-n);

        /** Sonderzeichen ignorieren*/
        if(c > 'Z' || c < 'A') {
            return c;
        }

        /** Überprüfung ob Versatz außerhalb von A-Z liegt + char verschieben*/
        if(CminN < 'A') {
            int diff = 'A' - CminN;
            cnew = (char)('Z' - diff +1);
        } else { cnew = CminN;}
        return cnew;
    }


    /** text crypten */
    private static String cryptText (String s, int n) {
        int l = s.length();
        for (int i = 0; i < l; i++) {

            char cnew = crypt(s.charAt(i),n);
            StringBuilder sb = new StringBuilder(s);
            sb.setCharAt(i, cnew);
            s = sb.toString();
        }
        return s;
    }

    /** text decrypten */
    private static String decryptText (String s, int n) {
        int l = s.length();
        for (int i = 0; i < l; i++) {

            char cnew = decrypt(s.charAt(i),n);
            StringBuilder sb = new StringBuilder(s);
            sb.setCharAt(i, cnew);
            s = sb.toString();
        }
        return s;
    }

}
