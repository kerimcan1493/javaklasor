package Practices;
import java.util.Scanner;
public class YildizElmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak Sayısını Giriniz :");
        int digit = input.nextInt();

        for (int i=1;i<=digit;i++){
            for (int k=1;k<=(digit-i);k++){
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=(digit-1);i>=0;i--){
            for (int k=1;k<=(digit-i);k++){
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
