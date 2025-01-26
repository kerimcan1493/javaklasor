import java.util.Scanner;

public class hesapmakine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, select;

        System.out.print("Birinci Rakamı Giriniz  :  ");
        n1 = input.nextInt();

        System.out.print("İkinci rakamı Giriniz  .  ");
        n2 = input.nextInt();

        System.out.println("işlem türünü seçiniz: \n" +
                "1-toplama\n" +
                "2-çıkartma\n" +
                "3-çarpma\n" +
                "4-bölme");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Sonuç  :  " + (n1 + n2));
                break;
            case 2:
                System.out.print("Sonuç : " + (n1 - n2));
                break;
            case 3:
                System.out.print("Sonuç : " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.print("Hiçbir Sayı 0'a Bölünemez");
                }else{
                    System.out.print("Sonuç : " + (n1 / n2));
                }break;
            default:
                    System.out.print("Hatalı Giriş yaptınız");
        }


    }
}
