package basics;

import java.util.Scanner;

public class ArtikYil {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year;

        System.out.println("Yıl Giriniz: ");
        year = scan.nextInt();

        if(year < 0){
            System.out.println("Hatalı yıl girişi.");
        }else{
            if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
                System.out.println(year + " bir artık yıldır.");
            }else{
                System.out.println(year + " bir artık yıl değildir.");
            }
        }


    }
}
