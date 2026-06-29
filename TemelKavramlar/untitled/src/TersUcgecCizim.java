import java.util.Scanner;

public class TersUcgecCizim {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Basamak Sayısı: ");
        int sayi = scan.nextInt();
        for (int i = sayi; i >= 1 ; i--) {
            for (int j = 0; 2 * i - 1 > j ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
