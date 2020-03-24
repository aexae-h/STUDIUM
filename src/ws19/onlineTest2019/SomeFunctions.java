/* Teilnahmecode: gv783 Namen: Alexander Hader MatNR: 2066682 */

package ws19.onlineTest2019;

class SomeFunctions {

    int formula1(double par){
        return (int)(par*667/5);
    }

    int minMaxDiff(int values[]){
        int min = values[0];
        int max = values[0];

        for(int i = 0; i < values.length; i++){
            if(values[i] < min){
                min = values[i];
            } else if(values[i] > max){
                max = values[i];
            }
        }
        return max-min;
    }

    void initArr(int[] theArray, int valOfFirst){
        theArray[0] = valOfFirst;
        for(int i = 1; i < theArray.length; i++){
            theArray[i] = theArray[i-1]+96;
        }
    }
}
