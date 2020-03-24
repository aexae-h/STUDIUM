package ws19.aufgabe22_array;

class Main {

    private static int[] arr10 = new int[10];

    public static void main(String[] args) {

        for (int i = 0; i < arr10.length; i++) {
            arr10[i] = i;
        }

        printArr10();
        System.out.println();

        int a = arr10[0];
        int b = arr10[9];
        arr10[9] = a;
        arr10[0] = b;

        printArr10();
        System.out.println();
    }

    private static void printArr10() {
        for (int i = 0; i < arr10.length; i++) {
            System.out.print(arr10[i]);
        }
    }
}
