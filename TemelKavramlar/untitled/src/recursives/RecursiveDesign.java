package recursives;

public class RecursiveDesign {

    static int f(int num){
        System.out.println(num);

        if(num < 0)
            return num;
         f(num - 5);

//Java'da bir metot çağrısı bitmeden altındaki satıra asla geçilmez

        System.out.println(num);

         return num;
    }


    static void main(String[] args) {
        f(16);
    }
}
