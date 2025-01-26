import java.util.Scanner;

 class ucgenalan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c;
        double u,alan;

        System.out.print("1.kenarı giriniz  :  ");
        a=input.nextInt();

        System.out.print("2.kenarı giriniz  :  ");
        b=input.nextInt();

        System.out.print("3.kenar giriniz  :  ");
        c=input.nextInt();

        u=(a+b+c)/2;


        alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgenin Alanı  :  "+ alan);






    }
}