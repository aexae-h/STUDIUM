package ws19.onlineTest2014;

class PrintL {

    static StringBuilder sb = new StringBuilder();

    static void prL(int indent, int h, int b){

        /** oberer Strich */
        for(int i = 0; i < h-1; i++){
            for (int j = 0; j < indent; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }

        /** untere Linie */
        for (int j = 0; j < indent; j++){
            System.out.print(" ");
        }
        for (int j = 0; j < b; j++){
            System.out.print("*");
        }
    }

    static int anzTeiler(int n, int m){
        int count = 0;
        while(n%m == 0){
            count++;
            n = n/m;
        }
        return count;
    }

    static String xChange(String s, char x){

        sb.append(s);
        for (int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == x){
                sb.setCharAt(i,'U');
            }
        }
        return sb.toString();
    }



}
