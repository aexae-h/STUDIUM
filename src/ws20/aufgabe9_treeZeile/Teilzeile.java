package ws20.aufgabe9_treeZeile;

public abstract class Teilzeile {
    char zeichen;
    int length;
    Teilzeile leftChild;
    Teilzeile rightChild;

    Teilzeile(String s) {
        if (checkEqual(s)) {
            length = s.length();
            zeichen = s.charAt(0);
            return;
        }
        leftChild = createTeilzeile(s.substring(0, s.length() / 2));
        rightChild = createTeilzeile(s.substring(s.length() / 2));
    }

    // schaut sich den String an ob er nur aus den gleichen Buchstaben entsteht
    static boolean checkEqual(String s) {
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (i + 1 == charArr.length) {
                break;
            }
            if (!(charArr[i] == charArr[i + 1])) {
                return false;
            }
        }
        return true;
    }

    // Factory Pattern
    static Teilzeile createTeilzeile(String s) {
        if (checkEqual(s)) {
            return new TeilzeileBlatt(s); // z.B.: AA
        }
        return new TeilzeileKnoten(s); // z.B.: AABC
    }

    // Ausgabe der ursprünglichen Zeile
    String printZeileOO() {
        String toReturn = "";
        if (leftChild != null) {
            toReturn += leftChild.printZeileOO();
        }
        toReturn += String.valueOf(zeichen).repeat(length);
        if (rightChild != null) {
            toReturn += rightChild.printZeileOO();
        }
        return toReturn;
    }

    // Ausgabe der Struktur der ursprünglichen Zeile
    String printStrukturOO() {
        String toReturn = "";
        if (length == 1) {
            toReturn += zeichen + "|";
        } else if (length > 1) {
            toReturn += length + " * " + zeichen + "|";
        }
        if (leftChild != null) {
            toReturn += leftChild.printStrukturOO();
        }
        if (rightChild != null) {
            toReturn += rightChild.printStrukturOO();
        }
        return toReturn;
    }

}
