import java.util.Scanner;

public class HarmonicSeri {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double result = 0;

        System.out.println("Harmonik seri hesaplanacak sayıyı giriniz: ");
        double number = scan.nextDouble();


          int i = 1;
        while(i <= number){

                result = result +(1.0/i);

            // 1 + 1/2 + 1/3 + 1/4 + 1/5;
            i++;
        }
        System.out.println(result);

    }
}
// double / int = double değer çıkar.