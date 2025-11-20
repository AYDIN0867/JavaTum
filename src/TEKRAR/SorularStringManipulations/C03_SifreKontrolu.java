package TEKRAR.SorularStringManipulations;

import java.util.Scanner;

public class C03_SifreKontrolu {
    public static void main(String[] args) {


        //Soru 4: kullanicidan bir sifre isteyip,
        // asagidaki sartlari kontrol edin
        // ve kullanıcıya duzeltmesi gereken tum eksikleri söyleyin
        // eger tüm sartları sağlarsa, sifre basariyla kaydedildi"yazdırın
        // ilk harf kucuk harf olmalı
        // son karakter rakam olmalı
        // sifre bosluk icermemeli
        // uzunlugu en az 10 karakter olmalı


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen şifrenizi giriniz");
        String girilenSifre=scanner.nextLine();
       char ilkHarf=girilenSifre.charAt(0);
       int sonKarakter= Integer.parseInt(String.valueOf((girilenSifre.length()-1)));
       int sayac=0;
        if (!Character.isLowerCase(ilkHarf)){

            System.out.println("ilk harf buyuk olmalı");
            sayac++;
        }

        if (!(sonKarakter>0&&sonKarakter<10)){

            System.out.println("son karakter rakam olmalı");
            sayac++;
        }

        if (girilenSifre.contains(" ")){

            System.out.println("şifre boşluk içermemeli");
            sayac++;
        }

        if (girilenSifre.length()<10){

            System.out.println("karakter sayısı 10 dan az olmamalı");
            sayac++;

        }

        if (sayac==0) {

            System.out.println("girilen şifre doğru");
        }






    }
}
