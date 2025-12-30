package TEKRAR.Konu29_ArrayListSoruCozumu;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_FibonacciSayilarınıDondur {
    public static void main(String[] args) {


// kullanıcıdan pozitif bir n tamsıyısınınalıp
// ilk n tane fibonacci sayısını bir liste olarak yazıdırn
// 0 1 1 2 3 5 8 13 21 34 45

        System.out.println(nTaneSeriOlustur(4));//[0, 1, 1, 2]
        System.out.println(nTaneSeriOlustur(10));//[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen kaçtane fibonacci sayısı istediğinizi griniz");
        int n =scanner.nextInt();

        // n<=0 hata verecek
        // n==1 listede sadece 0 olmalı
        // {0,1}
        // n>2 {0,1....}

       List<Integer> fibonacciSerisi=new ArrayList<>();

        if (n<=0){

            System.out.println("pozitif bir sayı giriniz....");

        } else if (n==1) {

            fibonacciSerisi.add(0);

        } else if (n==2) {

            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);

        }else {

            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);

            for (int i = 2; i <n ; i++) {

                fibonacciSerisi.add(fibonacciSerisi.get(i-2)+fibonacciSerisi.get(i-1));

            }

        }

        System.out.println(fibonacciSerisi);

    }

    //verilen pozitif bir n tamsayisini alarak,
    // bize ilk n tane fibonacci sayısını list olarak donduren bir metod olusturun...

    public static List<Integer>nTaneSeriOlustur(int seridekiElementSayisi){
        List<Integer> fibonacciSerisi=new ArrayList<>();
        if (seridekiElementSayisi<=0){

            System.out.println("sıfırdan kucuk sayı girilemez");

        } else if (seridekiElementSayisi==1) {

            fibonacciSerisi.add(0);

        } else if (seridekiElementSayisi==2) {

            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);

        }else {

            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);

            for (int i = 2; i <seridekiElementSayisi ; i++) {

                fibonacciSerisi.add(fibonacciSerisi.get(i-2)+fibonacciSerisi.get(i-1));

            }

        }

        return fibonacciSerisi;
    }



}
