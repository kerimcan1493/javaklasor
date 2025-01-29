package Practices;

import java.util.Scanner;

public class Homework39 {
    public static void main(String[] args) {
        // Tek Sayı Girilene Kadar 2 ve 4 ün katları olan sayıları toplayan program
        Scanner inp = new Scanner(System.in);
        int nmbr,total=0;
        do {
            System.out.print("Bir Sayı Giriniz  :  ");
            nmbr = inp.nextInt();
            if (nmbr%2==0 && nmbr%4==0){
                total+=nmbr;
            }

        }while (nmbr%2==0);
        System.out.print("Toplam  :  "+total);
    }
}
