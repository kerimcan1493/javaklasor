import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        double armutprc=2.14, elmaprc=3.67, domatesprc=1.11, muzprc=0.95, patlıcanprc=5, totolprc;

        double armut,elma,domates, muz, patlıcan;

        System.out.print("Armut kaç kg  :  ");
        armut =armutprc*imput.nextDouble();

        System.out.print("Elam kaç kg  :  ");
        elma = elmaprc*imput.nextDouble();

        System.out.print("Domates kaç kg  :  ");
        domates = domatesprc*imput.nextDouble();

        System.out.print("Muz kaç kg  :  ");
        muz = muzprc*imput.nextDouble();

        System.out.print("Patlıcan kaç kg  :  ");
        patlıcan = patlıcanprc*imput.nextDouble();

        totolprc = armut+elma+domates+muz+patlıcan;

        System.out.print("Toplam tutar  :  "+totolprc);
    }
}
