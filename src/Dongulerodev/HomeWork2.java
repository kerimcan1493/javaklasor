package Dongulerodev;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        // Mükemmel sayıyı bulan program
        Scanner input = new Scanner(System.in);

        int number;
        int total=0;

        System.out.print("Bir Sayı Giriniz : ");
        number = input.nextInt();

        for (int i=1;i<number;i++){
            if (number%i==0){
                total+=i;
            }
        }
        if (total==number){
            System.out.print(number+"   Bir Mükemmel Sayıdır");
        }else {
            System.out.print(number +"   Bir Mükemmel Sayı Değildir.");
        }

    }
}
