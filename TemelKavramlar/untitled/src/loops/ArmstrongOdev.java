package loops;

import java.util.Scanner;

public class ArmstrongOdev {
    static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        System.out.print("Basamakları toplanacak sayı giriniz: ");
        int sayi = scan.nextInt();
        int tempSayi = sayi;
        int basRakam ;
        int rakamToplam =0;


        while(tempSayi != 0){

            basRakam = tempSayi % 10;
            rakamToplam+=basRakam;
            System.out.println(tempSayi);

            tempSayi /= 10;
        }

        System.out.println(rakamToplam);




    }
}
