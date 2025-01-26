import java.util.Scanner;

public class taksi {
    public static void main(String[] args) {
        double km,   tutar,   perkm=2.2 ,  startprice=10;

        Scanner input=new Scanner(System.in);

        System.out.print("Kilometreyi Giriniz  :  ");

        km=input.nextDouble();

        tutar = km*perkm+startprice;

        tutar= (tutar<20) ? 20  :  (tutar);

        System.out.print("Net tutar  :  "  +tutar);










    }
}
