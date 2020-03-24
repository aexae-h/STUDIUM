package ws19.aufgabe47_eFunktion;

 class Main {

    public static void main(String[] args) {
        System.out.println(e(10,0));
    }

    private static double e(int n, int i){
        if(i > n){
            return 0;
        }
        return 1/i(i) + e(n,i+1);
    }

    private static double i(int i){
        if( i == 0){
            return 1;
        }
        return i(i-1) * i;
    }
}
