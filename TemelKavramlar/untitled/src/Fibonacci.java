import java.util.Scanner;

public class Fibonacci {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        int sayi = scan.nextInt();

        int ilkSayi = 0;
        int ikinciSayi = 1;
        int sonuc =0;
        System.out.print(sayi+" Elemanlı Fibonacci serisi: ");
        for (int i = 0; i <= sayi ; i++) {
            System.out.print(" " + ilkSayi);
            sonuc = ilkSayi + ikinciSayi;
            ilkSayi = ikinciSayi;
            ikinciSayi = sonuc;




        }
    }
}
