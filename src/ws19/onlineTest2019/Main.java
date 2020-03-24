/* Teilnahmecode: xxxx Namen: Alexander Hader MatNR: 2066682 */

package ws19.onlineTest2019;

class Main {

    static int[] testarr = {1,4,5,2,5,2,4,5,2,4,2,4,2,2,5,2,3,4,10,20,1};

    public static void main(String[] args) {

        SomeFunctions sf = new SomeFunctions();
        System.out.println(sf.formula1(1));
        System.out.println(sf.minMaxDiff(testarr));
        sf.initArr(testarr,2);
        System.out.println("*".repeat(30));

        Geldbeutel gb = new Geldbeutel();
        gb.addMoney(50,10);
        System.out.println(gb.getBetrag());
        System.out.println(gb.getGewicht());

    }
}
