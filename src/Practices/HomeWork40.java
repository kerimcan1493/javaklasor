package Practices;

import java.util.Scanner;

public class HomeWork40 {
    public static void main(String[] args) {
        // 4'ün ve 5'in Kuvvetlerini bulan Program
        Scanner input = new Scanner(System.in);

        int nmbr,i=1,a=1;

        System.out.print("Bir Sayı Giriniz : ");
        nmbr = input.nextInt();

        System.out.println("4'ün Kuvvetleri : ");

        while (i<=nmbr){
            System.out.println(i);
            i*=4;
        }

        System.out.println("5'in Kuvvetleri : ");

        while (a<=nmbr){
            System.out.println(a);
            a*=5;
        }
    }
}
