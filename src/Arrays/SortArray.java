package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrayNumber;


        System.out.print("Dizinin Boyutu n : ");
        arrayNumber=input.nextInt();

        int[] a = new int[arrayNumber];

        for(int i=0;i<arrayNumber;i++){
            System.out.print("Dizinin Elemanlarını Giriniz : ");
            a[i]=input.nextInt();
        }
        Arrays.sort(a);

        System.out.print("[ ");
        for(int i=0;i<arrayNumber;i++){

            System.out.print(a[i]+"  ");
        }
        System.out.print("]");

    }
}
