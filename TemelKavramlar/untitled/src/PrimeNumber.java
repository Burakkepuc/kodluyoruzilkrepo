public class PrimeNumber {

    static boolean asalMi(int num, int bolen) {

        if (num == bolen) // Eğer sayı bolen'e eşitse hiç böleni olmamıştır. Sayı Asal.
            return true;

        if (num % bolen == 0) // Bir kere bile tam bölünürse, asal değil. Örn 5%2 == 1 -> 0 a bölünmedi , 9%3 ==0 -> asal değil  bölündüş.
            return false; // Mesela 12 % 2 = 0 // Asal değil , false dön.

        return asalMi(num, ++bolen);
    }

    static void main(String[] args) {

        System.out.println(
                asalMi(5, 2)
        );

    }

}
//
//        boolean asalMi = true;
//        for (int i = 2; i <=100 ; i++) {
//            for (int j = 2; j <i ; j++) {
//                if(i % j == 0){
//                    asalMi = false;
//                      break;
//                }
//            }
//            if(asalMi)
//                System.out.println(i);
//           asalMi = true;