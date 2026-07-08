package loops;

import java.util.Scanner;

public class EbobEkok {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Hangisinin küçük olduğunu bul ona göre işlem yap.

        System.out.println("n1 sayısını giriniz: ");
        int n1 = scan.nextInt();
        System.out.println("n2 sayısını giriniz: ");
        int n2 = scan.nextInt();
//        int ebob = 1;
//
//        int enkucuk = n1 <= n2 ? n1 : n2;
//
//        System.out.println("- EBOB -");
//        // EBOB
//        int i = 1;
//            while (i <= enkucuk) {
//                if (n1 % i == 0 && n2 % i == 0) {
//                    ebob = i;
//                }
//                i++;
//            }
//        System.out.println(ebob);
        System.out.println("- EKOK -");
            int k = 1;
            while (k <= n1 * n2){
                if(k % n1 == 0 && k % n2 == 0){
                    System.out.println(k);
                    break;
                }
                k++;
            }

    }
}
