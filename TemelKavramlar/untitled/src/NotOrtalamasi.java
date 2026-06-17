import java.util.Scanner;
public class NotOrtalamasi {
    static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan değerleri al.

        System.out.println("Matematik Notunuz: ");
        mat = scan.nextInt();


        System.out.println("Fizik Notunuz: ");
        fizik = scan.nextInt();

        System.out.println("Kimya Notunuz: ");
        kimya = scan.nextInt();

        System.out.println("Türkçe Notunuz: ");
        turkce = scan.nextInt();

        System.out.println("Tarih Notunuz: ");
        tarih = scan.nextInt();

        System.out.println("Muzik Notunuz: ");
        muzik = scan.nextInt();

        int topla = (mat + fizik + kimya + turkce + tarih + muzik) ;
        double ortalama = topla / 6;
        System.out.println("Tüm derslerin not ortalaması : " + ortalama);

        System.out.println(ortalama > 60 ? "Geçti" : "Kaldı");



    }

}
