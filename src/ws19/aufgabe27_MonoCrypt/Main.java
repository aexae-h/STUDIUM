package ws19.aufgabe27_MonoCrypt;

import java.awt.image.CropImageFilter;
import java.io.File;
import java.util.Scanner;

class Main {

    static int
            arrayTiefe = 2,
            arrayBreite = 26;
    static char[][] arr = new char[arrayTiefe][arrayBreite];

    private static File file = new File("/Users/Alex/IdeaProjects/aufgabe27_MonoCrypt/src/com/company/Geheim.txt");

    public static void main(String[] args) throws Exception {

        System.out.println("********* get array *********");
        getArr.getArray();
        System.out.println("********* get array *********");
        System.out.println();

        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(decryptText(sc.nextLine()));
            }
        }catch (Exception e){
            e.printStackTrace();
         }

        System.out.println();
        System.out.println(decryptText(cryptText("Hallo das ist ein Test")));
    }

    private static String cryptText(String s){

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++){
            sb.setCharAt(i, crypt(s.charAt(i)));
        }
        return sb.toString();
    }

    private static String decryptText(String s){

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++){
            sb.setCharAt(i, decrypt(s.charAt(i)));
        }
        return sb.toString();
    }

    private static char crypt(char c){

        for(int j = 0; j < Main.arrayBreite; j ++) {
            c = Character.toUpperCase(c);
            if(c == Main.arr[0][j]) {
                c = Main.arr[1][j];
                return c;
            }
        }
        return c;
    }

    private static char decrypt(char c){

        for(int j = 0; j < 26; j++){
            c = Character.toUpperCase(c);
            if (c == Main.arr[1][j]){
                c = Main.arr[0][j];
                return c;
            }
        }
        return c;
    }
}
