package ws19.aufgabe18_Sterne;

import org.w3c.dom.ls.LSOutput;

class methodsCorner {

    private static int height = Main.height;

    static void paintReCorner () {
        methodsBasics.paintStars(0, height); // ***************

        for (int i = 0; i < height-2; i++) { // *     *
            methodsBasics.paintStarBlanks(0,height-2);
        }
        methodsBasics.paintStars(0, height); ////******
        System.out.println();
        System.out.println();
    }

    static void paintDrCorner () {
        methodsBasics.paintStars((2*height-1)/2 ,1);

        for (int i = 0; i < height-2; i++) {
            methodsBasics.paintStarBlanks( (height+1)/2-i, 1+i*2);
        }
        methodsBasics.paintStars(0 ,2*height-1);
        System.out.println();
        System.out.println();
    }

    static void paintRaCorner () {
        methodsBasics.paintStars((2*height-1)/2 ,1);

        for (int i = 0; i < height-2; i++) {
            methodsBasics.paintStarBlanks( (height+1)/2-i, 1+i*2);
        }

        for (int i = height-2; i >= 0; i--) {
            methodsBasics.paintStarBlanks( (height+1)/2-i, 1+i*2);
        }
        methodsBasics.paintStars((2*height-1)/2 ,1);
    }
}
