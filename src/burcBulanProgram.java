import java.util.Scanner;

public class burcBulanProgram {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int month, day;
        String burc = "";
        boolean isError = false;

        System.out.print("Kaçıncı ayda Doğduğunuzu Giriniz :");
        month = imput.nextInt();


        System.out.print("Ayın Kaçında Doğdunuz : ");
        day = imput.nextInt();

        if (month == 1) {
            if (day > 0 && day < 32) {
                if (day <= 21) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
            } else {
                isError = true;
            }
        }else if (month==2){
            if (day > 0 && day < 29) {
                if (day <= 19) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            } else {
                isError = true;
            }
        }else if (month==3){
            if (day > 0 && day < 32) {
                if (day <= 20) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            } else {
                isError = true;
            }
        } else if (month==4) {
            if (day > 0 && day < 31) {
                if (day <= 20) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
            } else {
                isError = true;
            }
        } else if (month==5) {
            if (day > 0 && day < 32) {
                if (day <= 21) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
            } else {
                isError = true;
            }
        } else if (month==6) {
            if (day > 0 && day < 31) {
                if (day <= 22) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
            } else {
                isError = true;
            }
        } else if (month==7) {
            if (day > 0 && day < 32) {
                if (day <= 22) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
            } else {
                isError = true;
            }
        } else if (month==8) {
            if (day > 0 && day < 32) {
                if (day <= 22) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
            } else {
                isError = true;
            }
        } else if (month==9) {
            if (day > 0 && day < 32) {
                if (day <= 22) {
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
            } else {
                isError = true;
            }
        } else if (month==10) {
            if (day > 0 && day < 31) {
                if (day <= 22) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            } else {
                isError = true;
            }
        } else if (month==11) {
            if (day > 0 && day < 32) {
                if (day <= 21) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            } else {
                isError = true;
            }
        } else if (month==12){
            if (day > 0 && day < 31) {
                if (day <= 21) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
            } else {
                isError = true;
            }
        }else {
            isError=true;
        }
        if (isError){
            System.out.print("Hatalı Bir Giriş Yaptınız : ");
        }else {
            System.out.print("Burcunuz : "+burc);
        }
    }
}
