package basics;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int sayi1,sayi2,secim = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        sayi1 = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        sayi2 = scan.nextInt();

        System.out.println("1) Toplama\n2) Çıkarma\n3) Çarpma\n4) Bölme");
        System.out.print("Seçiniz: ");
        secim = scan.nextInt();

        switch (secim){
            case 1:
                System.out.println("Sonuç: " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Sonuç: " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Sonuç: " + (sayi1 * sayi2));
                break;
                case 4:
                    if(sayi2 == 0){
                        System.out.println("Sıfıra bölünemez !");
                    }else{
                        System.out.println("Sonuç: " +(sayi1 / sayi2));
                    }
                break;
            default:
                System.out.println("Yanlış seçim. Tekrar deneyiniz.");
                break;
        }

    }
}
