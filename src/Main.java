public class Main {
    public static void main(String[] args) {
        BmiService calc = new BmiService();
        double bmi = calc.calculate(86, 1.77);
        System.out.println("Body mass index: " + bmi);

    }
}
