package ws19.aufgabe33_auto;

class Main {

    static Auto a1 = new Auto();
    static Auto a2 = new Auto();

    public static void main(String[] args) {

        a1.init("Audi",10,10,80000,2010);
        a1.driveTo(50,50);
        a1.print();

        System.out.println("*".repeat(50));

        a2.readValues();
        a2.driveTo(50,50);
        a2.print();
    }
}