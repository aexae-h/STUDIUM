package ws20.aufgabe5_RekBinTree;

public class Node {

    Character inh;
    Node leftChild;
    Node rightChild;

    Node(String s) {
        inh = s.charAt(s.length() / 2);
        if (s.length() == 1) {
            return;
        }
        leftChild = new Node(s.substring(0, s.length() / 2));
        rightChild = new Node(s.substring((s.length() + 1) / 2));
    }

    int contains(Character c) {
        int countC = 0;
        if (inh.equals(c)) {
            countC++;
        }
        if (rightChild != null) {
            countC += rightChild.contains(c);
        }
        if (leftChild != null) {
            countC += leftChild.contains(c);
        }
        return countC;
    }

    public String toString(){
        String name = "";
        if(leftChild != null){
            name += leftChild.toString();
        }
        name += inh;
        if(rightChild != null){
            name += rightChild.toString();
        }
        return name;
    }

    public String toStringPre(){
        String name = "";
        name += inh;
        if(leftChild != null){
            name += leftChild.toStringPre();
        }
        if(rightChild != null){
            name += rightChild.toStringPre();
        }
        return name;
    }

    public String toStringPost(){
        String name = "";
        if(leftChild != null){
            name += leftChild.toStringPost();
        }
        if(rightChild != null){
            name += rightChild.toStringPost();
        }
        name += inh;
        return name;
    }

    public String toStringRev(){
        String name = "";
        if(rightChild != null){
            name += rightChild.toStringRev();
        }
        name += inh;
        if(leftChild != null){
            name += leftChild.toStringRev();
        }
        return name;
    }

}
