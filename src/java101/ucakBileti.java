package java101;

import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {
        int km, age, type;
        double totalPrice = 0;
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz : ");
        km = input.nextInt();

        if (km > 0) {
            totalPrice = km * 0.10;

            System.out.println("Yaş Aralığınız:\n 1-(0-11)\n2-(12-24)\n3-(24-65)\n4-(65+) ");
            age = input.nextInt();

            switch (age) {
                case 1:
                    totalPrice -= totalPrice * 0.5;
                    break;
                case 2:
                    totalPrice -= totalPrice * 0.10;
                    break;
                case 3:
                    totalPrice = totalPrice;
                    break;
                case 4:
                    totalPrice -= totalPrice * 0.3;
                    break;
                default:
                    isError = true;


            }
            System.out.println("Yolculuk Tipini seçiniz :\n1-(Tek Yön)\n2-(Gidiş Dönüş)");
            type = input.nextInt();

            switch (type) {
                case 1:
                    totalPrice = totalPrice;
                    break;
                case 2:
                    totalPrice = 2 * (totalPrice -= totalPrice * 0.20);
                    break;
                default:
                    isError = true;

            }
        } else {
            isError = true;
        }
        if (isError) {
            System.out.print("Hatalı veri Girdiniz!!");
        } else {
            System.out.println("Toplam tutar : " + totalPrice);
        }

    }
}
