package java101;

import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, passWord, girdi, newPassWord;

        System.out.print("Kullanca Adını Giriniz :");
        userName = input.nextLine();

        System.out.print("şifreniz : ");
        passWord = input.nextLine();

        if (userName.equals("patika") && passWord.equals("java123")) {
            System.out.println("Giriş Yaptınız");
        } else {
            System.out.println("Hatalı Giriş");
            System.out.println("Şifrenizi değiştirmek ister misiniz?\n  y/n");
            girdi = input.nextLine();

            if (girdi.equals("y")) {
                System.out.println("Yeni Şifrenizi Giriniz : ");
                newPassWord = input.nextLine();
                if (newPassWord.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                }else{
                    System.out.println("Şifre oluşturuldu");
                }
            }else {
                System.out.println("Giriş yapılamadı");
            }
        }




    }
}

