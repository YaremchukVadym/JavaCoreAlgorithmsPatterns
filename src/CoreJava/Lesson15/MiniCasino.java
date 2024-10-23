package CoreJava.Lesson15;

import java.util.Random;

public class MiniCasino {
    static int counter = 1;

    public static void main(String[] args) {
        int money = 10000;
        Random random = new Random();

        while (money > 0) {

            int randomWin = random.nextInt(75) + 1;
            int randomLose = random.nextInt(100) + 1;

            boolean win = random.nextBoolean();
            counter++;

            System.out.println("Game number: " + counter);
            if (win) {
                money += randomWin;
                System.out.println("You win: " + randomWin);
            } else {
                money -= randomLose;
                System.out.println("You lose: " + randomLose);
            }

            if (money <= 0) {
                System.out.println("Game over! You've lost all your money.");
            } else {
                System.out.println("Your money after this round: " + money);
            }

            System.out.println("--------------------------------");

        }
    }

}
