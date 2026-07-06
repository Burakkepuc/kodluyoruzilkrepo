import java.util.Scanner;

public class RecursivePow {

    static int pow(int taban, int us) {

        if (us == 0) return 1;

        return pow(taban, --us) * taban;
    }

    static void main(String[] args) {


        Scanner scan = new Scanner(System.in);



        while (true) {
            System.out.println("1- Uslu sayı girme programı için\n" +
                    "2- Cıkıs\n"
            );
            int secım = scan.nextInt();

            switch (secım) {
                case 1:
                    System.out.print("Taban Değerini Giriniz: ");
                    int taban = scan.nextInt();
                    System.out.print("Us Değerini Giriniz: ");
                    int us = scan.nextInt();
                    System.out.println(pow(taban,us));
                    System.out.println("-----------------------------");
                    break;
                case 2:
                    System.out.println("Program sonlandırıldı.");
                    return;
                default:
                    System.out.println("Yanlış seçim yapıldı.");

            }
        }


    }
}
