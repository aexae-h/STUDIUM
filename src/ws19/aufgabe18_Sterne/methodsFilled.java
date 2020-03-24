package ws19.aufgabe18_Sterne;

class methodsFilled {

    private static int height = Main.height;

    static void paintReFilled () {

        for (int i = 0; i < height; i++) {
            methodsBasics.paintStars(0, height);
        }
        System.out.println();
        System.out.println();
    }

    static void paintDrFilled () {
        for (int i = 0; i < height; i++) {
            methodsBasics.paintStars( (2*height-1)/2-i, 1+i*2);
        }
        System.out.println();
        System.out.println();
    }

    static void paintRaFilled () {
        for (int i = 0; i < height; i++) {
            methodsBasics.paintStars( (2*height-1)/2-i, 1+i*2);
        }
        for (int i = height-2; i >= 0; i--) {
            methodsBasics.paintStars( (2*height-1)/2-i, 1+i*2);
        }
        System.out.println();
        System.out.println();
    }
}
