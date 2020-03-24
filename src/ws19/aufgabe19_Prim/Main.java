package ws19.aufgabe19_Prim;

class Main {

    public static void main(String[] args) {

        int anzahl = prim1000();
        System.out.println();
        System.out.println(anzahl);

    }

    static int prim1000() {

        int t = 0; // Zählervariable für Tabulator
        int a = 0;

        for (int i = 1; i < 1001; i++) {

            for (int j = 2; j <= i; j++) {

                if (i % j == 0) {
                    if (i == j) {
                        t++;
                        a++;
                        System.out.print(i + "\t\t");
                    }
                    if (t == 5) {
                        System.out.println();
                        t=0;
                    }
                    break;
                }
            }
        }
        return a;
    }
}

