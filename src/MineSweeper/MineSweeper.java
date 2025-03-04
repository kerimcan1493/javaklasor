package MineSweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    int row;
    int column;
    String[][] map;
    String[][] playerMap;
    int size;
    boolean isWin = true;


    MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
        this.map = new String[row][column];
        this.playerMap = new String[row][column];
        this.size = row * column;
    }

    void run() {
        int rowNumber;
        int colNumber;
        int theBoxCounts = 0;
        enterMine();
        print(map);
        System.out.println("The Game Has Started");
        while (isWin) {
            System.out.println("==============");
            print(playerMap);
            System.out.println("Enter a Row Number : ");
            rowNumber = input.nextInt();
            System.out.println("Enter a Column number : ");
            colNumber = input.nextInt();

            if (rowNumber < 0 || rowNumber > row - 1) {
                System.out.println("You Entered Wrong Position");
                continue;
            }
            if (colNumber < 0 || colNumber > column - 1) {
                System.out.println("You Entered Wrong Position");
                continue;
            }
            if (!this.map[rowNumber][colNumber].equals("*")) {
                if (this.playerMap[rowNumber][colNumber].equals("-")) {
                    check(rowNumber, colNumber);
                    theBoxCounts++;
                    if (theBoxCounts >= (this.size - this.size / 4)) {
                        System.out.println("Congratulations !!!  You Won !!!");
                        print(playerMap);
                        break;
                    }

                } else {
                    System.out.println("You Entered The Same Position");
                }
            } else {
                System.out.println("Game Over !!!");
                break;
            }
        }
    }

    void check(int r, int c) {
        int counter = 0;
        if (r > 0 && c > 0) {
            if (this.map[r - 1][c - 1].equals("*")) {
                counter++;
            }
        }
        if (r > 0 && this.map[r - 1][c].equals("*")) {
            counter++;
        }
        if (r > 0 && c < this.column - 1) {
            if (this.map[r - 1][c + 1].equals("*")) {
                counter++;
            }
        }
        if (c > 0 && this.map[r][c - 1].equals("*")) {
            counter++;
        }
        if (c < this.column - 1 && this.map[r][c + 1].equals("*")) {
            counter++;
        }
        if (r < this.row - 1 && c > 0) {
            if (this.map[r + 1][c - 1].equals("*")) {
                counter++;
            }
        }
        if (r < row - 1 && map[r + 1][c].equals("*")) {
            counter++;
        }
        if (r < row - 1 && c < column - 1) {
            if (map[r + 1][c + 1].equals("*")) {
                counter++;
            }
        }
        playerMap[r][c] = String.valueOf(counter);
    }

    void enterMine() {
        int randomRow;
        int randomCol;
        int count = 0;

        while (count != size / 4) {
            randomRow = rand.nextInt(this.row);
            randomCol = rand.nextInt(this.column);
            if (this.map[randomRow][randomCol] == null) {
                this.map[randomRow][randomCol] = "*";
                count++;
            }
        }
    }

    void print(String[][] str) {
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                if (str[i][j] == null) {
                    str[i][j] = "-";
                }
                System.out.print(str[i][j] + " ");
            }
            System.out.println();
        }

    }


}
