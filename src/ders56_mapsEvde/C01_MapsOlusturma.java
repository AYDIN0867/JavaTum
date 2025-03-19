package ders56_mapsEvde;

import java.util.*;

public class C01_MapsOlusturma {

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

        //103 nolu öğrencinin valuesini yazdırın

        System.out.println(ogrenciMap.get(103));//Ali-Cem-11-K-TM
        System.out.println(ogrenciMap.get(105));//Sevgi-Cem-11-M-TM

        //olmayan bir key ile valueyu yazdırsak

        System.out.println(ogrenciMap.get(111));// olmadığı için null yazdırır

        //aranan key yoksa ve standart bir cevap yazmasını istersek

        System.out.println(ogrenciMap.getOrDefault(103, "aranan key map de yok"));//Ali-Cem-11-K-TM
        System.out.println(ogrenciMap.getOrDefault(113, "aranan key map de yok"));//aranan key map de yok

        //bütün key leri yazdırın

        System.out.println(ogrenciMap.keySet());//[101, 102, 103, 104, 105, 106, 107]
        System.out.println(ogrenciMap.containsKey(122));//false

        //butun key leri kaydedin...butun keyler set olarak geldiği için önce bir set oluşturmalıyız

        Set<Integer> ogrenciKeySeti=ogrenciMap.keySet();
        System.out.println("ogrenci key seti :"+ogrenciKeySeti);//ogrenci key seti :[101, 102, 103, 104, 105, 106, 107]


//ogrenci map inde 107 nolu öğrenci var mı

        System.out.println(ogrenciMap.containsKey(107));//true

        //tum valueleri yazdırın

        System.out.println(ogrenciMap.values());//[Ali-Can-10-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM,
        // Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ] keyler olmadan sadece valueleri getirmiş oldu

        //tum valuleri kaydedin
        Collection<String> ogrenciValueCollection=ogrenciMap.values();
        System.out.println("ogrenci valueleri : "+ ogrenciValueCollection);

        //valulerde Ali var mı?
        System.out.println(ogrenciMap.containsValue("Ali"));//false
        System.out.println(ogrenciMap.containsValue("H"));//false
        System.out.println(ogrenciMap.containsValue("Ali-Can-10-H-MF"));//TRUE

        System.out.println(ogrenciMap.size());//7

        ogrenciMap.replace(101,"Hasan-Can-10-H-MF");
        System.out.println(ogrenciMap);//101=Hasan-Can-10-H-MF

        ogrenciMap.replace(110,"Hasan-Can-10-H-MF");
        System.out.println(ogrenciMap); //110 nolu öğrenci olmadığı için
        // herhangi birr değişiklik olmadı


        ogrenciMap.put(102,"Hasan-Mutlu-10-H-MF"); //varsa update eder
        ogrenciMap.put(110,"Hasan-Cin-10-H-MF");//yoksa ekler

        /*
        var olan key ler icin put ile replace ayni islevi yapar
        olmayan bir key icin replace hicbir islem yapmaz ama put elemani ekler

        eski valu'yu kontrol eder, verilen eski value ile ayni ise update eder ayni değilse update etmez
         */

        ogrenciMap.replace(105,"Sevgi-Cem-11-M-TM","Sevgi-Hayat-11-M-TM");//105=Sevgi-Hayat-11-M-TM olduğu için değiştirdi
        ogrenciMap.replace(107,"Sevgi-Cem-11-M-TM","Kemal-Hayat-11-M-TM");//07=Esra-Han-11-M-SOZ,
        // eski değer zaten olmadığı için hiçbir değişiklik yapmaz

        System.out.println(ogrenciMap);

ogrenciMap.remove(104);
ogrenciMap.remove(117);

        System.out.println(ogrenciMap);//104 ü olduğu için sildi ama 117 için bir şey yapmadı çünkü zaten yok

        ogrenciMap.remove(102,"Veli-Cem-10-K-TM"); //verilen key e ait valueverildiği gibi olduğundan öğrenciyi siler
        ogrenciMap.remove(102,"Veli-Cem-10-K-TM"); //verilen key e ait valueverilenden farklı olduğundan öğrenciyi hiçbir şey yapmaz










    }


}
