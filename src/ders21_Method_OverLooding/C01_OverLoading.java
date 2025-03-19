package ders21_Method_OverLooding;

public class C01_OverLoading {

    public static void main(String[] args) {

        /*

        Java da bir class içerisinde ayni isim ve ayni parametrelere sahip birden fazla method OLUŞTURULAMAZ .
        java da AYNI CLASS AYNI ISIMDE method olusturmak istersek methodların signuareleri farklımolmalıdır

              */

        /*
method signutare=method adi+parametrelerin data türleri VE DİZİLİŞİ

bir class da ISMI AYNI ama sıgnutareleri farklı methodlar oluşturulmasına OVERLOADING DENİR..
İSMİ FARKLI METHODLARDA zaten overloadingden bahsedilemez
         */
/*

bir method call unn çalışması için method call de yazdığımız
argumentler iel methoddaki parametreler uyumlu olmalıdır
 */



    }

    public static void topla(int sayi1,int sayi2){//topla int int

        System.out.println("iki int sayının toplamı: "+(sayi1+sayi2));
    }

 //   public static void topla(int sayi1,int sayi2){//topla int int topla(int, int)'
        // is already defined in 'ders21_Method_OverLooding. C01_OverLoading'

      //  System.out.println("iki int sayının toplamı: "+(sayi1+sayi2));
    //}


    public static void topla(int a){//topla int int topla(int, int)'
        // burada signutarelerini değiştiriyorum hata gitmiş olacak kabul edecek

        System.out.println("iki int sayının toplamı: "+(a+a));
    }


    public static void topla(double sayi1,int sayi2){//topla double int

        System.out.println("iki int sayının toplamı: "+(sayi1+sayi2));
    }


    public static void topla(int sayi1,double sayi2){//topla int double

        System.out.println("iki int sayının toplamı: "+(sayi1+sayi2)); // parametre sıralaması değişirse de kabul eder
    }





}
