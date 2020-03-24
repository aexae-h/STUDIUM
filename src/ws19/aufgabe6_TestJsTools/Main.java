package ws19.aufgabe6_TestJsTools;
import static jsTools.Input.*;

class Main {

    public static void main(String[] args) {

        int i;
        String s;

        i = readIntW("So kann man nach einer Zahl fragen:");
        System.out.println("Danke:" + i);

        s = readLineW("Bitte geben Sie eine Text ein:");
        System.out.println("Danke: " +s);
    }
}
