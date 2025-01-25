import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {

        Scanner imp = new Scanner(System.in);

        int n1, n2, select;

        System.out.print("Birinci Sayıyı Giriniz  :  ");
        n1 = imp.nextInt();


        System.out.print("İkinci Sayıyı Giriniz  :  ");
        n2 = imp.nextInt();

        System.out.println("Yaoacağınız işlem türünü seçiniz  : \n1-Toplama\n2-Çıkartma\n3-çarpma\n4-bölme");
        select = imp.nextInt();

        if (select == 1) {
            System.out.println("Toplam  :  " + (n1 + n2));
        } else if (select == 2) {
            System.out.println("Sonuç  :  " + (n1 - n2));
        } else if (select == 3) {
            System.out.println("Sonuç  :  " + (n1 * n2));
        } else if (select == 4) {
            if(n2!=0){
                System.out.println("Sonuç  :  " + (n1 / n2));
            }else {
                System.out.println("Hiçbir sayı 0'a Bölünmez");
            }
        } else {
            System.out.println("Hatalı Giriş");


        }

    }


}

