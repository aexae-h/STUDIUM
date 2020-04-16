package ws20.aufgabe3_Fuhrpark;

class Fuhrpark {
}

// Ebene 0
class Preise {
    int mietpreis;
}

// Ebene 1
class Leistung extends Preise {
    int motorleisung;
}

// Ebene 2 extends Ebene 0
class Fahrrad extends Preise {
    int groesse;
    int farbe;
}

// Ebene 2 extends Ebene 1
class PKW extends Leistung {
    int anzahlSitze;
}

// Ebene 2 extends Ebene 1
class LKW extends Leistung {
    int zuladung;
}
