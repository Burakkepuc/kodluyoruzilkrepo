import java.util.Scanner;

public class TekSayiTopla {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k;
        int sum = 0;

        do {
            System.out.print("Sayı giriniz: ");
            k = scan.nextInt();
            if (k % 4 == 0) {
                sum += k;
            }
        } while (k % 2 == 0);
            System.out.println("Tek sayılar toplamı: " + sum);


        }
    }


