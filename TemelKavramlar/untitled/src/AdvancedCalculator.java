import java.util.Scanner;

public class AdvancedCalculator {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }

    static int subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma: " + result);
        return result;
    }

    static int multiply(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma: " + result);
        return result;
    }

    static int division(int a, int b) {
        if (b == 0) {
            System.out.println("0'a bölünemez");
            return 0;
        };
        int result = a / b;
        System.out.println("Bölme : " + result);
        return result;
    }
    static int pow(int taban, int us) {
        int result = 1;
        for (int i = 0; i < us ; i++) {
            result = result * taban;
        }
        System.out.println("Mod alma: " + result);
        return result;
    }
    static int remainder(int a, int b) {
        int result = a % b;
        System.out.println("Mod alma: " + result);
        return result;
    }

    static int rectAreaAndPerim(int a, int b) {
        int area = a * b;
        int perimeter = 2 *(a+b);
        System.out.println("Dikdörtgenin alanı: " + area);
        System.out.println("Dikdörtgenin çevresi: " + perimeter);
        return area;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "\n1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış";

        while (true) {
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz: ");
            select = scan.nextInt();

            if (select == 0)
                break;

            System.out.print("İlk sayı: ");
            int a = scan.nextInt();
            System.out.print("İkinci sayı: ");
            int b = scan.nextInt();
            int result = 0;

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    subtraction(a, b);
                    break;
                case 3:
                    multiply(a, b);
                    break;
                case 4:
                    division(a, b);
                    break;
                case 5:
                    pow(a,b);
                    break;
                case 6:
                    remainder(a,b);
                    break;
                case 7:
                    rectAreaAndPerim(a,b);
                    break;
                default:
                    System.out.println("Yanlış seçim ! Tekrar seçiniz.");
                    break;
            }


        }
        System.out.println("Güle güle");

    }
}
