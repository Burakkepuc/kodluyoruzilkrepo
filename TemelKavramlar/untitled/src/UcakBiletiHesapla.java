import java.util.Scanner;

public class UcakBiletiHesapla {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Mesafe başına ücret 0.10 TL/KM
        // Önce uçuşun toplam fiyatını hesapla,sonra koşula göre indirim uygula.

        int distance,age,flightType;
        double totalPrice;

        System.out.print("Mesafeyi giriniz: ");
        distance = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek yön, 2 => Gidiş Dönüş): ");
        flightType = input.nextInt();

        if((distance <= 0) || (age < 0) || flightType != 1 && flightType != 2){
            System.out.println("Hatalı veri girdiniz!");
        }else{
        totalPrice = distance * 0.10;

        if(age < 12){
           totalPrice = totalPrice - ( totalPrice * 0.50);
        } else if (age <= 24) {
            totalPrice = totalPrice - ( totalPrice * 0.10);
        }else if(age > 65){
            totalPrice = totalPrice - ( totalPrice * 0.30);
        }

        if(flightType == 2){
            totalPrice = (totalPrice - (totalPrice * 0.20)) * 2;

        }

            System.out.println("Toplam tutar: " + totalPrice);

        }



    }
}
