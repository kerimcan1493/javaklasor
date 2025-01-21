import java.util.Scanner;


public class hipotenus {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        double kısaKenar , uzunKenar, hipo;

        System.out.print("Kısa kenar giriniz  :  ");
        kısaKenar=imput.nextInt();
        System.out.print("Uzun kenarı giriniz  :  ");
        uzunKenar=imput.nextInt();

        hipo= Math.sqrt(kısaKenar*kısaKenar+uzunKenar*uzunKenar);
        System.out.print("hipotenüs  :  " + hipo);

    }
}
