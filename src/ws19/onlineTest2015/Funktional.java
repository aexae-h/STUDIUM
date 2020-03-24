package ws19.onlineTest2015;

class Funktional {

    static void numbers(int von, int bis, int keinTeiler){

        for(int i = von; i <= bis; i++)
            if(!(i%keinTeiler==0 || i%4==0)){
                System.out.println(i);
            }
    }

    static double meanValue(int x1, int x2){
        return (double)(x1+x2+571)/3;
    }


}
