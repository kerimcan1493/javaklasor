package homeworks;

import java.util.Scanner;

public class Homework39 {
    public static void main(String[] args) {
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
