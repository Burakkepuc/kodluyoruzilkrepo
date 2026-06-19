
import java.util.Scanner;

public class SinifGecme {
    static void main(String[] args) {
        int GECME_NOTU = 55;
        int matematik,fizik,turkce,kimya,muzik,ort=0;
        int counter = 0;
        double notOrt;

        Scanner scan = new Scanner(System.in);

        System.out.println("Matematik notunu giriniz: ");
        matematik = scan.nextInt();
        System.out.println("Fizik notunu giriniz: ");
        fizik = scan.nextInt();
        System.out.println("Türkçe notunu giriniz: ");
        turkce = scan.nextInt();
        System.out.println("Kimya notunu giriniz: ");
        kimya = scan.nextInt();
        System.out.println("Müzik notunu giriniz: ");
        muzik = scan.nextInt();

        if((matematik >= 0 && matematik <= 100)  ){
            ort += matematik;
            counter++;
        }  if(fizik >=0 && fizik <= 100){
            ort += fizik;
            counter++;
        } if(turkce >=0 && turkce <= 100){
            ort += turkce;
            counter++;
        } if(kimya >=0 && kimya <= 100){
            ort += kimya;
            counter++;
        } if(muzik >=0 && muzik <= 100){
            ort += muzik;
            counter++;
        }
        System.out.println(ort);

        if(counter > 0) {
             notOrt = (ort / counter);
            if (notOrt >= GECME_NOTU) {
                System.out.println("Not ortalaması: " + notOrt);
                System.out.println("Geçti");
            } else {
                System.out.println("Kaldı.");
            }
        }
        else {
            System.out.println("Hata: Hiçbir dersin notu geçerli aralıkta (0-100) girilmedi!");
        }
    }


}
