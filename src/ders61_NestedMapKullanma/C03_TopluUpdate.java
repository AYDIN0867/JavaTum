package ders61_NestedMapKullanma;

import java.util.Set;

public class C03_TopluUpdate extends NestedOgrenciMap{

    public static void main(String[] args) {

     //tüm ogrrencilerin soy iismlerini buyuk harf yapın


        //1. adım tum keyleri bir set olarak kaydedelim

        Set<Integer> ogrenciNoSeti=ogrenciNestedMap.keySet();

        //2. adım ogrenciNo setindeki numaraları bir for each loop ile gözden gecirip
        //istenen sartları sağlayan öğrenciler için istene islemleri yapın

        for (Integer eachNo
                 : ogrenciNoSeti ) {

            String eskiSoyIsim= (String) ogrenciNestedMap.get(eachNo).get("soyisim");

            ogrenciNestedMap.get(eachNo).put("soyisim",eskiSoyIsim.toUpperCase());


           }

        System.out.println(ogrenciNestedMap);
//{102={sinif=11, sube=M, soyisim=CEM, bolum=Soz, isim=Veli},
// 103={sinif=11, sube=H, soyisim=CEM, bolum=TM, isim=Ali},
// 104={sinif=10, sube=H, soyisim=CAN, bolum=MF, isim=Ayse},
// 105={sinif=11, sube=M, soyisim=CEM, bolum=TM, isim=Sevgi},
// 106={sinif=10, sube=K, soyisim=CAN, bolum=MF, isim=Sevgi},
// 107={sinif=11, sube=M, soyisim=HAN, bolum=Soz, isim=Esra}}









    }
}
