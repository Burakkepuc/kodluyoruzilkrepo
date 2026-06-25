import java.util.Scanner;

public class UsHesapla {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Üssü alınacak sayı");
        int n = scan.nextInt();
        System.out.println("Üs olacak sayı"); // 4^3 = 4 * 4 * 4
        int r = scan.nextInt();

        int sonuc = 1;
        if (r >= 0) {
            for (int i = 1; i <= r; i++) {
                sonuc = n * sonuc;
//            4     = 4 * 1
//            16      = 4 * 4
//            64       = 4 * 16

            }
            System.out.print("Sonuç: " + sonuc);
        }
        else{
            System.out.println("Negatif üs girdiniz. ");
        }

    }
}
