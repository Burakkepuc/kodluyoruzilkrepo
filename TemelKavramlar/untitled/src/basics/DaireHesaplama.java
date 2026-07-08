package basics;

import java.util.Scanner;

public class DaireHesaplama {
    public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pi = 3.14;
        int r;
        System.out.println("Dairenin yarı çapını giriniz: ");
        r = scan.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        System.out.println("Dairenin Alanı: " + alan);
        System.out.print("Dairenin Çevresi: " + cevre);

    }
}
