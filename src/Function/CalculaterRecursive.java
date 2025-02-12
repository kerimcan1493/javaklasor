package Function;
import java.util.Scanner;

public class CalculaterRecursive {
    static void sum(int a, int b){
        int result = a+b;
        System.out.println("Sum = "+result);
    }
    static void minus(int a,int b){
        int result = a-b;
        System.out.println("Extraction = "+result);
        }
    static void times(int a,int b){
        int result=a*b;
        System.out.println("Multiplication = "+result);
    }
    static void diveded(int a,int b){
        int result = a/b;
        System.out.println("Divided = "+result);
    }
    static void power(int a,int b){
        int result=1;
        for (int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println("Evponential Result = "+result);
    }
    static void mod(int a,int b){
        int result = a%b;
        System.out.println("Mod = "+result);
    }
    static void rectangle(int a,int b){
        int perimeter=2*(a+b);
        int area =a*b;
        System.out.println("rectangle Perimeter :  "+perimeter);
        System.out.println("Area : "+area);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int select;
        int n1,n2;

        String menu = "1-Sum\n" +
                "2-Extraction\n" +
                "3-Multiplication\n" +
                "4-Diveded\n" +
                "5-Expotential Number\n" +
                "6-Mod\n" +
                "7-Rectangle Perimeter and Area Calculation\n" +
                "8-Exit";

        do {
            System.out.println(menu);
            System.out.println("Select an Operation : ");
            select=input.nextInt();
            if (select>=1 && select<=7){
                System.out.println("Enter The First Number : ");
                n1 = input.nextInt();
                System.out.println("Enter The Second Number : ");
                n2 = input.nextInt();
                switch (select){
                    case 1:
                        sum(n1,n2);
                        break;
                    case 2:
                        minus(n1,n2);
                        break;
                    case 3:
                        times(n1,n2);
                        break;
                    case 4:
                        diveded(n1,n2);
                        break;
                    case 5:
                        power(n1,n2);
                        break;
                    case 6:
                        mod(n1,n2);
                        break;
                    case 7:
                        rectangle(n1,n2);
                        break;
                    default:
                        System.out.println("Bye Bye ");
                        break;
                }

            }
            else if (select==8)
                break;
            else
                System.out.println("You Entered An İnvalid Trasaction");

        }while (select!=0);

    }
}
