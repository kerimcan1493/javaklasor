package Others;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberEstimation {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int number = rand.nextInt(100);
        int est;
        int right = 0;
        boolean isWin = false;
        boolean isIncorrect = false;
        int[] wrong = new int[5];

        while (right < 5) {
            System.out.println("Please Enter Your Guess : ");
            est = input.nextInt();
            if (est < 0 || est > 100) {
                System.out.println("Enter A Number Between 0-100");
                if (!isIncorrect) {
                    isIncorrect = true;
                    System.out.println("If You enter Another Incorrect Entry You Will Lost One Of The Your Rights");
                } else {
                    System.out.println("You Have Made Too Many Incorrect Entries");
                    System.out.println();
                    right++;
                    System.out.println("Your Remaining Right  :  " + (5 - right));
                }
            } else {
                if (number == est) {
                    System.out.println("Congratulations On The Correct Guess!!!");
                    isWin = true;
                    break;
                } else {
                    wrong[right] = est;
                    right++;
                    System.out.println("Unfortunately, The Wrong Guess");
                    System.out.println();
                    if (est < number) {
                        System.out.println("You Should Increase Your Guess");
                    } else {
                        System.out.println("You Should Dicrease Your Guess");
                    }
                }
                System.out.println("Your Remaining Right  :  " + (5 - right));
                System.out.println();
            }
        }
        if (!isWin) {
            System.out.println("You Lost and Game Over");
            System.out.println("The Right Answer  :  " + number);
            System.out.println("Your Guesses  :  " + (Arrays.toString(wrong)));
        }


    }
}
