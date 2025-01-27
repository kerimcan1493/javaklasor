import java.util.Scanner;

public class homeWork42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        int total=1;
        System.out.print("Üssü Alıncaka Sayı : ");
        a = input.nextInt();

        System.out.print("Üs Olcak Sayı : ");
        b = input.nextInt();

        for (int i=1;i<=b;i++){
            total*=a;
        }
        System.out.print(total);
    }
}
