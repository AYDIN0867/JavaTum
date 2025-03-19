package ders24_ArraysVeTekrarMethod;

import java.util.Scanner;

public class C03_Scope_Kullanma {

   static String duzenlenmisIsim="";

    public static void main(String[] args) {


        // verilen ismi soyismi alıp
        // Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak şekilde duzenleyip
        // isim bosluk soyisim seklinde bize YAZDIRAN bir method olusturun
        // input:Ali soyIsim=YILMAZ. method return:Ali Yilmaz

// girirlen isim ve soy ismin uzunnluğunu kpntroledip 10 harften az ise gecersiz giriş
//10 harften naz değilse "giris basarili" yazdırın

if (duzenlenmisIsim.length()<10){
    System.out.println("gecersiz işlem");
}else System.out.println("giriş başarılı");




    }

    public static void IsmiDuzenleyazdir(){


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String girilenIsim=scanner.nextLine();
        System.out.println("lütfen soyisminizi giriniz");
        String soyIsim=scanner.nextLine();


        duzenlenmisIsim=girilenIsim.substring(0,1).toUpperCase()+
                girilenIsim.substring(1).toLowerCase()+
                " "+
                soyIsim.substring(0,1).toUpperCase()+
                soyIsim.substring(1).toLowerCase();

        System.out.println(duzenlenmisIsim);



    }






}
