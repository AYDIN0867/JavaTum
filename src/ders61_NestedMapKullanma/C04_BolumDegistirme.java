package ders61_NestedMapKullanma;

import java.util.Set;

public class C04_BolumDegistirme extends NestedOgrenciMap {

    public static void main(String[] args) {

       String eskiBolum="TM";
       String yeniBolum="EA";

       //ogrenci nested map de bolumu eskiBolum olan ogrencilerin bolumlerini
        //yeniBolum olarak update edin

        //1. adım tum keyleri bir set olarak kaydedelim

        Set<Integer> ogrenciNoSeti=ogrenciNestedMap.keySet();

        //2. adım ogrenciNo setindeki numaraları bir for each loop ile gözden gecirip
        //istenen sartları sağlayan öğrenciler için istenen islemleri yapın

        for (Integer eachNo
                : ogrenciNoSeti ) {

            String eskiBolumOgrenci= (String) ogrenciNestedMap.get(eachNo).get("bolum");

           if (eskiBolumOgrenci.equalsIgnoreCase(eskiBolum)){

               ogrenciNestedMap.get(eachNo).put("bolum",yeniBolum);
           }


        }

        System.out.println(ogrenciNestedMap);



    }
}
