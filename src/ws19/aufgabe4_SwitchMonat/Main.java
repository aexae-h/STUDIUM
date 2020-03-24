package ws19.aufgabe4_SwitchMonat;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        int i;

        Scanner s = new Scanner(System.in);
        System.out.println("enter month: ");
        i = s.nextInt();

        switch (i) {
            case 1: System.out.println("jan");
                break;
            case 2: System.out.println("feb");
                break;
            case 3: System.out.println("mär");
                break;
            case 4: System.out.println("apr");
                break;
            case 5: System.out.println("mai");
                break;
            case 6: System.out.println("jun");
                break;
            case 7: System.out.println("jul");
                break;
            case 8: System.out.println("aug");
                break;
            case 9: System.out.println("sep");
                break;
            case 10: System.out.println("okt");
                break;
            case 11: System.out.println("nov");
                break;
            case 12: System.out.println("dez");
                break;
        }

    }
}
