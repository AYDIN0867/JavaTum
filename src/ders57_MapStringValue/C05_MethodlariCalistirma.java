package ders57_MapStringValue;

public class C05_MethodlariCalistirma {


    public static void main(String[] args) {


        OgrenciMap.numaradanOgrenciBilgisiyazdir(104);
/*
104 numaralı ogrenci bilgileri
Istemis oldugunuz ogrencinin Sinifi : 10
ogrencinin Subesi :  H
ogrencinin Bölümü :  MF
ogrencinin Adı :  Ayse
ogrencinin SoyAdı :  CAN

 */

        OgrenciMap.soyIsimdenListeYazdir("cem");
        //10 K Veli Cem
       // 11 K Ali Cem
        //11 M Sevgi Cem

        OgrenciMap.soyIsimdenListeYazdir("can");

//        10 H Ali Can
//        10 H Ayse Can
//        10 K Sevgi Can

OgrenciMap.sinifSubeListesiYazdirma(11,"M");
//105 Sevgi Cem
//107 Esra Han

 OgrenciMap.sinifSubeListesiYazdirma(10,"K");
//102 Veli Cem
//106 Sevgi Can

OgrenciMap.isimdenOgrenciListele("ali");

//ismi: ali olan ogrenci listesi
//101 10 H Ali Can
//103 11 K Ali Cem

        OgrenciMap.isimdenOgrenciListele("veli");
//ismi: veli olan ogrenci listesi
//102 10 K Veli Cem

    }
}
