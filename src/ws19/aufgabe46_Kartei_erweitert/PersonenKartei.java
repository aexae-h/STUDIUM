package ws19.aufgabe46_Kartei_erweitert;

import java.util.Scanner;

class PersonenKartei{
    // Scanner
    private Scanner sc = new Scanner(System.in);

    /* ein Array von Personen */
    private Person[] kartei;

    /* ein Zaehler, der sich merkt,
     * wieviele Personen bereits eingetragen sind
     */
    private int counter;

    /* Konstuktor:
     * instanziiert das Array mit einer Groesse von 10 Elementen
     */
    PersonenKartei(){
        kartei = new Person[10];
    }

    /* Die Person, die im Parameter ubergeben wurde
     * in der Kartei einfuegen
     */
    void addPerson(Person p){
        counter++;
        for(int i = 0; i < kartei.length; i++){
            if(kartei[i] == null){
                kartei[i] = p;
            }
        }
    }

    /* Eine neue Person anlegen und
     * Parameter dieser Person-Instanz von der Konsole einlesen */
    void addNewPerson(){
        counter++;
        for(int i = 0; i < kartei.length; i++){
            if(kartei[i] == null){
                kartei[i] = new Person();;
                break;
            }
        }
    }

    // Ausgeben aller Personen
    void printKartei(){
        for (Person person : kartei) {
            if (person == null) {
                System.out.println("null");
            } else {
                person.printPerson();
            }
        }
    }

    /* Suchen einer Person mit der Personennummer n
     * und ausgeben der Personendaten (Attribute),
     * wenn diese Person da ist
     */
    void searchPerson(int n){
        for (Person person : kartei) {
            if (person.isPnr(n)) {
                person.printPerson();
            }
        }
    }

    /*
     * Einlesen einer Personennummer und anschliessend
     * suchen nach der Person mit der eingegeben Personennummer
     * und ausgeben der Personendaten (Attribute),
     * falls diese Person vorhanden ist
     */
    void searchPerson(){
        System.out.print("> Suche PNR: ");        int pn = sc.nextInt();
        for (Person person : kartei) {
            try {
                if (person.isPnr(pn)) {
                    person.printPerson();
                }
            } catch (Exception ignored) {
            }
        }
    }

    void deletePerson(){
        System.out.print("> Person löschen > PNR: ");        int pn = sc.nextInt();
        for(int i = 0; i < kartei.length; i++){
            if(kartei[i].isPnr(pn)){
                kartei[i] = null;
            }
        }
    }
}
