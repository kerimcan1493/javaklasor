package Function;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        number = input.nextInt();
        asalSayi(number);
        if (asalSayi(number)==false){
            System.out.println(number+"  is not a prime number.");
        }else
            System.out.println(number+ "  is a prime number.");



    }
    static boolean asalSayi(int gSayi) {
        int sinir = gSayi / 2, i = 2;
        while (i <= sinir) {
            if (gSayi % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

}
