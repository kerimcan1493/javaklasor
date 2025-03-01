package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;
        int column;


        System.out.println("Enter the Number of Rows  :  ");
        row = input.nextInt();

        System.out.println("Enter the Number of Column  : ");
        column = input.nextInt();

        int[][] arr=new int[row][column];

        System.out.println("Please Enter The Array Values  :  ");
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print("["+i+"]"+"["+j+"]"+" : ");
                arr[i][j]=input.nextInt();
            }
        }
        System.out.println("Original Array");
        for (int i=0;i<row;i++){
            for (int j =0;j<column;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int[][] transpose = new int[column][row];

        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                transpose[j][i]=arr[i][j];
            }
        }
        System.out.println("Transpose Array");

        for (int i=0;i<column;i++){
            for (int j=0;j<row;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
