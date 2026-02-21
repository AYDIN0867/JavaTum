package ders63_treeMapMethodlari.ders62_ComputeMethodları;

import ders61_NestedMapKullanma.NestedOgrenciMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C04_SinifMevcutlari extends NestedOgrenciMap {

    public static void main(String[] args) {

       //nested ogrenci map inde her sinifta kaçar kişi olduğunu yazdirin
       //orn 9=2,10=1,11=3

        System.out.println(ogrenciNestedMap);
//{102={sinif=11, sube=M, soyisim=Cem, bolum=Soz, isim=Veli},
// 103={sinif=11, sube=H, soyisim=Cem, bolum=TM, isim=Ali},
// 104={sinif=10, sube=H, soyisim=Can, bolum=MF, isim=Ayse},
// 105={sinif=11, sube=M, soyisim=Cem, bolum=TM, isim=Sevgi},
// 106={sinif=10, sube=K, soyisim=Can, bolum=MF, isim=Sevgi},
// 107={sinif=11, sube=M, soyisim=Han, bolum=Soz, isim=Esra}}

//1. adım tüm öğrencileri gözden geçirmek için keySet kaydedelim

        Set<Integer> ogrenciKeySet=ogrenciNestedMap.keySet();

        Map<Integer,Integer> sinifOgrenciSayilariMap=new HashMap<>(); //sinif ve ogrenci adetlerini kaydetmek için map oluşturduk
//2. adım bir each for loop ile tüm keyleri gozden gecirip o keyelre ait sinif bilgilerini alıp kullandık
        for ( Integer eachKey
                 : ogrenciKeySet  ) {

            int ogrenciSinif=(Integer) ogrenciNestedMap.get(eachKey).get("sinif");

            sinifOgrenciSayilariMap.computeIfPresent(ogrenciSinif,(k,v)->v+1);
            sinifOgrenciSayilariMap.putIfAbsent(ogrenciSinif,1);
           }


        System.out.println(sinifOgrenciSayilariMap); //{10=2, 11=4}







    }
}
