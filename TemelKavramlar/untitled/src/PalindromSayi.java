import java.util.Scanner;

public class PalindromSayi {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        int sayi = input.nextInt();

        System.out.println(isPalindrom(sayi));
    }


    static boolean isPalindrom(int sayi) {
        int temp = sayi, tersSayi = 0; // ters: 1,15,

        while (temp != 0) {
            int sonBasamak = temp % 10;
            tersSayi = (tersSayi * 10) + sonBasamak; // 1, 15, 157
            temp /= 10;
        }

        return sayi == tersSayi ? true : false;

    }
}
// Bir döngüye sok, döngü bitene kadar bir sağdan bir soldan kontrol et.
