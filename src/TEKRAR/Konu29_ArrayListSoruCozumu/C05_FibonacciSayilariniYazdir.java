package TEKRAR.Konu29_ArrayListSoruCozumu;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_FibonacciSayilariniYazdir {

    public static void main(String[] args) {

// kullanıcıdan pozitif  tamsıyısı alıp
//o tamsayıdan kucuk Fibonacci sayılarını bir liste olarak yazıdırın
// 0 1 1 2 3 5 8 13 21 34 45


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen kaçtane fibonacci sayılarını yazdırmak icin bir sayı sınırını girin....");
        int maxSayi = scanner.nextInt();


        List<Integer> fibohaciSerisi=new ArrayList<>();

        if (maxSayi<0){

            System.out.println("negatif olamazsın...");
        }

        else if  (maxSayi == 0) {

            fibohaciSerisi.add(0);

        } else if (maxSayi == 1) {

            fibohaciSerisi.add(0);
            fibohaciSerisi.add(1);
            fibohaciSerisi.add(1);


        } else {
            fibohaciSerisi.add(0);
            fibohaciSerisi.add(1);
            fibohaciSerisi.add(1);

            int i = 3;
            int birOncekiEleman = fibohaciSerisi.get(i-1);
            int ikiOncekiEleman = fibohaciSerisi.get(i-2);


            while (birOncekiEleman + ikiOncekiEleman <= maxSayi) {

                fibohaciSerisi.add(birOncekiEleman + ikiOncekiEleman);
                i++;
                birOncekiEleman = fibohaciSerisi.get(i-1);
                ikiOncekiEleman = fibohaciSerisi.get(i-2);

            }


        }



    }
}
