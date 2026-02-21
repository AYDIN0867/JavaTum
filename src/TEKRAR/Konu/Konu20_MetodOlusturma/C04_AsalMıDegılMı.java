package TEKRAR.Konu.Konu20_MetodOlusturma;

import java.util.Scanner;

public class C04_AsalMıDegılMı {
    public static void main(String[] args) {

         //verilen bir tamsayının...
        // asal sayı olup olmadıgını kontrol edip,sonucu YAZDIRAN bir method oluşturun...

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz...");
        int girilenSayi= scanner.nextInt();
        int sayac=0;


        for (int i = 1; i <=girilenSayi ; i++) {

            if (girilenSayi/i==0){

            sayac++;

            }

        }

        if (sayac==2){

            System.out.println("bu sayı asaldır");

        }else System.out.println("değildir");

        asalMıYazdir(30);

    }

public static void asalMıYazdir(int girilenSayi){

    int sayac=0;


    for (int i = 1; i <=girilenSayi ; i++) {

        if (girilenSayi/i==0){

            sayac++;

        }

    }

    if (sayac==2){

        System.out.println("bu sayı asaldır");

    }else System.out.println("verien" +girilenSayi+"sayisi  asal değildir");







}





}
