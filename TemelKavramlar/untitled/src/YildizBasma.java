import java.util.Scanner;

public class YildizBasma {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ödev.
        System.out.println("Sayı giriniz: ");
        int n = input.nextInt();

       for (int i = 1; i <= n ; i++) {  // 1
            for (int j = n; j > i ; j--) { // bir sayı girince n - i olarak da yaparız.
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = n - 1 ;i > 0; i--){ // i = 1
            for (int j = 1; j <= n - i; j++) { //
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pratik
//        System.out.println("Sayı giriniz: ");
//        int n = input.nextInt();
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <= n-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= 2 * i - 1 ; k++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
    }
}

//   *      1   3           1
//  ***     2   2           3
// *****    3   1           5
//*******   4   0
//          i  4(n) - i
//        n = 4