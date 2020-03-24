package ws19.aufgabe16_Prim;

class Main {

    public static void main(String[] args) {

        prim1000();
    }

    private static void prim1000() {

        for (int i = 1; i < 1001; i++) {

            for (int j = 2; j <= i; j++) {

                if (i%j == 0) {
                    if (i == j) {
                        System.out.print(i + " ");
                    }
                    break;
                }
            }
        }
    }
}
