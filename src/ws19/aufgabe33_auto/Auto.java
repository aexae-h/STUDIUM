package ws19.aufgabe33_auto;
import java.util.Scanner;

class Auto {

    Scanner scan = new Scanner(System.in);
    String hersteller;
    int posX;
    int posY;
    double kmStand;
    int baujahr;

    void init(String hst, int x, int y, int km, int bj){
        hersteller = hst;
        posX = x;
        posY = y;
        kmStand = km;
        baujahr = bj;
    }

    void readValues(){
        System.out.print("Hersteller: ");     hersteller = scan.next();
        System.out.print("Position X: ");     posX = scan.nextInt();
        System.out.print("Position Y: ");     posY = scan.nextInt();
        System.out.print("Kilometerstand: "); kmStand = scan.nextLong();
        System.out.print("Baujahr: ");        baujahr = scan.nextInt();
    }

    void driveTo(int Xneu, int Yneu){
        System.out.println("PosX alt:" + posX);
        System.out.println("PosY alt:" + posY);
        System.out.println("PosX neu:" + Xneu);
        System.out.println("PosY neu:" + Yneu);

        double distance = (Math.sqrt((Xneu - posX)*(Xneu - posX) + (Yneu - posY)*(Yneu - posY)));
        kmStand += distance;

        posX = Xneu;
        posY = Yneu;
    }

    void print(){
        System.out.println("Hersteller: " + hersteller);
        System.out.println("PosX: " + posX);
        System.out.println("PosY: " + posY);
        System.out.println("Kilometerstand: " + kmStand);
        System.out.println("Baujahr: " + baujahr);
    }

}
