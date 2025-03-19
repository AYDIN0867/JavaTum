package ders53_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C02_isimdenOgrenciBulma {

    //ogrenci mapinde ismi Ali olan ogrencilerin
    //isim soyisim ve sınıflarını listeleyin


    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        System.out.println(ogrenciMap);
        //{101=Ali-Can-10-H-MF,
        // 102=Veli-Cem-10-K-TM,
        // 103=Ali-Cem-11-K-TM,
        // 104=Ayse-Can-10-H-MF,
        // 105=Sevgi-Cem-11-M-TM,
        // 106=Sevgi-Can-10-K-MF,
        // 107=Esra-Han-11-M-SOZ}
        //map key ve value leri ayrı ayrı tutar



        //map de ki enbüyük challange value içeriisndeki bilgilere ulaşmak ve istendiğinde
        //bu bilgileri değiştirmektir
        //map deki valuenin içindeki bilgilere direkt ulaşmak mümkün değildir
        //bizden istenen göreve göre adı adım ilerleyerek istenen bilgilere ulaşabiliriz


        //1. inci adım :tüm keyleri elde edelim

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

            if (eachValueArr[0].equalsIgnoreCase("Ali")){

                System.out.println(eachValueArr[0]+eachValueArr[1]+" "+eachValueArr[2]);//AliCan 10
               // AliCem 11
            }

           }


    }

}
