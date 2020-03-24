package ws19.aufgabe35_Speichermodell;
class Spx {

    int counter = 0;
    int[] arrnew (int lge){
        counter++;
        int[] arr = new int[lge];
        for(int i = 0; i < lge; i++){
            arr[i] = lge - i;
        }
        return arr;
    }
}
