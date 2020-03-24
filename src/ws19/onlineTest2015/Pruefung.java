package ws19.onlineTest2015;

class Pruefung {

    int matNr;
    String nameFach;
    int credits;
    int note;

    void setValues(int mNr, String fach, int cps, int n){
        matNr = mNr;
        nameFach = fach;
        credits = cps;
        note = n;
    }

    double getNoteGewichtet(){
        return (double)(note*credits)/180;
    }
}
