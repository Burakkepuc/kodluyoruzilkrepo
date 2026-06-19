import java.util.Scanner;
public class KullaniciGirisi {
     static void main(String[] args) {
         // Stringlerde karşılaştırma operatörü equals'dır.
        Scanner input = new Scanner(System.in);

        String kullaniciAdi = "Burak123", sifre = "1234";
        String isimAl, sifreAl, isSifreSifirla;
        int counter = 0;

        System.out.println("Kullanıcı adınızı giriniz: ");
        isimAl = input.nextLine();
        System.out.println("Şifrenizi giriniz: ");
        sifreAl = input.nextLine();

        if (kullaniciAdi.equals(isimAl) && sifre.equals (sifreAl)) {
            System.out.println("Giriş yapıldı.");
        }
        else if (kullaniciAdi.equals(isimAl) && !sifre.equals(sifreAl)) {
            System.out.println("Şifreniz yanlış.\nŞifrenizi sıfırlamak ister misiniz ? (Y,N)");
            isSifreSifirla = input.nextLine();
            if (isSifreSifirla.equals( "Y")) {
                System.out.println("Yeni şifrenizi giriniz.\nYeni şifre eski şifre ile aynı olamaz! ");
                sifreAl = input.next();
                if (sifreAl.equals(sifre)) {
                    System.out.println("Şifre oluşturulamadı. Lütfen başka şifre giriniz. ");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            }

        }
        else{
            System.out.println("Kullanıcı adı yanlış.");
        }

    }
}
