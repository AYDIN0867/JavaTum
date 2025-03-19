package ders58_BilgiUpdate;

import ders57_MapStringValue.OgrenciMap;

import java.util.Arrays;

public class C01_ValueUpdate extends OgrenciMap {

    public static void main(String[] args) {

//102 numaralı ogrencinin ismini ve soyismini yazdirin


        String ogrenciValue=ogrenciMap.get(102);
        System.out.println(ogrenciValue); //Veli-Cem-10-K-TM

        String [] ogrenciValueArr=ogrenciValue.split("-");
        System.out.println(Arrays.toString(ogrenciValueArr)); //[Veli, Cem, 10, K, TM]

        System.out.println(

                "102 nolu ogrenci : "+ ogrenciValueArr[0]+" "+ogrenciValueArr[1]

        );

//102 nolu ogrencinin adini Kemal olarak değiştirin

        ogrenciValueArr[0]="Kemal";

        System.out.println(Arrays.toString(ogrenciValueArr)); //[Kemal, Cem, 10, K, TM] arrayde yaptığımız güncelleme arreyde
        // kalır map de aşağıda gözüktüğü gibi değişiklik olmaz
        System.out.println(ogrenciMap);//{101=Ali-Can-10-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM,
        // 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF, 107=Esra-Han-11-M-SOZ}

//mapde up date yapabilmek için array in yeni halini - tire ile birleştirip
        //yeni value elde edelim

        String yeniValue=String.join("-",ogrenciValueArr);

        System.out.println(yeniValue); //Kemal-Cem-10-K-TM

        ogrenciMap.replace(102,yeniValue);

        System.out.println(ogrenciMap); //şimdi map de de güncelleme yapmış olduk 102 de artık kemal var
      //  {101=Ali-Can-10-H-MF, 102=Kemal-Cem-10-K-TM, 103=Ali-Cem-11-K-TM,
        //  104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF, 107=Esra-Han-11-M-SOZ}

//104  numaralı ogrencinin soyismini Yilmaz yapin

     int verilenNo=104;
     String yenisoyısim="Yılmaz";
// 1- ogrencinin eski value'sunu kaydedelim

      String verilenNoVlaue=ogrenciMap.get(verilenNo);

//2-bilgilere rahat ulaşmak icin value'yu split edelim

     String [] verielnNoValueArr= verilenNoVlaue.split("-")  ;


//3- array uzerinde istenen kontrolleri ve update i yapin

        verielnNoValueArr[1]=yenisoyısim;

//4- update array de yapıldı , bu değişiklikliği map e yapabilmek için
        //array i yeniden - (tire) ile birleştirip yeniValue elde edelim

      String  verilenNOyeniValue=String.join("-",verielnNoValueArr);



//5- key belli, yeniValue de olusturuldu, ikisini kullanarak map'i update edin

ogrenciMap.replace(verilenNo,verilenNOyeniValue);
        System.out.println(ogrenciMap);

// öncesi 104=Ayse-Can-10-H-MF,
//güncel hali  104=Ayse-Yılmaz-10-H-MF,



    }
}
