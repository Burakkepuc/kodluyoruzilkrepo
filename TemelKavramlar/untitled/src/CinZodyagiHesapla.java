import java.util.Scanner;

public class CinZodyagiHesapla {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Doğum tarihini giriniz: ");
        int dateOfBirth = scan.nextInt();



    if(dateOfBirth < 0){
        System.out.println("Hatalı giriş.");
    }else {
        int calculateZodiac = dateOfBirth % 12;

        if (calculateZodiac == 0) {
            System.out.println("Maymun");
        } else if (calculateZodiac == 1) {
            System.out.println("Horoz");

        } else if (calculateZodiac == 2) {
            System.out.println("Köpek");

        } else if (calculateZodiac == 3) {
            System.out.println("Domuz");

        } else if (calculateZodiac == 4) {
            System.out.println("Fare");

        } else if (calculateZodiac == 5) {
            System.out.println("Öküz");

        } else if (calculateZodiac == 6) {
            System.out.println("Kaplan");

        } else if (calculateZodiac == 7) {
            System.out.println("Tavşan");

        } else if (calculateZodiac == 8) {
            System.out.println("Ejderha");

        } else if (calculateZodiac == 9) {
            System.out.println("Yılan");

        } else if (calculateZodiac == 10) {
            System.out.println("At");

        } else if (calculateZodiac == 11) {
            System.out.println("Koyun");

        }

    }
    }
}
