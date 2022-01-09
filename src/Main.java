public class Main {
    public static void main(String[] args) {
    Bmiservice service = new Bmiservice();
    double index = service.calculate(95, 189);
        System.out.println("Ваш индекс " + index);
    }
}