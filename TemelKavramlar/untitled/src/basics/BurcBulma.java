package basics;

import java.util.Scanner;

public class BurcBulma {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month,day;
        String str = "";
        boolean isError = false;

        System.out.println("Doğduğunuz ay");
        month = scan.nextInt();

        System.out.println("Doğduğunuz gün");
        day = scan.nextInt();

        // Ay 28-29-30 mu çekiyor kontrol et.
        // Aralıkda mı onu kontrol et.

        if(month == 1 ){
            if((day >= 1 && day <=31)) {
                if (day <= 21) {
                    str = "Oğlak";
                } else {
                    str = "Kova";
                }
            }else{
                isError = true;
            }
        }else if(month == 2) {
            if ((day >= 1 && day <= 28)) {
                if (day <= 19) {
                    str = "Kova";
                } else {
                    str = "Balık";
                }
            }else {
                isError = true;
            }
        }
        else if(month == 3) {
            if ((day >= 1 && day <= 31)) {
                if (day <= 20) {
                    str = "Balık";
                } else {
                    str = "Koç";
                }
            }else {
                isError = true;
            }
        }
        else if(month == 4) {
            if ((day >= 1 && day <= 30)) {
                if (day <= 20) {
                    str = "Koç";
                } else {
                    str = "Boğa";
                }
            }else {
                isError = true;
            }
        }
        else if(month == 5) {
            if ((day >= 1 && day <= 31)) {
                if (day <= 21) {
                    str = "Boğa";
                } else {
                    str = "İkizler";
                }
            }else {
                isError = true;
            }
        }
        else if(month == 6) {
            if ((day >= 1 && day <= 30)) {
                if (day <= 22) {
                    str = "İkizler";
                } else {
                    str = "Yengeç";
                }
            }else {
                isError = true;
            }
        }
        else if(month == 7) {
            if ((day >= 1 && day <= 31)) {
                if (day <= 22) {
                    str = "Yengeç";
                } else {
                    str = "Aslan";
                }
            }else {
                isError = true;
            }
        }
        else if(month == 8) {
            if ((day >= 1 && day <= 31)) {
                if (day <= 22) {
                    str = "Aslan";
                } else {
                    str = "Başak";
                }
            }else {
                isError = true;
            }
        }
        else if(month == 9) {
            if ((day >= 1 && day <= 30)) {
                if (day <= 22) {
                    str = "Başak";
                } else {
                    str = "Terazi";
                }
            }else {
                isError = true;
            }
        }else if(month == 10) {
            if ((day >= 1 && day <= 31)) {
                if (day <= 22) {
                    str = "Terazi";
                } else {
                    str = "Akrep";
                }
            }else {
                isError = true;
            }
        }else if(month == 11) {
            if ((day >= 1 && day <= 30)) {
                if (day <= 21) {
                    str = "Akrep";
                } else {
                    str = "Yay";
                }
            }else {
                isError = true;
            }
        }else if(month == 12) {
            if ((day >= 1 && day <= 31)) {
                if (day <= 21) {
                    str = "Yay";
                } else {
                    str = "Oğlak";
                }
            }else {
                isError = true;
            }
        }
        else{
            System.out.println("Yanlış ay seçimi. 1 - 12 arasında bir seçim yapınız.");
        }

        if(isError){
            System.out.println("Hatalı bir aralık girdiniz. Bu ayda bu aralık yok.");
        }else{
            isError= true;
            System.out.println(str);
        }
    }
}

