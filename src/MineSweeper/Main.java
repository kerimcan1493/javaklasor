package MineSweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row;
        int column;

        System.out.println("Welcome to the Mine Sweeper");
        System.out.println();

        while (true) {
            System.out.println("Please Enter The Number of The Row For The Game  :  ");
            row = input.nextInt();
            System.out.println("Please Enter The Number of The Column For The Game  :  ");
            column = input.nextInt();
            if (row < 2 || column < 2) {
                System.out.println("Wrong Values !!!\nYou Have to Enter Values Greater Than 1");
                System.out.println();

            } else {
                MineSweeper firstminer = new MineSweeper(row, column);
                firstminer.run();
                break;
            }
        }


    }
}
