/* Teilnahmecode: gv783 Namen: Alexander Hader MatNR: 2066682 */

package ws19.onlineTest2019;

class Geldbeutel {

    int anzahlMuenzen;  // alle münzen im geldbeutel
    int gewicht = 14;        // in gramm
    int betrag;         //in cent

    void addMoney(int betr, int anzMuenz){
        betrag = betr;
        anzahlMuenzen = anzMuenz;
        //gewicht = gewicht*anzMuenz;
    }

    int getBetrag(){
        return betrag;
    }

    int getGewicht(){
        return gewicht*anzahlMuenzen+215;
    }

}
