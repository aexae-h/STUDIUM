package ws19.aufgabe3_Prim;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
	int a;

	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number");
	a = s.nextInt();
	System.out.println("You have entered number: " + a);
	System.out.println("");

	if (a%2 == 0 || a%3 == 0 || a%5 == 0 || a%7 == 0 || a%11 == 0) {
		if (a == 3 || a == 5 || a == 7 || a == 11) {
			System.out.println("*** PRIM ***");
		} else
		System.out.println("*** NO PRIM ***");
	} else {
		System.out.println("*** PRIM ***");
	}

    }
}
