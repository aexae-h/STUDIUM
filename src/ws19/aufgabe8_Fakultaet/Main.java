package ws19.aufgabe8_Fakultaet;

import java.util.Scanner;

class Main {

    static int eingabe;
    static int increment = 1;

    public static void main(String[] args) {

        System.out.println("enter number");

        Scanner s = new Scanner(System.in);
        eingabe = s.nextInt();


        for (int i = 1; i <= eingabe; i++){
            increment *= i;
        }

        System.out.println(increment);
    }
}
