package ws19.aufgabe45_Summe;

class Main {

    public static void main(String[] args) {
        System.out.println(sum(1,5,4));
    }

    private static int sum(int p, int n, int k){
        if(p > n){
            return 0;
        }
        return (k-p)*(k-p) + sum(p+1,n,k);
    }
}
