import java.util.Random;
import java.util.Scanner;

public class GuessStarter {

  public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int randomInt = random.nextInt(100) + 1;
        int userInput;

        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        userInput = in.nextInt();
        System.out.println("Your guess is " + userInput);
        System.out.println("The number I was thinking of is: "+ randomInt);
        System.out.println("You were off by: " + Math.abs(randomInt - userInput));
    }
}