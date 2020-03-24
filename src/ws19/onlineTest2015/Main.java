/* Teilnahmecode: kx379 Namen: Alexander Hader MatNR: 2066682 */

package ws19.onlineTest2015;

class Main {

    public static void main(String[] args) {

        Funktional.numbers(1,40,3);
        System.out.println(Funktional.meanValue(4,5));

        int[][] array = Matrix.genMatrix(4);
        Matrix.printMatrix(array);
    }
}
