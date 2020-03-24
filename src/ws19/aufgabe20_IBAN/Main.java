package ws19.aufgabe20_IBAN;

class Main {

    public static void main(String[] args) {
            System.out.println("IBAN:"+calcIBAN('d','e',70090100, 1234567890));
         }

    private static long calcBBAN(long blz, long ktoNr) {
            return blz* 10000000000L + ktoNr;
    }

    private static char toBig (char c) {
        if (c >= 'a' && c <= 'z') {
            return (char)(c - 0x20);
        }
    return c;
    }

    private static long calcLandKennung (char land1, char land2) {

        int i1 = toBig(land1) - 0x40 + 9; // 4
        int i2 = toBig(land2) - 0x40 + 9; // 5

        return i1*10000+i2*100;
    }

    private static String calcPruefziffer (char land1, char land2, long blz, long ktoNr) {
        long modBBAN = calcBBAN(blz, ktoNr) % 97;
        long mod2gether = modBBAN * 1000000L + calcLandKennung(land1, land2);

        if (98 - (mod2gether % 97) < 10) {
            return "0" + (98 - (mod2gether % 97));
        } return String.valueOf(98 - (mod2gether % 97));
    }

    private static String calcIBAN (char land1, char land2, long blz, long ktoNr) {
        return "" + toBig(land1) + toBig(land2) + calcPruefziffer(land1, land2, blz, ktoNr) + calcBBAN(blz, ktoNr);
    }
}
