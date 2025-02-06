package Dongulerodev;

public class AsalSayilar {
    public static void main(String[] args) {


        for (int i=1;i<=100;i++){
            boolean asalMi=true;
            for (int k=2;k<i;k++){
                if (i%k==0){
                    asalMi=false;
                }
            }
            if (asalMi){
                System.out.println(i+"  Bir Asal Sayıdır.");
            }
        }
    }
}
