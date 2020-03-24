package ws19.aufgabe26_Array2Dim;

class Main {

    private static final int nxn = 10;
    private static long[][] arr = new long[nxn][nxn];

    public static void main(String[] args) {
        insert1();
        calcFields();
        soutArr();
    }

    private static void insert1(){
        for (int i = 0; i < nxn; i++) {
            arr[0][i] = 1; // Zeile 0
            arr[i][0] = 1; // Spalte 0
        }
    }

    private static void calcFields(){
        for (int i = 1; i < nxn; i ++){
            for(int j = 1; j < nxn; j++){
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }
    }

    private static void soutArr(){
        for (int i = 0; i < nxn; i ++){
            for(int j = 0; j < nxn; j++){
                if (arr[i][j] > 1000){
                    System.out.print(arr[i][j] + "\t");
                } else {
                System.out.print(arr[i][j] + "\t\t");
                }
            }
            System.out.println();
        }
    }
}