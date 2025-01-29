package homeworks;

import java.util.Scanner;
public class HomeWork44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nmbr;
        double result=0;

        System.out.print("Bulmak İstediğiniz Harmonik Sayı Değerini Giriniz :");
        nmbr = input.nextInt();

        for (double i=1;i<=nmbr;i++){
            result+=(1/i);
        }
        System.out.println(result);

    }
}
