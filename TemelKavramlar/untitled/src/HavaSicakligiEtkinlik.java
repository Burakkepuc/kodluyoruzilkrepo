import java.util.Scanner;

public class HavaSicakligiEtkinlik {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Sıcaklığı giriniz: ");
        int sicaklik = scan.nextInt();

        if(sicaklik < 5){
            System.out.println("Kayak yapmaya gidebilirsin.");
        }
        if(sicaklik >= 5 && sicaklik <= 15){
            System.out.println("Sinemaya gidebilirsin.");
        }
        if(sicaklik >=10  && sicaklik <= 25){
            System.out.println("Pikniğe gidebilirsin");
        }
        if(sicaklik > 25){
            System.out.println("Yüzmeye gidebilirsin");
        }


    }
}

// sıcaklık < 5 Kayak
// sıcaklık sıcaklık >=5 && <= 15 sinema
// sıcaklık >= 10 && <= 25 piknik
// sıcaklık > 25 Yüzme
// Sıcaklık 5 ve 25 arasında değil.

