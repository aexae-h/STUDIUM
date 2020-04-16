package ws20.aufgabe9_treeZeile;

public class TeilzeileBlatt extends Teilzeile {

    TeilzeileBlatt(String s) {
        super(s);
    }

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
}
