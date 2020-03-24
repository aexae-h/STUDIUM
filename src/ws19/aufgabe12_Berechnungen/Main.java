package ws19.aufgabe12_Berechnungen;

class Main {

    public static void main(String[] args) {

        System.out.println("Ergebnis für 1/3:");
        calcAndPrint(1,3);

        System.out.println("Ergebnis für 1/2:");
        calcAndPrint(1,2);

        System.out.println("Ergebnis für 2/3:");
        calcAndPrint(2,3);

    }

    public static void calcAndPrint(int a, int b) {

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

    }
}
