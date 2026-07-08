package recursives;

public class RecursiveFibonacci {
    static void main(String[] args) {

        System.out.println(fibonacci(6));
    }

    static int fibonacci(int number){
        if(number == 1 || number == 2)
            return 1;


        return fibonacci(number - 2 ) + fibonacci(number - 1);
    }
}
//
//Time Complexity: O(2ⁿ)
//Her çağrı yaklaşık 2 yeni çağrı üretir.
//Aynı alt problemler tekrar tekrar hesaplanır.

//Space Complexity: O(n)
//Call stack'in maksimum derinliği n'dir.