package ders59_EntrySetKullanımı;

import ders57_MapStringValue.OgrenciMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C01_EntrySet extends OgrenciMap {
    public static void main(String[] args) {

      //ogrenci map indeki keyleri yazdirin

        Set<Integer> ogrenciKeySet=ogrenciMap.keySet();
        System.out.println(ogrenciKeySet);//[101, 102, 103, 104, 105, 106, 107]

        for (Integer eachKey
                 : ogrenciKeySet  ) {
            System.out.print(eachKey+" " ); //101 102 103 104 105 106 107
           }

        System.out.println("");
      //ogrenci map'indeki valueleri yazdirin

        Collection<String> ogrenciValueCollection=ogrenciMap.values();
        System.out.println(ogrenciValueCollection); //[Ali-Can-10-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]

     //

for ( String eachValue
         :ogrenciValueCollection   ) {

    System.out.print(eachValue+" ");
   }
//keyleri kullanarak da valuleri yazdıra bilriz


  for ( Integer eachKey
           : ogrenciKeySet  ) {

      System.out.println(ogrenciMap.get(eachKey + " "));
  }

   //bir mapdeki key leri ve valuleri ayrı ayrı elde edebiliyoruz
   //ve ayri ayri for each ile gözden gecireiliyoruz ama


  // her bir ogrenciye ait key ve valueyu tek bir deger olarak ele alıp
  //tek bir for each loop ile gozden gecirebilir miyiz

  //işte burda Entry class ı devreye girer...
        // key ve valueyi bir eleman olarak ele almamıza imkan tanır

        System.out.println(ogrenciMap);

//{101=Ali-Can-10-H-MF,
// 102=Veli-Cem-10-K-TM,
// 103=Ali-Cem-11-K-TM,
// 104=Ayse-Can-10-H-MF,
// 105=Sevgi-Cem-11-M-TM,
// 106=Sevgi-Can-10-K-MF,
// 107=Esra-Han-11-M-SOZ}

        //key ve valuleri birlii birlikte tutabilmek için java Entry interface'ini olusturmustur

     Set<Map.Entry<Integer,String>> ogrenciEntrySeti  =ogrenciMap.entrySet();

        System.out.println("ogrenci entry seti :"+ ogrenciEntrySeti);

        //görüntüsü tamamen map gibi olsa da bir set olduğu için for each loop ile kullanılabilir
        //böylece tüm ögrencilerin key ve valulerini birlikte elealabiliriz ve daha z adım ile işlemleri yaparız


        // enrt set kullanarak tum öğrencilerin numara, isim ve soyisimleriniyazdırın


        //1. adım Enrty set olustur

        //2. adım bir for each loop ile tüm Entryleri gözden gecir

        for ( Map.Entry<Integer,String> eachEntry
                 :ogrenciEntrySeti   ) {


            // 3. adım ogrenci vluesini kaydedelim

           String eachValue= eachEntry.getValue();


           //4. adım valuedeki bilgilee erişmel için split ederiz

            String [] eachValueArr=eachValue.split("-");

            //5. adım istenen kontrolleri yapıp istenen bilgileri yazdırın

            System.out.println(

                    eachEntry.getKey()+" "+eachValueArr[0]+" "+
                            eachValueArr[1]



            );

           }


    }
}
