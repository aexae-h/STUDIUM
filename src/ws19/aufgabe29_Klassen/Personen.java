package ws19.aufgabe29_Klassen;

class Personen {

    private int pnr;
    private String name;
    private int zip;
    private String ort;

    Personen(int pnr, String name, int zip, String ort){
        this.pnr = pnr;
        this.name = name;
        this.zip = zip;
        this.ort = ort;
    }

    /** SET METHODS */
    public void setPnr(int pnr){
        this.pnr = pnr;
    }
    public void setName(String pnr){
        this.name = name;
    }
    public void setZip(int zip){
        this.zip = zip;
    }
    public void setOrt(String ort){
        this.ort = ort;
    }

    /** GET METHODS */
    int getPnr(){
        return this.pnr;
    }
    String getName(){
        return this.name;
    }
    int getZip(){
        return this.zip;
    }
    String getOrt(){
        return this.ort;
    }

}