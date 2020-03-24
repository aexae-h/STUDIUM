package ws19.aufgabe35_Speichermodell;

class Main {

    public static void main(String[] args) {
	Spx spx = new Spx();
	int[] h = spx.arrnew(5);
        for(int index : h){
            System.out.println(index);
        }
    }
}
