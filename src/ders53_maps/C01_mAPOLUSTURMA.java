package ders53_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_mAPOLUSTURMA {
    public static void main(String[] args) {


        Map<Integer,String>ogrenciMap=new HashMap<>();
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

        //bütün keyleri yazdırın

        System.out.println(ogrenciMap.keySet());//[101, 102, 103, 104, 105, 106, 107]

        //bütün valuleri yazdırın

        System.out.println(ogrenciMap.values());//[Ali-Can-10-H-MF,
        // Veli-Cem-10-K-TM, Ali-Cem-11-K-TM,
        // Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM,
        // Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]

        //103 numaralı ogrencinin bilgilerini yazdırın

        System.out.println(ogrenciMap.get(103));//Ali-Cem-11-K-TM

        //110 nolu ogrencinin bilgileri

        System.out.println(ogrenciMap.get(110));//null

        // eger istenirse eleman yoksa standart bir yazı getirmesini sağlaya bilriz

        System.out.println(ogrenciMap.getOrDefault(104, "bu ögrenci yok"));//Ayse-Can-10-H-MF
        System.out.println(ogrenciMap.getOrDefault(120, "bu ögrenci yok"));//bu ögrenci yok

        //numarası 106 olan bir ogrenci var mı

        System.out.println(ogrenciMap.containsKey(106));//true
        System.out.println(ogrenciMap.containsKey(120));//false

        //ismi Ali olan bir ögrenci varmı

        System.out.println(ogrenciMap.containsValue("Ali"));//false
        //contasinsValue() verilen degeri bir bütün olarak valuelerle karşılaştırır
        //öğrencilerden valuesi sadeci Ali olan olmadığı için false verdi..


        // valuesi 106=Sevgi-Can-10-K-MF olan var mı


        //öğrenci mapine var bir olan bir key ile yeni değer eklersek
        ogrenciMap.put(101, "Nihan-Turna-11-K-TM");
        System.out.println(ogrenciMap); //{101=Nihan-Turna-11-K-TM,}

        ogrenciMap.putIfAbsent(101,"Nazli-Yilmaz-10-L-Say");
        System.out.println(ogrenciMap);//{101=Nihan-Turna-11-K-TM, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM,
        // 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF, 107=Esra-Han-11-M-SOZ}

        ogrenciMap.putIfAbsent(110,"Haydar-Turna-22-L-Say");
        System.out.println(ogrenciMap);//110 nolu olmadığı için ekledi...


        ogrenciMap.replace(102,"Fadime -Oncu-11-S-Say");
        System.out.println(ogrenciMap);

//varolan bir kayıt için replace ve put aynı işlemi yapar ancak
// olmayan bir key için kullnadığımızda farklı sonucalr verir

        ogrenciMap.replace(111,"Ramazan-Aslan-10-K-TM");//111 NOLU OGRENCİ OLMADIĞI İÇİN REPLACE YAPAMAZ
        ogrenciMap.put(112,"Ramazan-Yilmaz-10-K-TM");//şimdi eklendi...


        //eger verdğimiz key in valuesi spesifik deger ise güncelle demek istersek

        ogrenciMap.replace(101,"Mehmet-Turna-11-K-TM","Ayse-Turna-11-K-TM");

        System.out.println(ogrenciMap);//101 mehmet turna olmadığı için hiç bir işelm yapmadı
        // 101=Nihan-Turna-11-K-TM, yazdırdı..

        System.out.println(ogrenciMap.size());//9 ögrenci olduğu için 9 yazdırır

ogrenciMap.remove(102);
        System.out.println(ogrenciMap);//{112=Ramazan-Yilmaz-10-K-TM,
        // 101=Nihan-Turna-11-K-TM,
        // 103=Ali-Cem-11-K-TM,
        // 104=Ayse-Can-10-H-MF,
        // 105=Sevgi-Cem-11-M-TM,
        // 106=Sevgi-Can-10-K-MF,
        // 107=Esra-Han-11-M-SOZ,
        // 110=Haydar-Turna-22-L-Say}

        System.out.println(ogrenciMap.remove(130));//null
        ogrenciMap.clear();
        System.out.println(ogrenciMap);{}


    }
}
