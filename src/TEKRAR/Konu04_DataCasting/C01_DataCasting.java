package TEKRAR.Konu04_DataCasting;

public class C01_DataCasting {

    public static void main(String[] args) {

        boolean bl=true;
        char chr='a';
        byte byt=24;
        short shrt=23;
        int sayInt=45;
        long lng=40;
        float flt=3.5F;
        double dbl=4.5;
        String str ="Java yavandır";

          byt=(byte)shrt ;//23 byte -128 ile 127 arasını alabildiğini biliyoruz
        // shrt nin degeri olan23  de bu aralıkta ve diypruz ki bundan sonra sen byte ol
         byt=(byte)sayInt ;//30
         byt=(byte)lng ;//40
         byt=(byte)flt ;//3.5F //normalde byte ondalıklı almaz ama explicit narrowing yapılabilir
        // sorumluluk aldıgımız için java izin verir buna da data casting diyoruz
         byt=(byte)dbl;//4.5

//genis kapsamlı degeri dar kapsamlı variableye atamak isenirse java sorumlulugun alınması istenir
         shrt=byt ;//24
        //shrt=sayInt ;//30
        //shrt=lng ;//40
        //shrt=flt ;//3.5F
       // shrt=dbl;//4.5


        sayInt=byt;
        sayInt=shrt;
        sayInt=(int)lng; //sen explicit narrowing yaptın gunah benden gitti diyor...
        sayInt=(int)flt;
        sayInt=(int)dbl;

        //madem explcit narrowing var o zaman herşeyi explicit narrowing
        // ile istediğimiz data turune göre ayarlayabiliri miyiz bu sorunun cevabı HAYURDIR ÇUNKU;
        //Sayi degeri olan byte, short , int, long, ve double variable'lar ise
        //variable'in data turunden daha dar kapsamlı olan data turundeki degerleri
        //hicbir islem yapmamıza gerek kalmadan kabul ederler
        //buna Auto widening denir

        //boolean veya string data turundeki bir variable a
        //baska data turundeki degerleri atayamayız...explicir narrowing olmaz











    }



}
