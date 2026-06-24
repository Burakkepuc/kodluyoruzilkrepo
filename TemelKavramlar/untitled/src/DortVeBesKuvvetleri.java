import java.util.Scanner;

public class DortVeBesKuvvetleri {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sinir;
        //3
//        i = i * 2
//        0 = 0 * 2
//        2 = 1 * 2
//        4 = 2 * 2
//        8  = 4 * 2
//        16 = 8 * 2

     /*   System.out.println("Sınır değerini giriniz: ");
       sinir = scan.nextInt();
        for (int i = 1;i<sinir;i = i * 2){
            System.out.println(i);
        }*/

        System.out.println("Sınır değerini giriniz: ");
        sinir = scan.nextInt(); // 125

        int j = 1;
        while(j < sinir){
            j = j * 5;
            System.out.println(j);
        }

        for (int i = 1;i<sinir;i = i * 4){
            System.out.println(i);
        }






    }
}
