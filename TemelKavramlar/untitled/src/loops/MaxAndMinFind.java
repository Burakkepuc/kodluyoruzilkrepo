package loops;

import java.util.Scanner;

public class MaxAndMinFind {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int adet;
        int sayi,minsayi=Integer.MAX_VALUE,maxsayi=Integer.MIN_VALUE;


        System.out.println("Kaç tane sayı gireceksiniz ?");
        adet = scan.nextInt();

        if(adet <= 0){
            System.out.println("Geçerli bir sayı giriniz.");
            return;
        }

        int i = 0;
        while(adet != i){
            System.out.print(i+1 +". Sayıyı giriniz: ");
            sayi = scan.nextInt();

            if(sayi<minsayi){
                 minsayi = sayi;
            }
            if(sayi>maxsayi){
                maxsayi = sayi;
            }

            i++;

        }

        System.out.println("Minimum: " + minsayi);
        System.out.println("Maximum: " + maxsayi);


    }
}
