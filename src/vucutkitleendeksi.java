import java.util.Scanner;

public class vucutkitleendeksi {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        double kilo,boy,endeks;

        System.out.print("Lütfen Boyunuzu (metre cinsinden) giriniz :  ");
        boy = imput.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz  :  ");
        kilo = imput.nextDouble();

        endeks = kilo/(boy*boy);
        System.out.print("Vücet Kitle endeksiniz  :  "+endeks);


    }
}
