package Practices;
import java.sql.SQLOutput;
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int nbr1,nbr2;
        int j,ekok=1;
        int ebob=1;
        System.out.print("n1 Sayısı : ");
        nbr1 = inp.nextInt();

        System.out.print("n2 Sayısı : ");
        nbr2 = inp.nextInt();

        if (nbr1<nbr2){
            for (int i=1;i<=nbr1;i++){
                if (nbr1%i==0 && nbr2%i==0){
                    ebob = i;
                }
                ekok = (nbr1*nbr2)/ebob;
            }
            System.out.println("EBOB : "+ebob);
            System.out.println("EKOK : "+ekok);
        }
        else {
            for (int i=1;i<=nbr2;i++){
                if (nbr1%i==0 && nbr2%i==0){
                    ebob = i;
                }
                ekok = (nbr1*nbr2)/ebob;
            }
            System.out.println("EBOB : "+ebob);
            System.out.println("EKOK : "+ekok);
        }


    }
}


