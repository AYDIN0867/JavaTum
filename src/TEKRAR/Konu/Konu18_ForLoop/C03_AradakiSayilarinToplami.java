package TEKRAR.Konu.Konu18_ForLoop;

import java.util.Scanner;

public class C03_AradakiSayilarinToplami {
    public static void main(String[] args) {

        /*
        Soru:3 - Kullanıcıdan baslangic ve bitis degeeri olarak pozitif sayilar alin
        sinirler dahil olarak aralarındaki tum sayıların toplamını yazdırın...
        Bitis degeri baslangic degerinden kucukse, uyarı yazdirip islemi sonlandırın.

         */


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen balangic degeri olarak pozitif bir sayı giriniz....");
        int baslangıc=scanner.nextInt();
        System.out.println("şimdi de bitis degeri olarak pozitif bir sayı giriniz.... ");
        int bitis=scanner.nextInt();
        int toplam=0;
        if (bitis<baslangıc){

            System.out.println("bitis degeri baslangıc degerinden kucuk olmamalı....");
        }else {

            for (int i = baslangıc; i <=bitis ; i++) {

                toplam+=i;

            }

            System.out.println(toplam);

        }






    }
}
