package ws19.aufgabe39_ErlangscheV;

class Main {

    public static void main(String[] args) {
        System.out.println(B(3.5 , 20));
    }

    static double B (double A, int n){

        if (n<=0){
            return 0.0;
        }
        return (A * B(A,n-1)) / (A * B(A,n-1) + n);
    }
}
