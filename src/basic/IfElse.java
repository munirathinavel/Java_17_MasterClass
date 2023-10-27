package basic;

public class IfElse {
    public static void main(String[] args) {
        calculateScore();
        m1();
    }

    private static void calculateScore() {
        int score = 1000;
        int levelCompleted = 8;
        int bonus = 200;
        boolean gameOver = true;

        if (gameOver) {
            System.out.println("Total Score is:" + ((levelCompleted * bonus) + score));
        }
    }

    static String m1() {
        if (1000 > 3) {
            return "val1";
        }
        return null;
    }
}
