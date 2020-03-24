package ws19.aufgabe9_ListeZahlen;

class Main {

    static int k = 0;
    static int q = 0;

    public static void main(String[] args) {


        System.out.println("Zahl \t Quadrat \t SummeDerZahelen \t SummeDerQuadratzahlen");

        for (int i = 1; i <= 100; i++) {
            k += i;
            q = q + i*i;
            System.out.println(" " + i + "\t".repeat(3) + i*i + "\t".repeat(4) + k + "\t".repeat(5) + q);
        }
    }
}