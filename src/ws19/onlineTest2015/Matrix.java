package ws19.onlineTest2015;

class Matrix {

    static int[][] genMatrix(int dim){
        int[][] matrix = new int[dim][dim];

        /** Diagonale */
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                if (i == j){
                    matrix[i][j] = i;
                }
            }
        }

        /** obere Reihe */
        for (int i = 0; i < matrix.length; i++){
            for (int j = i+1; j < matrix.length; j++){
                matrix[i][j] = 3;
            }
        }

        /** untere Reihe */
        for (int i = 1; i < matrix.length; i++){
            for (int j = 0; j < i; j++){
                matrix[i][j] = 5;
            }
        }


        return matrix;
    }

    static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

