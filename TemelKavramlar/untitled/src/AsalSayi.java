import java.util.Scanner;

public class AsalSayi {
    static void main(String[] args) {

        // 100'e kadar saydır.
        for (int i = 2; i <= 100 ; i++) {
            // Flag oluştur. Eğer bir ve kendisi hariç sayıya tam bölünüyorsa asal değil.
            boolean asalMi = true;
            // i'ye kadar kontrol et iç döngüyü
            for (int j = 2; j < i ; j++) {
                // Eğer Dış döngü içe tam bölünüyorsa asal değil.
                if(i % j == 0){
                    asalMi = false;
                    break;
                }
            }
            if (asalMi){
                System.out.println(i);
            }
        }

    }
}

