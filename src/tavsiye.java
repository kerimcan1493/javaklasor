import java.util.Scanner;

public class tavsiye {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int temp;

        System.out.print("Hava Sıcaklığını Giriniz : ");
        temp = imput.nextInt();

        if (temp<5){
            System.out.print("Kayak Yapabilirsiniz.");
        } else if (temp>=5 && temp<=25) {
            if (temp<=15){
                System.out.println("Sinemaya Gidebilirsin . ");
            }
            if (temp>=10){
                System.out.print("Piknik Yapabilirsiniz. ");
            }

        }else {
            System.out.print("Yüzmeye Gidebilirsiniz. ");
        }
    }
}
