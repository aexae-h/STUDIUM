package ws19.aufgabe15_ZahlenAusgabe;

class Main {

    public static void main(String[] args) {

        int printAnzahl = zahlenAusgabe(6,5,7);
        System.out.println(printAnzahl);
    }

    private static int zahlenAusgabe(int start, int ende, int diff) {

        int j = 0;

        for (int i = 0; i < ende-start; i += diff) {
            System.out.print(start + i);
            System.out.print(",");
            j++;
        }
        int anzahl = j;

        System.out.println(); // Leerzeile
        return anzahl;
    }
}