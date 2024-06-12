import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        int[] testScores = {100, 69, 420, 666, 999, 25, 82, 777, 28, 99};
        double average = calculateAverage(testScores);
        int highScore = calculateHighScore(testScores);
        int lowScore = calculateLowScore(testScores);

        System.out.println("Average: " + average);
        System.out.println("High score: " + highScore);
        System.out.println("Low score: " + lowScore);
    }

    public static double calculateAverage(int[] scores) {
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum / scores.length;


    }

    public static int calculateHighScore(int[] scores) {
        Arrays.sort(scores);
        return scores[scores.length - 1];
    }

    public static int calculateLowScore(int[] scores) {
        Arrays.sort(scores);
        return scores[0];
    }

}



