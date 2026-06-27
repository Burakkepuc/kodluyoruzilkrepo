import java.util.Scanner;

public class ATM {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        int right = 3;
        int balance = 1500;
        int select;


        while (right > 0) {
            System.out.println("Kullanıcı adınızı giriniz: ");
            username = input.nextLine();
            System.out.println("Şifrenizi giriniz: ");
            password = input.nextLine();

            if (username.equals("patika") && password.equals("1234")) {
                System.out.println("Patika Bankasına Hoşgeldiniz");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış yap\n");
                    System.out.print("Lütfen seçim yapınız: ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Yatırılacak tutar miktarını giriniz: ");
                            int price = input.nextInt();
                            if (price <= 0){
                                System.out.println("Lütfen 0'dan büyük bir bakiye giriniz.");
                            }else{
                                balance+=price;
                            }
                            break;
                        case 2:
                            System.out.println("Çekilecek tutar miktarını giriniz: ");
                            int withdrawAmount = input.nextInt();
                            if(withdrawAmount > balance){
                                System.out.println("Bakiye yetersiz. ");
                            }else{
                                balance-=withdrawAmount;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: "+balance+" TL");
                            break;

                    }

                } while (select != 4);
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Lütfen tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan hakkınız: " + right);
                }
            }

        }

    }
}
