package Function;
import java.util.Scanner;

public class ExponentialNumber {
    static int exp(int a,int b){
        int result=1;
        for (int i=1;i<=b;i++){
            result*=a;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base,exp;

        do {
            System.out.println("Enter the Base Number : ");
            base = input.nextInt();

            System.out.println("Enter the Exponential Number : ");
            exp = input.nextInt();

            System.out.println("Result : "+exp(base,exp));
        }while(true);
    }
}
