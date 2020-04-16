package ws20.aufgabe5_RekBinTree;

public class RekBinTree {

    Node root;

    RekBinTree(String s) {
        root = new Node(s);
    }

    // mit pointer
    int containsP(Character c) {
        return containsP(root, c);
    }
    private int containsP(Node node, Character c) {
        int countC = 0;
        if (node.inh.equals(c)) {
            countC++;
        }
        if (node.leftChild != null) {
            countC += containsP(node.leftChild, c);
        }
        if (node.rightChild != null) {
            countC += containsP(node.rightChild, c);
        }
        return countC;
    }

    // objektorientiert
    int containsOO(Character c) {
        return root.contains(c);
    }

    public String toStringOO(){
        return root.toString();
    }

    public String toStringPreOO(){
        return root.toStringPre();
    }

    public String toStringPostOO(){
        return root.toStringPost();
    }

    public String toStringRevOO(){
        return root.toStringRev();
    }
}



class Main {
    public static void main(String[] args) {
        RekBinTree rbt = new RekBinTree("ABCRDEZ");
        System.out.println(rbt.containsP('E'));
        System.out.println(rbt.containsOO('E'));
        System.out.println(rbt.toStringOO());
        System.out.println(rbt.toStringPreOO());
        System.out.println(rbt.toStringPostOO());
        System.out.println(rbt.toStringRevOO());
    }
}
