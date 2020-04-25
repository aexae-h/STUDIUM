package ws20.aufgabe13_Graph;

import static jsTools.Graph.*;

class Main {
    // Fenster Konstante
    private static final int FENSTER_BREITE = 800;
    private static final int FENSTER_HOEHE = 600;
    // Konstante für Genauigkeit
    private static final double X_SCHRITT = 0.1;


    // --------------------- HILFSMETHODEN ---------------------
    // Maßstab von x Achse berechnen
    private static double get_x_Massstab(double xmin, double xmax) {
        // xmin negativ xmax positiv
        if (xmin < 0 && xmax > 0) {
            return FENSTER_BREITE / (xmax - xmin);
        }
        // beide positiv oder xmin = 0
        if (xmin > 0 && xmax > 0 || xmin == 0 && xmax > 0) {
            return FENSTER_BREITE / (xmax + xmin);
        }
        // beide negativ oder xmax = 0
        if (xmin < 0 && xmax < 0 || xmin < 0 && xmax == 0) {
            return FENSTER_BREITE / (xmax + xmin) * (-1);
        }
        throw new ArithmeticException("Maßstab konnte nicht berechnet werden");
    }

    // Maßstab von y Achse berechnen
    private static double get_y_Massstab(double ymin, double ymax) {
        // ymin negativ ymax positiv
        if (ymin < 0 && ymax > 0) {
            return FENSTER_HOEHE / (ymax - ymin);
        }
        // beide positiv oder ymin = 0
        if (ymin > 0 && ymax > 0 || ymin == 0 && ymax > 0) {
            return FENSTER_HOEHE / (ymax + ymin);
        }
        // beide negativ oder ymax = 0
        if (ymin < 0 && ymax < 0 || ymin < 0 && ymax == 0) {
            return FENSTER_HOEHE / (ymax + ymin) * (-1);
        }
        throw new ArithmeticException("Maßstab konnte nicht berechnet werden");
    }

    // maximalen Wertebereich bestimmen
    private static double getYmax(Function func, double xmin, double xmax) {
        double ymax = func.f(xmin);
        for (double i = xmin; i <= xmax; i += X_SCHRITT) {
            double yCurrent = func.f(i);
            if (yCurrent > ymax) {
                ymax = yCurrent;
            }
        }
        return ymax;
    }

    // minimalen Wertebereich bestimmen
    private static double getYmin(Function func, double xmin, double xmax) {
        double ymin = func.f(xmin);
        for (double i = xmin; i <= xmax; i += X_SCHRITT) {
            double yCurrent = func.f(i);
            if (yCurrent < ymin) {
                ymin = yCurrent;
            }
        }
        return ymin;
    }

    // Koordinatenlinien zeichnen
    private static void paintCoordinateLines(double xmin, double xmax, double ymin, double ymax, double scaleX, double scaleY) {
        // >>> X ACHSE <<<
        addLine(0,
                (int) (ymax * scaleY),
                FENSTER_BREITE,
                (int) (ymax * scaleY),
                black);
        //x Achse Beschriftungen
        for (double i = xmin; i <= xmax; i += (xmax - xmin) / 20) {
            // Keinen Ursprung malen : Gefahr der Überlappung
            if (i < 0.1 && i > -0.1) {
                continue;
            }
            // Striche
            addLine((int) (i * scaleX + xmin * -1 * scaleX),
                    (int) (ymax * scaleY - 5),
                    (int) (i * scaleX + xmin * -1 * scaleX),
                    (int) (ymax * scaleY + 5),
                    black);
            // Beschriftung
            addText("" + Math.round(i * 100) / 100.0,
                    (int) ((i * scaleX + xmin * -1 * scaleX) - 5),
                    (int) (ymax * scaleY - 7),
                    10,
                    black);
        }
        // ---------------------------------------
        // >>> Y ACHSE <<<
        addLine((int) (xmin * (-1) * scaleX),
                0,
                (int) (xmin * (-1) * scaleX),
                FENSTER_HOEHE,
                black);
        // y Achse : Teilungen
        for (double i = ymin; i <= ymax; i += (ymax - ymin) / 20) {
            // Keinen Ursprung malen : Gefahr der Überlappung
            if (i < 0.1 && i > -0.1) {
                continue;
            }
            // Striche
            addLine((int) (xmin * scaleX * -1 - 5),
                    (int) (i * scaleY * -1 + ymax * scaleY),
                    (int) (xmin * scaleX * -1 + 5),
                    (int) (i * scaleY * -1 + ymax * scaleY),
                    black);
            // Beschriftung
            addText("" + Math.round(i * 100) / 100.0,
                    (int) (xmin * scaleX * -1 + 5),
                    (int) (i * scaleY * -1 + ymax * scaleY),
                    10,
                    black);
        }
    }

    // Graph mit Einzellinien zeichnen
    private static void paintGraphLines(Function func, double xmin, double xmax, double ymax, double scaleX, double scaleY) {
        for (double i = xmin; i <= xmax; i += X_SCHRITT) {
            // Werte über Grafikfenster ignorieren
            if (    (int) (func.f(i) * scaleY * -1 + ymax * scaleY) > FENSTER_HOEHE ||
                    (int) ((i + X_SCHRITT) * scaleX + xmin * -1 * scaleX) > FENSTER_BREITE) {
                continue;
            }
            // Graph
            addLine((int) (i * scaleX + xmin * -1 * scaleX),
                    (int) (func.f(i) * scaleY * -1 + ymax * scaleY),
                    (int) ((i + X_SCHRITT) * scaleX + xmin * -1 * scaleX),
                    (int) (func.f(i + X_SCHRITT) * scaleY * -1 + ymax * scaleY),
                    blue);
        }
    }
    // ---------------------------------------------------------


    // Hauptfunktion für das Wichtigste
    static void paintFunction(Function function, double xmin, double xmax) {
        double scaleX = get_x_Massstab(xmin, xmax);
        double ymax = getYmax(function, xmin, xmax);
        double ymin = getYmin(function, xmin, xmax);
        double scaleY = get_y_Massstab(ymin, ymax);
        paintCoordinateLines(xmin, xmax, ymin, ymax, scaleX, scaleY);
        paintGraphLines(function, xmin, xmax, ymax, scaleX, scaleY);
    }

    // Hauptfunktion für das Wichtigste : ÜBERLADEN : y-Werte per Parameter
    static void paintFunction(Function function, double xmin, double xmax, double ymin, double ymax) {
        double scaleX = get_x_Massstab(xmin, xmax);
        double scaleY = get_y_Massstab(ymin, ymax);
        paintCoordinateLines(xmin, xmax, ymin, ymax, scaleX, scaleY);
        paintGraphLines(function, xmin, xmax, ymax, scaleX, scaleY);
    }


    // MAIN
    public static void main(String[] args) {

        initWindow("xhoch2 Funktion y-Werte berechnen");
        addRectBorder(0, 0, FENSTER_BREITE, FENSTER_HOEHE, white);
        paintFunction(new xhoch2(), -3, 3);

        initWindow("xhoch2 Funktion y-Werte gegeben");
        addRectBorder(0, 0, FENSTER_BREITE, FENSTER_HOEHE, white);
        paintFunction(new xhoch2(), -3, 3, -5,20);

        initWindow("xhoch3 Funktion y-Werte berechnen");
        addRectBorder(0, 0, FENSTER_BREITE, FENSTER_HOEHE, white);
        paintFunction(new xhoch3(), -3, 3);

        initWindow("xhoch3 Funktion y-Werte gegeben");
        addRectBorder(0, 0, FENSTER_BREITE, FENSTER_HOEHE, white);
        paintFunction(new xhoch3(), -3, 3, -6, 6);

        initWindow("Sinus Funktion y-Werte gegeben");
        addRectBorder(0, 0, FENSTER_BREITE, FENSTER_HOEHE, white);
        paintFunction(new sinx(), -9, 9, -3, 3);

        initWindow("Sinus Funktion y-Werte berechnen");
        addRectBorder(0, 0, FENSTER_BREITE, FENSTER_HOEHE, white);
        paintFunction(new sinx(), -9, 9);
    }
}
