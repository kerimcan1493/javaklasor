package java101;

import java.util.Scanner;

public class boluneBilenSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nmbr,adet=0,toplam=0,i;

        System.out.print("Bir Sayı Giriniz : ");
        nmbr = input.nextInt();

        for (i=1;i<nmbr;i++){
            if (i%3==0 && i%4==0){
                adet++;
                toplam+=i;
                System.out.println(i);
            }
        }System.out.println("Sayıların toplamı  :  "+toplam);

    }
}
