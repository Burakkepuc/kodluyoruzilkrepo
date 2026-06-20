import java.util.Scanner;

public class maxToMinOrder {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz");
        int sayi1 = input.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        System.out.println("Üçüncü sayıyı giriniz:");
        int sayi3 = input.nextInt();

        int min=0,mid=0,max = 0;

        // Sayi 1 sayı 2 ve sayı 3'den büyük ise
        if(sayi1 >= sayi2 && sayi1 >= sayi3){
            // Sayı 1'i yaz.
           max = sayi1;
            if(sayi2 > sayi3){
                // Sayı 2 sayı 3 den büyük ise önce sayı 2'yi sonra sayı 3'ü yaz.
                mid = sayi2;
                min = sayi3;
            }else{
                // Eğer sayı 3 büyük ise önce sayı 3 sonra sayı 2'yi yaz.
                mid = sayi3;
                min = sayi2;
            }
        }

        // Sayı 2 sayı 1'den büyük ise ve sayi 2 sayı 3 'den büyük ise
        else if(sayi2 > sayi1 && sayi2 > sayi3){
            // Önce sayı 2'yi yaz.
            max = sayi2;
            if(sayi1 > sayi3){
                // Sayı 1 sayı 3'den büyük ise önce sayı 1 sonra sayı 3'ü yaz.
                mid = sayi1;
                min = sayi3;
            }else{
                // Sayı 3 büyük ise, önce sayı 3 sonra sayı 2yi yaz.
                mid = sayi3;
                min = sayi1;
            }
        }else{
            max=sayi3;
            if(sayi1 > sayi2){
                mid=sayi1;
                min=sayi2;
            }else{
                mid=sayi2;
                min=sayi1;
            }
        }



        System.out.println(max + " > " + mid +" > " + min);

    }
}






