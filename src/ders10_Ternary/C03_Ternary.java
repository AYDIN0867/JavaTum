package ders10_Ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        // kullanıcıdan 3 basamaklı bir tamsayı isteyin
        // sayi 500 veya daha büyükse rakamlar toplamını hesaplayın yazdırın
        // sayı 500 den küçükse sayının 10 lar basamağındaki sayının karesini yazdırın



        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen  3 basamaklı bir tamsayi giriniz");
        int sayi=scanner.nextInt();
        int rakamlarToplamı=0;
        int onlarBasamagikaresi=0;
        if (sayi>=500){

          int birlerBasamagi=sayi%10;
          sayi/=10;
          int onlarBasamagi=sayi%10;
          int yüzlerbasamagi=sayi/10;

            rakamlarToplamı=birlerBasamagi+onlarBasamagi+yüzlerbasamagi;

            System.out.println(rakamlarToplamı);

        }else {

            sayi/=10;
            int onlarBasamagi=sayi%10;
             onlarBasamagikaresi=onlarBasamagi*onlarBasamagi;

            System.out.println(onlarBasamagikaresi);
        }


//BU ÖRNEĞİ TERNARY BU GİBİ SORULARDA YETERSİZ KALACAĞINI GÖRMEK İÇİN YAPTIK


    }
}
