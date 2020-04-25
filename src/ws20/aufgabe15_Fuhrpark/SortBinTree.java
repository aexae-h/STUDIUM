package ws20.aufgabe15_Fuhrpark;

public class SortBinTree {
    SBBNode root;

    // Fahrzeug objektorientiert einfügen
    void insert(Fahrzeug f){
        if(root == null){
            root = new SBBNode(f);
        } else {
            root.insert(f);
        }
    }

    // Baum sortiert ausgeben
    void printTree(){
        root.printTree();
    }

    // Suche Fahrzeug über key = Fahrzeugnummer
    Fahrzeug getFahrzeug(int key){
        return root.getFahrzeug(key);
    }

}
