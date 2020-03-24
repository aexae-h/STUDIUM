package ws19.aufgabe25_Arrays;

import java.util.Arrays;

class Main {

    private static char[] arr = new char[10];
    private static char[] brr = new char[10];


    public static void main(String[] args) {
        initArr();

        print(arr);
        System.out.println();
        print(brr);
        System.out.println();

        printReverse(arr);
        System.out.println();

        revert(arr);
        System.out.println();

        System.out.println(contains(arr,'C'));

        System.out.println(countx(arr,'B'));

        brr = arr;
        System.out.println(euqals(arr, brr));

        revert(arr);
        System.out.println();
        replace(arr,'D','X');

    }

    private static void initArr() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (65 + i);
            brr[i] = (char) (65 + i);
        }
    }

    private static void print(char[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+",");
        }
    }

    private static void printReverse(char[] arr){
        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]+",");
        }
    }

    private static void revert(char[] arr){
        for(int i = 0; i < arr.length/2; i++){
            char copy = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = copy;
        }
        print(arr);
    }

    private static boolean contains(char[] arr, char x){

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                return true;
            }
        }
        return false;
    }

    private static int countx(char[] arr, char x){
        int c = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                c++;
                return c;
            }
        }
        return c;
    }

    private static boolean euqals(char[] arr, char[] barr){

        if (Arrays.equals(arr,barr)){
            return true;
        }
        return false;
    }

    private static void replace(char[] arr, char x, char y){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                arr[i] = y;
            }
        }
        print(arr);
    }
}