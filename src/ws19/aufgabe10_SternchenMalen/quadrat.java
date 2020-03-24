package ws19.aufgabe10_SternchenMalen;

class quadrat {

    static void callQuadrat(){

        /** Erste Zeile */
        for (int i = 0; i < Main.input; i++) {
            System.out.print("* ");
        }
        System.out.println();

            /** erste for schleife lässt die Zeilen öfters durchlaufen */
            for (int j = 0; j < Main.input-2; j++) {
                System.out.print("*");
                /** for schleife für die leerzeichen */
                for (int i = 0; i < Main.input*2-3; i++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            for (int i = 0; i < Main.input; i++) {
                System.out.print("* ");
            }
        }
    }
