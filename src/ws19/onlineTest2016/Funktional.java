package ws19.onlineTest2016;

class Funktional {

    static int formula(double par){
        return (int)((17.2*3.25)/(17.2-1)+17.2);
    }

    static String calcStars(int values[]){
        double sum = 0.0;
        double m = 0.0;
        for (int i = 0; i < values.length; i++){
            sum += values[i];
            m = sum / values.length;
        }
        if (m >= 0.0 && m < 2.4){
            return "*";
        } else if (m >= 2.4 && m < 2.8){
            return "**";
        } else if (m >= 2.8 && m <= 5.0){
            return "***";
        }
        return "404";
    }
}
