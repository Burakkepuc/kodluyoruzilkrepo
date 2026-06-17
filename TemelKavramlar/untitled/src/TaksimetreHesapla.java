import java.util.Scanner;

public class TaksimetreHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double kmBasina = 2.20,ucret = 0,minUcret = 20;
        int acilisUcreti = 10,km = 0;


        System.out.print("Gidilecek KM'yi giriniz: ");
        km = input.nextInt();

        ucret = acilisUcreti + (km * kmBasina);
        System.out.println(km +" KM için tutar: " + (ucret < minUcret ? minUcret : ucret) );

    }
}
