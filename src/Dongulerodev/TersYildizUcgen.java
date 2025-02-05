package Dongulerodev;
import java.util.Scanner;
public class TersYildizUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int digitValue;

        System.out.print("Basamak Sayısını Giriniz : ");
        digitValue = input.nextInt();

        for (int i=digitValue;i>=1;--i){
            for (int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
