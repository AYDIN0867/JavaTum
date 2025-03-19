package ders56_mapsEvde;

import java.util.Arrays;

public class C02_ValuedenBilgiyeUlasma {

    public static void main(String[] args) {

  //bir ogrencinin bilgileri tek bir String halinde
  // asagida verilen formatla tutulmaktadır
  //ogrenci bilgisi verildiğinde soyismi yazdirin

  String ogrenciBilgisi= "Ali-Can-10-H-MF";

  // ogrenci bilgisi verildiğinde sinifi yazdirin

        String[] valueArr=ogrenciBilgisi.split("-");
        System.out.println(Arrays.toString(valueArr));//[Ali, Can, 10, H, MF]
        System.out.println("Sinif : "+valueArr[2]);//Sinif : 10
        System.out.println("Bölüm : "+ valueArr[4]);

  //ogrenci bilgisi verildiğinde bölümü yazdirin
        System.out.println("Bölüm : "+ valueArr[4]);//Bölüm : MF


//öğrencinin isim ve soyismini yazdirin
        System.out.println("isim soyisim : "+valueArr[0]+" "+valueArr[1].toUpperCase());










    }
}
