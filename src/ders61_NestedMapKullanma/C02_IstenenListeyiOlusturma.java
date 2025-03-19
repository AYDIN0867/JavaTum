package ders61_NestedMapKullanma;

import java.util.Set;

public class C02_IstenenListeyiOlusturma extends NestedOgrenciMap {

    public static void main(String[] args) {

     //ogrenci map'inde 11. sinif ogrencilerinin
     // numara,sinif,sube,isim,ve soyisimlerini liste olarak yazdirin

        System.out.println(ogrenciNestedMap);

//{102={sinif=11, sube=M, soyisim=Cem, bolum=Soz, isim=Veli},
// 103={sinif=11, sube=H, soyisim=Cem, bolum=TM, isim=Ali},
// 104={sinif=10, sube=H, soyisim=Can, bolum=MF, isim=Ayse},
// 105={sinif=11, sube=M, soyisim=Cem, bolum=TM, isim=Sevgi},
// 106={sinif=10, sube=K, soyisim=Can, bolum=MF, isim=Sevgi},
// 107={sinif=11, sube=M, soyisim=Han, bolum=Soz, isim=Esra}}

        mapeOgrenciEkle(109,"Kemal","Han",10,"K","MF");
        System.out.println(ogrenciNestedMap);

        //103 numaralı ogrencinin bolumunu MF yapın

        ogrenciNestedMap.get(103).put("bolum","MF");

        //105 numarali ogrencinin soyismi Yilmaz olsun

        ogrenciNestedMap.get(105).put("soyisim","Yilmaz");

        System.out.println(ogrenciNestedMap);

        //ogrenci map inde 11. siniftaki ogrencilerin
        //numara,sinif ,sube,isim ve soyisimlerini liste olarak yazdirin

        //1. adım tum keyleri bir set olarak kaydedelim

        Set<Integer> ogrenciNoSeti=ogrenciNestedMap.keySet();

        System.out.println(ogrenciNoSeti);//[102, 103, 104, 105, 106, 107, 109]

        //2. adım ogrenciNo setindeki numaraları bir for each loop ile gözden gecirip
        //istenen sartları sağlayan öğrenciler için istene islemleri yapın

        for ( Integer eachNo
                 :  ogrenciNoSeti ) {

            if ( (Integer) ogrenciNestedMap.get(eachNo).get("sinif")==11){

                System.out.println(

                  eachNo+" "+
                  ogrenciNestedMap.get(eachNo).get("sinif")+" "+
                  ogrenciNestedMap.get(eachNo).get("sube")+" "+
                  ogrenciNestedMap.get(eachNo).get("isim")+" "+
                  ogrenciNestedMap.get(eachNo).get("soyisim")


                );


                /*

102 11 M Veli Cem
103 11 H Ali Cem
105 11 M Sevgi Yilmaz
107 11 M Esra Han



                 */

            }

           }







    }
}
