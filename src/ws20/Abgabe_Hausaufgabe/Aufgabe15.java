package ws20.Abgabe_Hausaufgabe;

class Aufgabe15 {
    public static void main(String[] args) {
        // neuer Fuhrpark
        SortBinTree fuhrpark = new SortBinTree();
        // Fahrzeuge hinzufügen
        fuhrpark.insert(new Fahrrad(200,"white", true, 2018));
        fuhrpark.insert(new Bus(300,"AUX-HA-300", 80000,20));
        fuhrpark.insert(new PKW(100,"AUX-HA-100", 90000,"blau"));
        fuhrpark.insert(new Fahrrad(150,"white", false, 2015));
        fuhrpark.insert(new Bus(20,"AUX-HA-400", 40000,20));
        fuhrpark.insert(new PKW(50,"AUX-HA-50", 50000,"rot"));

        // Fuhrpark ausgeben INORDER
        fuhrpark.printTree();

        System.out.println("--------------");

        // SUCHE FAHRZEUG
        System.out.println("Gesuchtes Fahrzeug:" + fuhrpark.getFahrzeug(150));
    }
}

// -----------------------------------------------------------------
// -----------------------------------------------------------------
// ------------------------ Fahrzeuge ------------------------------

// Wurzel
abstract class Fahrzeug {
    int fzgnr;
    Fahrzeug(int fzgnr){
        this.fzgnr = fzgnr;
    }

    public int getFzgnr() {
        return fzgnr;
    }
}

// Vater
abstract class KFZ_Detail extends Fahrzeug {
    String kfzKenz;
    double kmStand;
    KFZ_Detail(int fzgnr, String kfzKenz, double kmStand){
        super(fzgnr);
        this.kfzKenz = kfzKenz;
        this.kmStand = kmStand;
    }
}

// Kind
class PKW extends KFZ_Detail {
    String farbe;
    PKW(int fzgnr, String kfzKenz, double kmStand, String farbe){
        super(fzgnr, kfzKenz, kmStand);
        this.farbe = farbe;
    }

    @Override
    public String toString() {
        return "PKW{" +
                "fzgnr=" + fzgnr +
                ", kfzKenz='" + kfzKenz + '\'' +
                ", kmStand=" + kmStand +
                ", farbe='" + farbe + '\'' +
                '}';
    }
}

// Kind
class Bus extends KFZ_Detail {
    int anzSitze;
    Bus(int fzgnr, String kfzKenz, double kmStand, int anzSitze){
        super(fzgnr, kfzKenz, kmStand);
        this.anzSitze = anzSitze;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "fzgnr=" + fzgnr +
                ", kfzKenz='" + kfzKenz + '\'' +
                ", kmStand=" + kmStand +
                ", anzSitze=" + anzSitze +
                '}';
    }
}

// Kind
class Fahrrad extends Fahrzeug {
    String farbe;
    boolean hatEAntrieb;
    int bj;
    Fahrrad(int fzgnr, String farbe, boolean hatEAntrieb, int bj){
        super(fzgnr);
        this.farbe = farbe;
        this.hatEAntrieb = hatEAntrieb;
        this.bj = bj;
    }

    @Override
    public String toString() {
        return "Fahrrad{" +
                "fzgnr=" + fzgnr +
                ", farbe='" + farbe + '\'' +
                ", hatEAntrieb=" + hatEAntrieb +
                ", bj=" + bj +
                '}';
    }
}

// -----------------------------------------------------------------
// -----------------------------------------------------------------
// ------------------------ Baum -----------------------------------

class SortBinTree {
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

// -----------------------------------------------------------------
// -----------------------------------------------------------------
// ------------------------ Knoten ---------------------------------


class SBBNode {

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
