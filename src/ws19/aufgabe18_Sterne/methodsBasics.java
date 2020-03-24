package ws19.aufgabe18_Sterne;

class methodsBasics {

    static void paintStars(int offset, int anz) {

        for (int i = 0; i < offset; i++) {
            System.out.print("  ");
        }

        for(int i = 0; i < anz; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    static void paintStarBlanks(int offset, int anz) {

        for (int i = 0; i < offset; i++) {
            System.out.print("  ");
        }
        System.out.print("* ");
        for(int i = 0; i < anz; i++) {
            System.out.print("  ");
        }
        System.out.print("* ");
        System.out.println();
    }

}
