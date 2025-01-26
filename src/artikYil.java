import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        int year;
        String artikyil="";
        boolean isError=false;

        Scanner imput = new Scanner(System.in);

        System.out.print("Lütfen bir yıl Giriniz  :  ");
        year = imput.nextInt();

        if (year%4==0){
            if (year%100==0) {
                if (year%400==0){
                    artikyil="year";
                }else {
                    isError=true;
                }
            }else {artikyil="year";
            }

        }else {
            isError=true;
        }
        if (isError){
            System.out.print(year  +  "\tBir artık yıl değildir !!");
        }else {
            System.out.print(year+"\tBir Artık Yıldır.");
        }
    }
}
