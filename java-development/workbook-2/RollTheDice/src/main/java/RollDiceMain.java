public class RollDiceMain {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1;
        int roll2;

        int count2 = 0;
        int count4 = 0;
        int count6 = 0;
        int count7 = 0;

        if (roll1 + roll2 == 2)
            count2++;
        if (roll1 + roll2 == 4)
            count4++;
        if (roll1 + roll2 == 6)
            count6++;
        if (roll1 + roll2 == 7)
            count7++;


        for (int i = 0; i < 100; i++){
            roll1 = dice.roll();
            roll2 = dice.roll();
        }

    }
}
