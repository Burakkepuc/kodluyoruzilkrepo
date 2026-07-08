package basics;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armutKgFiyat = 2.14,elmaKgFiyat = 3.67,domatesKgFiyat=1.11,muzKgFiyat = 0.95,patlicanKgFiyat = 5.00;
        double armutKg,elmaKg,domatesKg,muzKg,patlicanKg;

        System.out.print("Armut Kaç Kilo: ");
        armutKg = input.nextDouble();
        System.out.print("Elma Kaç Kilo: ");
        elmaKg = input.nextDouble();
        System.out.print("Domates Kaç Kilo: ");
        domatesKg = input.nextDouble();
        System.out.print("Muz Kaç Kilo: ");
        muzKg = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo: ");
        patlicanKg = input.nextDouble();

        double total = ((armutKgFiyat*armutKg)+(elmaKgFiyat*elmaKg)+(domatesKgFiyat*domatesKg)+(muzKgFiyat*muzKg)+(patlicanKgFiyat*patlicanKg));

        System.out.println("Toplam tutar: " + total );

    }
}
