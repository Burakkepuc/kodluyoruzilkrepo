import java.util.Scanner;

public class KDVHesapla {
    static void main(String[] args) {
        
        // Tutarı almak için bir değişken tanımı yap. Küsüratlı alacağız.
        Scanner scan = new Scanner(System.in);


        double kdv = 18;
        double tutar = 0;

        System.out.println("Tutar giriniz: ");
        tutar = scan.nextDouble();

        double kdvFiyat = tutar + (tutar * kdv) / 100;

        System.out.println("KDV\'siz fiyat: " + tutar);
        System.out.println("KDV\'li fiyat: " + kdvFiyat);
        System.out.println("KDV Tutarı: "+ (kdv / 10));

        
    }
}
