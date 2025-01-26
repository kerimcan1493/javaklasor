import java.util.Scanner;


public class dairealan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pi=3.14,radius,alan,cevre ;


        System.out.print("Yarıçap Değerini Giriniz  :  ");

        radius = input.nextDouble();
        alan = pi*radius*radius;
        cevre = 2*pi*radius;

        System.out.println("Üçgenin Alanı  :  "+alan);
        System.out.print("Üçgenin Çevresi  :  "+cevre);
    }
}
