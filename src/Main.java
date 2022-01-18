public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.calculate(95, 189);
        System.out.println("Ваш индекс " + index);
    }
}