package ders24_ArraysVeTekrarMethod;

import java.util.Scanner;

public class C01_Method_OlusturmaVe_Kullanma {


    public static void main(String[] args) {

        // verilen ismi soyismi alıp
        // Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak şekilde duzenleyip
        // isim bosluk soyisim seklinde bize YAZDIRAN bir method olusturun
        // input:Ali soyIsim=YILMAZ. method return:Ali Yilmaz

IsmiDuzenleyazdir();
// girirlen isim ve soy ismin uzunnluğunu kpntroledip 10 harften az ise gecersiz giriş
//10 harften naz değilse "giris basarili" yazdırın
/*

yukarıda verilen görev bizden sadece yazdırmamızı istediği için oluşturduğumuz methodu void yapmayı tercih ettik ancak
görevin devamında kullanııcının girdiği isme ve soy isme main method içinde ihtiyacımız olacaksa methoddda yazdırılan
düzenlenmiş isim variable'yi kullanmayız..

bu sorunu iki türlü çözebiliriz
1- method ile
2-scop ile çözüm



 */

    }

public static void IsmiDuzenleyazdir(){


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

    System.out.println(duzenlenmisIsim);



}



}
