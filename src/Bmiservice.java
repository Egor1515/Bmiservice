public class BmiService {
    public int calculate(int weight, int height) {
        int index = weight / (height * 2 / 100);
        return index;
    }

}