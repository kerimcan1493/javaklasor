package Function;
import java.util.Scanner;

public class RecursivePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Enter a number : ");
        number = input.nextInt();
        recursiveMethod(number);

    }
    public static void recursiveMethod(int n) {
        System.out.print(n +" ");
        if (n<=0)
            return;
        recursiveMethod(n-5);
        System.out.print(n +" ");

    }
}
