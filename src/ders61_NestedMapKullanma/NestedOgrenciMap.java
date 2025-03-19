package ders61_NestedMapKullanma;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NestedOgrenciMap {

   public static Map<Integer,Map<String,Object>> ogrenciNestedMap=new TreeMap<>();

    static {

      mapeOgrenciEkle(102,"Veli","Cem",11,"M","Soz");
      mapeOgrenciEkle(103,"Ali","Cem",11,"H","TM");
      mapeOgrenciEkle(104,"Ayse","Can",10,"H","MF");
      mapeOgrenciEkle(105,"Sevgi","Cem",11,"M","TM");
      mapeOgrenciEkle(106,"Sevgi","Can",10,"K","MF");
      mapeOgrenciEkle(107,"Esra","Han",11,"M","Soz");






        // ogrenciMap= {101={sinif=10, sube=H, soyisim=Can, bolum=MF, isim=Ali},

        //102={sinif=11, sube=M, soyisim=Cem, bolum=Soz, isim=Veli},
            // 103={sinif=12, sube=H, soyisim=Cem, bolum=TM, isim=Ali}}

        //{"Isim"="Ali","soyisim"="Cem",sinif="10","sube"="H","bolum"="MF"


    }

    public static void mapeOgrenciEkle(Integer ogrenciNo,String isim,String soyisim,Integer sinif,String sube,String bolum){

        Map<String,Object> ogrenciMap=new HashMap<>();
        ogrenciMap.put("sinif",sinif);
        ogrenciMap.put("sube",sube);
        ogrenciMap.put("soyisim",soyisim);
        ogrenciMap.put("isim",isim);
        ogrenciMap.put("bolum",bolum);

        ogrenciNestedMap.put(ogrenciNo,ogrenciMap);



    }
}
