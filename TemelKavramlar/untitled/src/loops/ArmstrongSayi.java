package loops;

import java.util.Scanner;

public class ArmstrongSayi {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int a = 2451, basamakSayisi = 0, numberCounter = 0;

        // Basamak Sayısı Bulma İşlemi
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0

        // Bir sayının son basamağını bulma
        // 2451 % 10 = 1
        // 245 = 10 = 5

        // Basamak sayısı
//        while(a != 0){
//            a = a / 10;
//            numberCounter++;
//        }
//
//        System.out.println("Basamak sayısı: " +numberCounter);

        ///////////////////////////////////// UYGULAMA //////////////////////////////////

        Scanner scan = new Scanner(System.in);

        // N haneli bir sayının basamaklarının n'inci üstlerinin toplamı kendine eşitse, Armstrong sayıdır.
        // Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407

        //En başta kullanıcıdan bir sayı al.
        int number = scan.nextInt();
        int basNum = 0;
        int tempNumber = number;
        int basResult = 0;
        int basamakDeger;
        int result = 0;

        // Daha sonra bu sayının kaç basamaklı olduğunu bul.
        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            basNum++;
        }
        tempNumber = number;
        //Sayının n basamaklı olduğunu buldum.

        // Şimdi sayıları tek tek al
        while (tempNumber != 0) {
            basamakDeger = tempNumber % 10;
            // UsalmaAlgoritmasi
            basResult = 1;
            for (int i = 1; i <= basNum; i++) {
                basResult = basamakDeger * basResult;
            }
            result += basResult;
            // 1245 - 1234 - 123 - 12 - 1
            tempNumber = tempNumber / 10;
        }

        if(result == number){
            System.out.println(number + " Armstrong sayıdır.");
        }else{
            System.out.println("Armstrong sayı değildir.");
        }

        //2^3
//        int res = 1;
//        for (int i = 1; i <= 3 ; i++) { -> 3 us
//            res = res * 2; // taban
//        }
//        System.out.println(res);


    }
}
