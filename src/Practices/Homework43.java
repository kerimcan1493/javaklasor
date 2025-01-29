package Practices;
import java.util.Scanner;

public class Homework43 {
    public static void main(String[] args) {
        // Basamak Sayıysı Değerlerini Hesaplayan Program

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        int nmbr = input.nextInt();
        int result=0, digitValue =0;

       while (nmbr != 0){
            digitValue = nmbr % 10;
           nmbr/=10;
           result+=digitValue;

        }
        System.out.println(result);


    }
}
