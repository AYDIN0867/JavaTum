package ders31_ArrayListSorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_FibonacciSayilarınıYazdirma {
    public static void main(String[] args) {

        //kullanıcıdan pozitif bir n tamsayısını alıp,
        //ilk n tane Fibonacci sayisini bir liste olarak yazdirin
        //0 1 1 2 3 5 8 13 21 34 55

        System.out.println(fibonacciSayisiOlustur(7));
        System.out.println(fibonacciSayisiOlustur(10));

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen kaç adet fibonacci sayisi istediğinizi giriniz : ");
        int n =scanner.nextInt();
        //n <=0 hata versin
        //n==1 ise {0}
        //n==2 ise {0,1}
        //n>2 {0,1....}


       // System.out.println(fibonacciSayisi);
    }


    //Verilen pozitif bir n tamsayısını alarak,
    // bize ilk n tane Fibonacci sayisini bir list olarak döndüren method oluşturun


    public static List<Integer> fibonacciSayisiOlustur(int seridekiElementSayisi){

        List<Integer> fibonacciSayisi=new ArrayList<>();

        if (seridekiElementSayisi<=0){

            System.out.println("pozitif bir değer girmelisiniz");
        } else if (seridekiElementSayisi==1) {

            fibonacciSayisi.add(0);

        } else if (seridekiElementSayisi==2) {

            fibonacciSayisi.add(0);
            fibonacciSayisi.add(1);

        } else{
            fibonacciSayisi.add(0);
            fibonacciSayisi.add(1);

            for (int i = 2; i <seridekiElementSayisi ; i++) {

                fibonacciSayisi.add(fibonacciSayisi.get(i-2)+fibonacciSayisi.get(i-1));

            }

        }
       return fibonacciSayisi;
    }
}
