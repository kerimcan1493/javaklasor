package Practices;

import java.util.Scanner;

public class HomeWork41 {
    public static void main(String[] args) {
        //Kombinasyon Hesaplayan Program
        Scanner input = new Scanner(System.in);
        int a,d,com;
        int total=1, totaltwo=1,totalthree=1;

        System.out.print("Kombinasyonunu Almak İstediğiniz Sayı :");
        a = input.nextInt();

        for (int b=1;b<=a;b++){
            total *=b;
        }
        System.out.print("Kaçlı Kombinasyonu Almak İstiyorsun : ");
        d=input.nextInt();

        for (int c=1; c<=d;c++){
            totaltwo*=c;
        }
        for (int e=1;e<=(a-d);e++){
            totalthree*=e;
        }
        com = total/(totaltwo*totalthree);
        System.out.print(com);
    }
}
