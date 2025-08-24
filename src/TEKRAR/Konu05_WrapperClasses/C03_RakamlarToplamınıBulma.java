package TEKRAR.Konu05_WrapperClasses;

import java.util.Scanner;

public class C03_RakamlarToplamınıBulma {
    public static void main(String[] args) {

        //kullanıcıdan 3 basamaklı pozitif bir tamsayı isteyin
        //sayinin rakamlar toplamını bulun
        //ornek ınput=245 ise output=11

        System.out.println(155/100);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir sayı giriniz...");
        int sayi=scanner.nextInt();

        int birlerbasamagı=sayi%10;
        sayi=sayi/10;
        int onlarBasamagi=sayi%10;
        sayi=sayi/10;


        System.out.println("girilen sayinin rakamlari toplami : "+(birlerbasamagı+onlarBasamagi+sayi));







    }
}
