package ders17_For_loop;

import java.util.Random;

public class C08_asalsayıuret {

    public static void main(String[] args) {

        // 1000 den kucuk rastgele bir asal sayı uretip yazdırmak isitiyoruz
        //bir sayı üretip asal olup olmadığını kontrol edin

        Random random=new Random();
        int sayi= random.nextInt(1000);


        for (int i = 2; i<sayi ; i++) {

            if (sayi%i==0){

                System.out.println("asal değil");
                break;
            }

            if (i==sayi-1){

                System.out.println("asaldır");
            }



        }








    }
}
