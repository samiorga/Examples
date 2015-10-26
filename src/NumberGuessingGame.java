
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class NumberGuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //make a scanner
        Scanner input = new Scanner(System.in);

        //create a random number from1 to 100
        int randomNumber = (int) (Math.random() * 100) + 1;

        while (true) {
            System.out.println("Guess a number between 1 and 100");
            int guess = input.nextInt();

            //force a number between 1 and 100
            while (guess < 1 || guess > 100) {
                System.out.println("Try again. Enter a number between 1 and 100");
                guess = input.nextInt();
            }
            //check the guess
            //guess is correct
            if (guess == randomNumber) {
                System.out.println("You Win!!");
                break;
                //guess is too high
            } else if (guess > randomNumber) {
                System.out.println("Too High");
                //guess is too low
            } else {
                System.out.println("Too Low");
            }
        }
    }
}
