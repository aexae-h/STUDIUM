package ws19.aufgabe34_auto;
import static jsTools.Graph.*;

import java.util.Scanner;

class Auto {

    Scanner scan = new Scanner(System.in);
    String hersteller;
    int posX;
    int posY;
    double kmStand;
    int baujahr;

    /** Auto */
    String farbe;
    int d; // groesse
    int linkerReifen;
    int rechterReifen;
    int rumpf;
    int dach;

    void init(String hst, int x, int y, int km, int bj, int groesse, String fa){
        hersteller = hst;
        posX = x;
        posY = y;
        kmStand = km;
        baujahr = bj;
        farbe = fa;
        d = groesse;
    }

    void readValues(){
        System.out.print("Hersteller: ");     hersteller = scan.next();
        System.out.print("Position X: ");     posX = scan.nextInt();
        System.out.print("Position Y: ");     posY = scan.nextInt();
        System.out.print("Kilometerstand: "); kmStand = scan.nextLong();
        System.out.print("Baujahr: ");        baujahr = scan.nextInt();
    }

    void driveTo(int Xneu, int Yneu){
        /**
        System.out.println("PosX alt:" + posX);
        System.out.println("PosY alt:" + posY);
        System.out.println("PosX neu:" + Xneu);
        System.out.println("PosY neu:" + Yneu);
         */

        double distance = (Math.sqrt((Xneu - posX)*(Xneu - posX) + (Yneu - posY)*(Yneu - posY)));
        kmStand += distance;

        posX = Xneu;
        posY = Yneu;

        zeichneNeu();
    }

    void print(){
        System.out.println("Hersteller: " + hersteller);
        System.out.println("PosX: " + posX);
        System.out.println("PosY: " + posY);
        System.out.println("Kilometerstand: " + kmStand);
        System.out.println("Baujahr: " + baujahr);
    }

    void paint(){
        linkerReifen = addCircleBorder(posX+d/2,posY,d,farbe); //linker Reifen
        rechterReifen = addCircleBorder(posX+4*d,posY,d,farbe); //rechter Reifen
        rumpf = addRectBorder(posX,posY-2*d,6*d,2*d,farbe);
        dach = addRectBorder(posX+d+d/2,posY-2*d-d,3*d,1*d,farbe);
    }

    void zeichneNeu(){

        setPos(linkerReifen,posX+d/2,posY);
        setPos(rechterReifen,posX+4*d,posY);
        setPos(rumpf,posX,posY-2*d);
        setPos(dach,posX+d+d/2,posY-2*d-d);
        zeichne();
    }

}
