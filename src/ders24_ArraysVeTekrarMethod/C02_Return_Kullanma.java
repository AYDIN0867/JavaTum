package ders24_ArraysVeTekrarMethod;

import java.util.Scanner;

public class C02_Return_Kullanma {

    public static void main(String[] args) {


        // verilen ismi soyismi alıp
        // Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak şekilde duzenleyip
        // isim bosluk soyisim seklinde bize DONDUREN bir method olusturun
        // input:Ali soyIsim=YILMAZ. method return:Ali Yilmaz

        /* bize bir sonuç döndüren methodlar kullanılırken döndüreln  sonucu 2 şekilde kullanmayı tercih ederiz
       1- eğer hemen konsolde görmek istiyorsak method call o souut içinde yapabiliriz
        bu tercih yapıldığında kodun ilerleyen kısmında döndürülen bilgi kullanılşamaz

        2- döndürülen bilgi kodun ilerleyen kısmınd görmek istersek döndürülen bilgiyi bir variableye kaydederiz

                 */

        //System.out.println(ismiDuzenleDondur());// sadece yazdırı

      String DöndurenIsim=  ismiDuzenleDondur();
        System.out.println(DöndurenIsim);

// girirlen isim ve soy ismin uzunnluğunu kpntroledip 10 harften az ise gecersiz giriş
//10 harften naz değilse "giris basarili" yazdırın

        if (DöndurenIsim.length()<10){

            System.out.println("gecersiz giriş");
        }else {

            System.out.println("giriş başarılı");
        }



    }

    public static String ismiDuzenleDondur(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String girilenIsim=scanner.nextLine();
        System.out.println("lütfen soyisminizi giriniz");
        String soyIsim=scanner.nextLine();


        String duzenlenmisIsim=girilenIsim.substring(0,1).toUpperCase()+
                girilenIsim.substring(1).toLowerCase()+
                " "+
                soyIsim.substring(0,1).toUpperCase()+
                soyIsim.substring(1).toLowerCase();

        return duzenlenmisIsim;


    }



}
