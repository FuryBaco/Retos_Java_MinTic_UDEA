import java.util.Scanner;

public class TestCoPilot {
    public static void main(String[] args) {
        //random number generator between 1 and 30
        int randomNumber = (int) (Math.random() * 30) + 1;
        //ask user to guess a number
        System.out.println("Guess a number between 1 and 30");
        try (Scanner scanner = new Scanner(System.in)) {
            int guess = scanner.nextInt();
            //if user guess is incorrect, ask again until correct and track number of guesses
            int guesses = 0;
            while (guess != randomNumber) {
                guesses++;
                if (guess > randomNumber) {
                    System.out.println("Too high, try again");
                } else {
                    System.out.println("Too low, try again");
                }
                guess = scanner.nextInt();
                //print  "You win" and number of guesses
                if (guess == randomNumber) {
                    System.out.println("You win");
                    System.out.println("It took you " + guesses + " guesses");
                }
            }
        }
    }
}




