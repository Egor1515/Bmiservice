public  class Bmiservice {
    public int calculate(int weight, int hight){
       int index = weight / (hight*2/100);
        return index;
    }

}