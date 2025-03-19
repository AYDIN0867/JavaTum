package ders53_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_ogrenciMapClassi {


   static Map<Integer,String> ogrenciMap=new HashMap<>();


static {
   ogrenciMap.put(101,"Ali-Can-10-H-MF");
   ogrenciMap.put(102,"Veli-Cem-10-K-TM");
   ogrenciMap.put(103,"Ali-Cem-11-K-TM");
   ogrenciMap.put(104,"Ayse-Can-10-H-MF");
   ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
   ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
   ogrenciMap.put(107,"Esra-Han-11-M-SOZ");





}



   //öğrenci mapinde ismi arananIsim olan ogrencilerin
   //isim,soyisim,ve siniflarini liste olarak yazdiran bir method oluşturun


   public static void isimListesiYazdir(String arananIsim){

      Set<Integer> ogrenciKeyset=ogrenciMap.keySet();//[101, 102, 103, 104, 105, 106, 107]
      // System.out.println(ogrenciKeyset); //[101, 102, 103, 104, 105, 106, 107]

//2. adım tüm keyleri tek tek ele alıp,
      //o keye ait valuyei incelemek için bir loop oluşturalım


      for (Integer eachKey : ogrenciKeyset  ) {

         //3. adim: eachKey bize tek tek her bir ogrenci numaarasını getirir
         //bizim o ögrenci numarasına ait valueyi kaydetmemiz gerekir

         String eachValue=ogrenciMap.get(eachKey); //101=Ali-Can-10-H-MF

         //4. adım valueyi bir bütün olarak kaydettik ismi kontrol için önce - ile split edip
         //bir array olarak kaydederiz

         String [] eachValueArr   =eachValue.split("-"); //[Ali,Can,10,H,MF]

         //5. adım artık istenen işlemi yapabiliriz
         //ogrenci mapinde ismi Ali olan ogrencilerin
         //isism soyisim ve siniflairni liste olarak yazın

         if (eachValueArr[0].equalsIgnoreCase(arananIsim)){

            System.out.println(eachValueArr[0]+eachValueArr[1]+" "+eachValueArr[2]);

         }

      }

   }


public static void sinifSubeyaz(String arananSinif,String arananSube){


   Set<Integer> ogrenciKeyset = ogrenciMap.keySet();//[101, 102, 103, 104, 105, 106, 107]
   // System.out.println(ogrenciKeyset); //[101, 102, 103, 104, 105, 106, 107]

//2. adım tüm keyleri tek tek ele alıp,
   //o keye ait valuyei incelemek için bir loop oluşturalım

   System.out.println(arananSinif+"/"+arananSube+"================Aranan Subedeki Ogrenciler===========");

   for (Integer eachKey : ogrenciKeyset) {

      //3. adim: eachKey bize tek tek her bir ogrenci numaarasını getirir
      //bizim o ögrenci numarasına ait valueyi kaydetmemiz gerekir

      String eachValue = ogrenciMap.get(eachKey); //101=Ali-Can-10-H-MF

      //4. adım valueyi bir bütün olarak kaydettik ismi kontrol için önce - ile split edip
      //bir array olarak kaydederiz

      String[] eachValueArr = eachValue.split("-"); //[Ali,Can,10,H,MF]

      //5. adım artık istenen işlemi yapabiliriz
      //ogrenci mapinde ismi Ali olan ogrencilerin
      //isism soyisim ve siniflairni liste olarak yazın

      if (eachValueArr[2].equalsIgnoreCase(arananSinif)&&eachValueArr[3].equalsIgnoreCase(arananSube)) {

         System.out.println(eachKey+" "+eachValueArr[0]+" "+eachValueArr[1]); //103 Ali Cem
      }


   }













}


   // verilen soyisme ogrencilerin
   //ogrenciNo sinif sube ve isimlerini yazdirin

   public static void soyIsimdenOgrenciBulma(String arananSoyIsim){


      //1. inci adım :tüm keyleri elde edelim

      Set<Integer> ogrenciKeyset=ogrenciMap.keySet();//[101, 102, 103, 104, 105, 106, 107]
      // System.out.println(ogrenciKeyset); //[101, 102, 103, 104, 105, 106, 107]

      System.out.println("================Soyadı "+arananSoyIsim+" Olan ogrenci listesi===========");

      //2. adım tüm keyleri tek tek ele alıp,
      //o keye ait valuyei incelemek için bir loop oluşturalım

      for (Integer eachKey : ogrenciKeyset) {

         //3. adim: eachKey bize tek tek her bir ogrenci numaarasını getirir
         //bizim o ögrenci numarasına ait valueyi kaydetmemiz gerekir

         String eachValue = ogrenciMap.get(eachKey);

         //4. adım valueyi bir bütün olarak kaydettik ismi kontrol için önce - ile split edip
         //bir array olarak kaydederiz

         String [] eachValueArr   =eachValue.split("-"); //[Ali,Can,10,H,MF]

         //5. adım artık istenen görevi yapalım;
         // // verilen soyisme ogrencilerin
         //        //ogrenciNo sinif sube ve isimlerini yazdirin

         if (eachValueArr[1].equalsIgnoreCase(arananSoyIsim)){

            System.out.println(eachKey+" "+eachValueArr[2]+" "+eachValueArr[3]+" "+eachValueArr[0]);
            //101 10 H Ali
            //104 10 H Ayse
            //106 10 K Sevgi
         }

      }




   }


}
