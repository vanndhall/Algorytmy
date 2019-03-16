package MonteCarlo;

public class Main {
    public static void main(String[] args) {
        MonteCarloPi calculator = new MonteCarloPi();
        System.out.println(calculator.getPi(500000));
    }
}
