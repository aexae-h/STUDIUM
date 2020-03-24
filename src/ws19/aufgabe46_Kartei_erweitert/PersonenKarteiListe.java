package ws19.aufgabe46_Kartei_erweitert;

class PersonenKarteiListe {

    // innere Klasse für Element
    public static class ElementL {
        Person element;
        ElementL next;

        // Konstruktor, Objekt als Übergabe
        public ElementL(Person p) {
            element = p;
            next = null;
        }

        // Hilfs-Methode um zu sehen ob Element ein Nachfolger hat
        public boolean hasNext() {
            return this.next != null;
        }
    }

    // Kopf Referenz, keine Instanz
    public ElementL head;

    // leerer Konstruktor
    public PersonenKarteiListe(){
        head = null;
    }

    // Methode um Objekt am Anfang einzufügen
    public void insertBegin(Person p){
        ElementL newEl = new ElementL(p);
        if(head == null){
            head = newEl;
        } else {
            newEl.next = head;
            head = newEl;
        }
    }

    // Methode um Objekt am Ende einzufügen
    public void insertEnd(Person p){
        ElementL newEl = new ElementL(p);
        ElementL iterator = head;
        if(head == null){
            head = newEl;
        } else {
            while(iterator.hasNext()){
                iterator = iterator.next;
            }
            iterator.next = newEl;
        }
    }

    // Methode um Objekte sortiert einzufügen
    public void insert(Person p){
        ElementL newEl = new ElementL(p);
        ElementL iterator = head;
        // Falls Liste leer ist ...
        if(head == null){
            head = newEl;
        } else {
            // durchlaufen ...
            while (newEl.element.getPnr() > iterator.element.getPnr()){
                // falls das nächste Element null ist, also das Ende der Liste ...
                if(iterator.next == null){
                    iterator.next = newEl;
                    break;
                } else if(newEl.element.getPnr() < iterator.element.getPnr()) {
                    newEl.next = iterator;
                    iterator = newEl;
                } else {
                    iterator = iterator.next;
                }
            }
        }
    }

    // Ausgabe der Liste
    public void print(){
        ElementL iterator = head;
        if(head == null){
            System.out.println("null");;
        } else {
            while(iterator.hasNext()){
                iterator.element.printPerson();
                iterator = iterator.next;
            }
            iterator.element.printPerson();
        }
    }
}