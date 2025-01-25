import java.util.Scanner;

public class cinZodyagi {
    public static void main(String[] args) {
        int year;
        String zodiac="";
        boolean isError= false;

        Scanner imput = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : ");
        year = imput.nextInt();

        if (year%12==0){
            zodiac ="Maymun";
        } else if (year%12==1) {
            zodiac="Horoz";
        } else if (year%12==2) {
            zodiac="Köpek";
        } else if (year%12==3) {
            zodiac="Domuz";
        } else if (year%12==4) {
            zodiac="Fare";
        } else if (year%12==5) {
            zodiac="Öküz";
        } else if (year%12==6) {
            zodiac="Kaplan";
        } else if (year%12==7) {
            zodiac="Tavşan";
        } else if (year%12==8) {
            zodiac="Ejderha";
        } else if (year%12==9) {
            zodiac="Yılan";
        } else if (year%12==10) {
            zodiac="At";
        }else {
            zodiac="Koyun";
        }
        System.out.println("Çin Burcunuz : "+zodiac);





    }
}
