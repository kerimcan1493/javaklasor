package java101;

import java.util.Scanner;


public class sinifGecme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int total=0, validNote=0,turkce,mat,fizik ,kimya = 0,muzik;
        double average;

        System.out.print("Matematik Notunu giriniz : ");
        mat=input.nextInt();

        if (mat>=0 && mat<=100){
            total+=mat;
            validNote++;
        }else {
            System.out.println("Hatalı giriş Yaptınız !!");
        }
        System.out.print("Türkçe Notunu giriniz : ");
        turkce=input.nextInt();

        if (turkce>=0 && turkce<=100){
            total+=turkce;
            validNote++;
        }else {
            System.out.print("Hatalı giriş Yaptınız !!");
        }
        System.out.print("Fizik Notunu Giriniz : ");
        fizik=input.nextInt();

        if (fizik>=0 && fizik<=100){
            total+=fizik;
            validNote++;
        }else {
            System.out.println("Hatalı giriş Yaptınız !!");
        }
        System.out.print("Kimya notunu Giriniz :");
        kimya=input.nextInt();
        if (kimya>=0 && kimya<=100){
            total+=kimya;
            validNote++;
        }else {
            System.out.println("Hatalı giriş Yaptınız !!");
        }
        System.out.print("Müzik notunu Giriniz :");
        muzik=input.nextInt();
        if (muzik>=0 && muzik<=100){
            total+=muzik;
            validNote++;
        }else {
            System.out.println("Hatalı giriş Yaptınız !!");
        }


        average= total/validNote;
        System.out.println("Ortalama : "+average);

        if (average>=55){
            System.out.print("Tebrikler Sınıfı Geçtiniz !!");
        }else {
            System.out.print("Maalesef Sınıfta Kaldınız !!");
        }

    }



}
