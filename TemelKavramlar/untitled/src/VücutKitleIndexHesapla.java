import java.util.Scanner;

public class VücutKitleIndexHesapla {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy,kilo,vki;

        System.out.println("Lütfen Boyunuzu giriniz(metre cinsinden) : ");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz");
        kilo = input.nextDouble();
        vki = kilo / (boy * boy);
        System.out.println("Vücut kitle indexiniz: " + vki);

    }
}
