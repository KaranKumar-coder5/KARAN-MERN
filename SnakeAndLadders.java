import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadders {

    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);
        Random rand = new Random();

        int pos = 1;
        int goal = 50;

        System.out.println("Simple Snake & Ladders (1 Player)");
        System.out.println("Reach 50 to win.\n");

        while (pos < goal) {

            System.out.print("Press ENTER to roll dice...");
            value.nextLine();

            int dice = rand.nextInt(6) + 1;
            System.out.println("You rolled: " + dice);

            pos += dice;
            if (pos > goal) pos = goal;

            System.out.println("You moved to: " + pos);

            if (pos == 3) {
                pos = 15;
                System.out.println("Ladder to 15");
            }
            if (pos == 8) {
                pos = 22;
                System.out.println("Ladder to 22");
            }
            if (pos == 20) {
                pos = 35;
                System.out.println("Ladder to 35");
            }
            if (pos == 28) {
                pos = 45;
                System.out.println("Ladder to 45");
            }

            if (pos == 30) {
                pos = 12;
                System.out.println("Snake to 12");
            }
            if (pos == 40) {
                pos = 25;
                System.out.println("Snake to 25");
            }

            System.out.println("Your position: " + pos + "\n");
        }

        System.out.println("You win! Reached 50!");
        value.close();
    }
}
