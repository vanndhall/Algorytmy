package algorytmy;

public class Main {
    public static void main(String[] args){
        MyHelper myHelper = new MyHelper();
        int x = myHelper.pobierzLiczbe();
        int y = myHelper.pobierzLiczbe("Prosze podaj ");
        System.out.println("Moja liczba to= "+x);

    }
}

