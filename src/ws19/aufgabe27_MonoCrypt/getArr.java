package ws19.aufgabe27_MonoCrypt;
import java.io.File;
import java.util.Scanner;

class getArr {

    private static File file = new File("/Users/Alex/IdeaProjects/aufgabe27_MonoCrypt/src/com/company/test.txt");

    static void getArray(){

        try {
            Scanner sc = new Scanner(file);
            for(int i = 0; i < Main.arrayTiefe; i++){
                String ln = sc.nextLine();

                for (int j = 0; j < Main.arrayBreite; j++){
                    Main.arr[i][j] = ln.charAt(j);
                }
            }

        }catch (Exception ex) {
            ex.printStackTrace();
        }

        printArr();
    }

    private static void printArr(){
        for (int i = 0; i < Main.arrayTiefe; i++) {
            for (int j = 0; j < Main.arrayBreite; j++){
                System.out.print(Main.arr[i][j]);
            }
            System.out.println();
        }
    }

}
