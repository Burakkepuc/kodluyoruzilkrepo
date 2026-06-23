import java.util.Scanner;

public class CiftSayiBul {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k;

        System.out.print("Sayı giriniz: ");
        k = scan.nextInt();

       int i = 0;
       while(i < k){
            if(i % 2 == 0){
                System.out.println(i +" " + "Sayısı çift sayıdır");
            }
            i++;
        }
    }
}
