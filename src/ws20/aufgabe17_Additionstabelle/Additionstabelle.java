package ws20.aufgabe17_Additionstabelle;

public class Additionstabelle {
    // addTab druckt eine Additionstabelle, wobei
    // die Zahlenbereiche
    // der Spalten von x10 bis x11 geht, mit einem Increment von x1d
    // der Zeilen von x00 bis x01 geht, mit einem Increment von x0d
    static void addTab(Funktion f, double x00, double x01, double x0d,
                       double x10, double x11, double x1d) {
        System.out.println();
        System.out.print("\t||");
        for (double x = x10; x <= x11; x += x1d) {
            System.out.print(x + "\t|");
        }
        System.out.println("|");

        System.out.print("==========||");
        for (double x = x10; x <= x11; x += x1d) {
            System.out.print("=========+");
        }
        System.out.println();

        for (double i = x00; i <= x01; i += x0d) {
            System.out.print(i + "\t||");
            for (double j = x10; j <= x11; j += x1d)
                System.out.print(f.f(i,j) + "\t|");
            System.out.println();
        }
    }

    public static void main(String args[]) {
        addTab(new Addition(),0.0, 5, 0.5, 1.0, 5, 0.5);
        addTab(new Subtraktion(),0.0, 5, 0.5, 1.0, 5, 0.5);
        addTab(new Multiplikation(),0.0, 5, 0.5, 1.0, 5, 0.5);
        addTab(new Division(),0.0, 5, 0.5, 1.0, 5, 0.5);
    }
}
