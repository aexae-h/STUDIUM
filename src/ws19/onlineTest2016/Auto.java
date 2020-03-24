package ws19.onlineTest2016;

class Auto {

    int km;             //Kilometerzahler des Autos
    int kmold;
    double fuel;        //Füllstand des Tanks
    double verbrauch;   //Benzinverbrauch des Autos in l/100km

    void initAuto(int kmInit){
        km = kmInit;
        kmold = kmInit;
        fuel = 11.1;
        verbrauch = 6.3;
    }

    void drive(int distance){
        km += distance;
        if (verbrauch*distance > fuel){
            fuel = 0;
        } else {
            fuel -= verbrauch*distance;
        }
    }

    int getGefahren(){
        return km - kmold;
    }

}
