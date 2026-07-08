package loops;

import java.util.Scanner;

public class PerfectNumber {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayi = scan.nextInt();

        int i = 1;
        int toplam = 0;


        while(i < sayi){
            if(sayi % i == 0 ){
                System.out.println(i);
                toplam += i;
            }
            i++;
        }


        if(toplam == sayi){
            System.out.println(sayi + " Mükemmel sayıdır.");
        }else{
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }
    }
}
