package Dongulerodev;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit;

        System.out.print("Kaç Elamanlı Fibonacci Serisini Görmek İstiyorsunuz : ");
        digit=input.nextInt();
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2+" ");

        for (int i=2;i<digit;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");
        }

    }
}
