package Dongulerodev;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int numberQuantity;
        int firstnumber,numbers;

        System.out.println("Kaç Adet Sayı Girmek İstiyorsunuz : ");
        numberQuantity = inp.nextInt();

        System.out.print("Bir Sayı Giriniz: ");
        firstnumber = inp.nextInt();

        int min = firstnumber;
        int max = firstnumber;


        for (int i=1;i<numberQuantity;i++){
            System.out.print("Bir Sayı Giriniz :");
            numbers = inp.nextInt();

            if (min>numbers){
                min =numbers;
            }
            if (max<numbers){
                max=numbers;
            }
        }
        System.out.println("En Küçük Sayı : "+min);
        System.out.print("En Büyük Sayı : "+max);
    }
}
