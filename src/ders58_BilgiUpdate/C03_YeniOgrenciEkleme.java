package ders58_BilgiUpdate;

import ders57_MapStringValue.OgrenciMap;

import java.util.Scanner;

public class C03_YeniOgrenciEkleme {

    public static void main(String[] args) {

    //kullanicidan numara ,isim ,soyisim,sinif,sube ve bolum bilgileri alıp
    // ogrenciyi map e kaydeden bir method oluşturun

        OgrenciMap.kullanicidanAlinanBilgilerleOgrenciekle();

        System.out.println(OgrenciMap.ogrenciMap);


    }
}
