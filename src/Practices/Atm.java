package Practices;
import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        String username,password;
        int balance=2000;
        int choise,right=3;

        for (int i=1;i<=3;i++){
            System.out.print("Kullanıcı Adınızı Giriniz : ");
            username = inp.nextLine();

            System.out.print("Şifrenizi Giriniz : ");
            password = inp.nextLine();

            if (username.equals("patika")&& password.equals("java123")){
                System.out.println("ATM'ye Hoşgeldiniz.");
                do {
                    System.out.print("Yapmak İstediğiniz İşlemi Seçiniz : \n1-Para Yatırma \n2-Para Çekme \n3-Bakiye Sorgulama\n4-Çıkış Yap\n");
                    choise = inp.nextInt();
                    switch (choise){
                        case 1:
                            System.out.print("Yatırmak İstediğiniz Tutarı Giriniz : ");
                            int amont = inp.nextInt();
                            balance+=amont;
                            System.out.println("Bakiyeniz : "+balance);
                            break;
                        case 2:
                            System.out.print("Çekmek İstediğiniz Tutarı Giriniz : ");
                            int amont2 = inp.nextInt();
                            if (amont2<balance){
                                balance-=amont2;
                                System.out.println("Bakiyeniz : "+balance);
                            }else {
                                System.out.println("Bakiyeniz Yetersiz.");
                                System.out.println("Mevcut Bakiyniz : "+balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : "+balance);
                            break;
                        default:
                            System.out.println("Sistemden Çıkış Yaptınız.");
                    }
                }
                while (choise!=4);
               // Buraya "break;" komutu eklenerek sistemin tamamen kapanması sağlanabilir.
                //fakat bu şekilde kalırsa sistem sürekli açık kalacak, normal atm lerdeki gibi.

            }
            else {
                --right;
                System.out.println("Hatalı Kullanıcı Adı veya Şifre Girdiniz.\nKalan Hakkınız : "+right);

            }
        }


        }


}
