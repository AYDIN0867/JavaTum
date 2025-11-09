package TEKRAR.NestedIfStatements;

import java.util.Scanner;

public class C06_TernaryRakamlarToplamı {

    public static void main(String[] args) {

        // kullanıcıdan 3 basamaklı bir tam sayı isteyin
        // sayi 500 veya daha büyükse rakamlar toplamını hesaplayın yazdirin
        // sayi 500 den küçükse sayinin 10 'lar basamagındaki rakamı karesini yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen 3 basamklı pozitif bir sayı giriniz");
        int girilenSayi = scanner.nextInt();
        int rakamlarToplamıi=0;
        int birlerBasamagi=0;
        int onlarBasamagi;
        int yüzlerBasamgi;

        if(girilenSayi>500){

            birlerBasamagi+=girilenSayi%10;
            girilenSayi=girilenSayi/10;
            onlarBasamagi=girilenSayi%10;
            yüzlerBasamgi=girilenSayi/10;
            rakamlarToplamıi=birlerBasamagi+onlarBasamagi+yüzlerBasamgi;


        }else {

            girilenSayi/=10;

            int onlarBasamagindakiRakam=girilenSayi%10;

            System.out.println(onlarBasamagindakiRakam*onlarBasamagindakiRakam);

        }

//böyle uzun ifli soruları ternary YAPMA KULLANMA

    }
}
