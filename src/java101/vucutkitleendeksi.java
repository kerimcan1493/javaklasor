package java101;

import java.util.Scanner;

public class vucutkitleendeksi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double kilo,boy,endeks;

        System.out.print("Lütfen Boyunuzu (metre cinsinden) giriniz :  ");
        boy = input.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz  :  ");
        kilo = input.nextDouble();

        endeks = kilo/(boy*boy);
        System.out.print("Vücet Kitle endeksiniz  :  "+endeks);


    }
}
