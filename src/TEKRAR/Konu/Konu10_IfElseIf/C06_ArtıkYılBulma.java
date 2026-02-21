package TEKRAR.Konu.Konu10_IfElseIf;

import java.util.Scanner;

public class C06_ArtıkYılBulma {

    public static void main(String[] args) {

//Kullanicidan artik yil olup olmadigini kontrol
//etmek icin yil girmesini isteyin
//Kural 1: 4 ile bolunemeyen yillar artik yil
//degildir
//Kural 2: 4 ile bolunup 100 ile bolunemeyen
//yillar artik yildir
//Kural 3: 4’un kati olmasina ragmen 100 ile
//bolunebilen yillardan sadece
//400’un kati olan yillar artik yildir


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen yıl giriniz");
        int girilenYıl= scanner.nextInt();


        if (girilenYıl%4==0 && !(girilenYıl%100==0)){

            System.out.println("artık yıldır");

        } else if (girilenYıl%400==0) {

            System.out.println(girilenYıl + "artık yıldır");

        }else System.out.println(girilenYıl + "artık yıl değildir");

        int girilenYil1= scanner.nextInt();

        if (girilenYil1 % 400 == 0) {
            System.out.println(girilenYil1 + " artık yıldır.");
        } else if (girilenYil1 % 100 == 0) {
            System.out.println(girilenYil1 + " artık yıl değildir.");
        } else if (girilenYil1 % 4 == 0) {
            System.out.println(girilenYil1 + " artık yıldır.");
        } else {
            System.out.println(girilenYil1 + " artık yıl değildir.");
        }


    }
}
