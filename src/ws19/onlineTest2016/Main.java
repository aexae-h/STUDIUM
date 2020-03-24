/* Teilnahmecode: kj911 Namen:Alexander Hader MatNR: 2066682 */
package ws19.onlineTest2016;

class Main {

    static int[] bewertung = {1,2,3,4,5,2,3,2,2,4,4,2,4,4,4,2,2,3,3,2,1,3,3,2,1,1,1,1,1,1,1};

    public static void main(String[] args) {

        System.out.println(Funktional.formula(0));
        System.out.println(Funktional.calcStars(bewertung));

        Auto a = new Auto();
        a.initAuto(1000);
        a.drive(1);
        System.out.println(a.fuel);
        System.out.println(a.getGefahren());

    }
}