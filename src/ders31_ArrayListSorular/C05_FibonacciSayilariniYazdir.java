package ders31_ArrayListSorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_FibonacciSayilariniYazdir {

    public static void main(String[] args) {

        //kullanıcıdan bir tam sayı alıp
        // o tamsayidan kucuk Fibonacci sayilarını bir liste olarak yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen fibonacci sayılarını yazdırmak için bir üst sayi sinirini girin...");
        int maxSayi=scanner.nextInt();
        List<Integer> fibonacciSerisi=new ArrayList<>();

        if (maxSayi<0){

            System.out.println("üst sınır sıfırdan küçük olamaz");
        } else if (maxSayi==0) {

            fibonacciSerisi.add(0);

        } else if (maxSayi==1) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            fibonacciSerisi.add(1);


        } else {


            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            fibonacciSerisi.add(1);

            int i=3;
            int birOncekiEleman=fibonacciSerisi.get(i-1);
            int ikiOncekiEleman=fibonacciSerisi.get(i-2);

            while (birOncekiEleman+ikiOncekiEleman<=maxSayi){

                fibonacciSerisi.add(birOncekiEleman+ikiOncekiEleman);
                i++;
                birOncekiEleman=fibonacciSerisi.get(i-1);
                ikiOncekiEleman=fibonacciSerisi.get(i-2);


            }

        }
        System.out.println(fibonacciSerisi);

    }
}
