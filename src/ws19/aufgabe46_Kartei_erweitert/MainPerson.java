package ws19.aufgabe46_Kartei_erweitert;
import java.util.Scanner;

class MainPerson{

    private static Scanner sc = new Scanner(System.in);

    public static void main(String [] a){
        /* zuerst wird eine Instanz der PersonenKartei erstellt */
        // runMenu();
        runMenuList();
    }

    private static void runMenuList(){
        PersonenKarteiListe pkl = new PersonenKarteiListe();

        System.out.println("MENÜ:\n" +
                "<1> PERSON IN KARTEI AM ANFANG EINFÜGEN\n" +
                "<2> AUSGABE DER KARTEI\n" +
                "<3> *PLACEHOLDER*\n" +
                "<4> *PLACEHOLDER*\n" +
                "<5> BEENDEN");
        System.out.println();

        String auswahl;
        do{
            System.out.print(">>> Auswahl: ");      auswahl = sc.next();
            switch(auswahl){
                case "1":
                    pkl.insert(new Person());
                    break;
                case "2":
                    pkl.print();
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5": System.out.println("exit ... ");
                    break;
                default:
                    System.out.println("*** Ungültige Eingabe ***");
            }
        }while(!"5".equals(auswahl)) ;
    }

    // old Array
    private static void runMenu(){
        PersonenKartei meineKartei = new PersonenKartei();

        System.out.println("MENÜ:\n" +
                "<1> PERSON IN KARTEI EINFÜGEN\n" +
                "<2> AUSGABE DER KARTEI\n" +
                "<3> SUCHE PERSON ÜBER PNR\n" +
                "<4> PERSON LÖSCHEN\n" +
                "<5> BEENDEN");
        System.out.println();

        String auswahl;
        do{
            System.out.print(">>> Auswahl: ");      auswahl = sc.next();
            switch(auswahl){
                case "1": meineKartei.addNewPerson();
                    break;
                case "2": meineKartei.printKartei();
                    break;
                case "3": meineKartei.searchPerson();
                    break;
                case "4": meineKartei.deletePerson();
                    break;
                case "5": System.out.println("exit ... ");
                    break;
                default:
                    System.out.println("*** Ungültige Eingabe ***");
            }
        }while(!"5".equals(auswahl)) ;
    }
}
