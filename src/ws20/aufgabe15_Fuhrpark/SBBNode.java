package ws20.aufgabe15_Fuhrpark;

public class SBBNode {

    SBBNode leftChild;
    SBBNode rightChild;
    Fahrzeug elem;
    int key;

    SBBNode(Fahrzeug f){
        elem = f;
        key = f.getFzgnr();
    }

    // Fahrzeug sortiert einfügen
    void insert(Fahrzeug f){
        if (key > f.getFzgnr()){
            if(leftChild == null){
                leftChild = new SBBNode(f);
            } else {
                leftChild.insert(f);
            }
        } else {
            if(rightChild == null){
                rightChild = new SBBNode(f);
            } else {
                rightChild.insert(f);
            }
        }
    }

    // Baum sortiert ausgeben
    void printTree(){
        if(leftChild != null){
            leftChild.printTree();
        }
        System.out.println(elem.toString());
        if(rightChild != null){
            rightChild.printTree();
        }
    }

    // Suche Fahrzeug über key = Fahrzeugnummer
    Fahrzeug getFahrzeug(int key){
        if(this.key == key){
            return elem;
        }
        if(this.key > key){
            return leftChild.getFahrzeug(key);
        } else {
            return rightChild.getFahrzeug(key);
        }
    }

}
