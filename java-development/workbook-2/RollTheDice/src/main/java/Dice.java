public class Dice {
    public static int roll(){
        int maxValue = 6;
        int minValue =1;
        int randomNumber = (int)(Math.random() * maxValue) + minValue;
        return randomNumber;
    }
}
