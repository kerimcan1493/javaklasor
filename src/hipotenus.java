import java.util.Scanner;


public class hipotenus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kısaKenar , uzunKenar, hipo;

        System.out.print("Kısa kenar giriniz  :  ");
        kısaKenar=input.nextInt();
        System.out.print("Uzun kenarı giriniz  :  ");
        uzunKenar=input.nextInt();

        hipo= Math.sqrt(kısaKenar*kısaKenar+uzunKenar*uzunKenar);
        System.out.print("hipotenüs  :  " + hipo);

    }
}
