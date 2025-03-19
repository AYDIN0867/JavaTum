package ders57_MapStringValue;

import java.util.Collection;

public class C02_SoyIsimdenOgrenciBilgisiYazdirma extends OgrenciMap {

    public static void main(String[] args) {
        //verilen soyisim'e sahip ogrencilerin
        //sinif sube isim ve soyisimlerini
        //alt alta yazdırın

        String verilenSoyısım="Cem";

                /*
        {101=Ali-Can-10-H-MF,
        102=Veli-Cem-10-K-TM,
        103=Ali-Cem-11-K-TM,
        104=Ayse-Can-10-H-MF,
        105=Sevgi-Cem-11-M-TM,
        106=Sevgi-Can-10-K-MF,
        107=Esra-Han-11-M-SOZ}
         */

/*
sadece valueye ihtiyacımız varsa ;

or: 10/K sinifindaki ogrencilerin isim ve soyisimlerini yazdirin
-tum valueleri kaydederiz
-ogrenciMap.values() method'u collection olarak tum valueleri geitrir

-bir for-each loop ile her bir value u ele alalım

bizim oglanın (each) getiridiği valueyi split ile bolup
bir array olarak kaydedelim ki bilgilere direkt ulaşalım

-kaydettiğimiz valueArr2inde sinif ve subeyi kontrol edip
istenen sinif ve sube ile ayni ise
ogrencinin isim ve soy isnimi yazdıralım


 */

        Collection<String> ogrenciValulerineCollection=ogrenciMap.values();

        System.out.println(ogrenciValulerineCollection);//
            /*
        {101=Ali-Can-10-H-MF,
                102=Veli-Cem-10-K-TM,
                103=Ali-Cem-11-K-TM,
                104=Ayse-Can-10-H-MF,
                105=Sevgi-Cem-11-M-TM,
                106=Sevgi-Can-10-K-MF,
                107=Esra-Han-11-M-SOZ}
         */

for ( String each                  //Ali-Cem-11-K-TM
         : ogrenciValulerineCollection  ) {


    String [] valueArr=each.split("-");


    if (valueArr[1].equalsIgnoreCase(verilenSoyısım)){

        System.out.println(

                        valueArr[2]+" "+
                        valueArr[3]+" "+
                        valueArr[0]+" "+
                        valueArr[1]


        ); //11 M Sevgi Cem
    }


   }






    }



}
