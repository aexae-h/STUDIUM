package ws19.aufgabe40_Summe;

class Main {

    public static void main(String[] args) {
        System.out.println(summe(7));
    }

    private static int summe(int n){
        if(n<=0){
            return 0;
        }
        return n + summe(n-2);
    }
}
