package ws20.Wrapper;

class WrapTest {
    private Double[] dArr;
    // Konstruktor
    WrapTest(int s){
        input(s);
    };

    // input automatisch über Konstruktor
    void input(int size){
        dArr = new Double[size];
        for(int i = 0; i < size; i++){
            dArr[i] = new Double(i+1.5);
        }
    }

    public void output(){
        for(int i = 0; i < dArr.length; i++){
            System.out.println(dArr[i].doubleValue());
        }
    }
}

class MainWrap {
    public static void main(String[] args) {
        WrapTest wp = new WrapTest(10);
        wp.output();
    }
}
