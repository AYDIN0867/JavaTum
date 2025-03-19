package ders57_MapStringValue;

import java.util.Collection;
import java.util.Set;

public class C03_SubeListesiyazdirma extends OgrenciMap{

    public static void main(String[] args) {

  // sinif ve sube verildiginde
  // o siniftaki ogrencilerin
  //numara, isim, soyisim lerini liste olarak alt alta yazdiran bir method olusturun

        //bu soruda numarayıda istediği ve numarada da key de olduğu için önce tum keyleri kaydederiz...

        int istenenSinif=11;
        String istenenSube="K";

        ogrenciMap.keySet();

  //1- tum valueleri kaydederiz
  // ogrenciMap.keySet() methodu Set olarak tum valueleri getirir

        Set<Integer> ogrenciKeySeti=ogrenciMap.keySet();
        //[101,102,103,104,105,106,107]

   //2 bir for each loop ile her bir key i ele alalım

        for ( Integer eachkey
                 :  ogrenciKeySeti ) {
            //[101,102,103,104,105,106,107]
            //3 bizim each getirdiği key e ait valueyu kaydedelim

            String eachValue=ogrenciMap.get(eachkey);//Ali-Can-10-H-MF,
            //4 valuyeyi split ile bölüp bir array olarak kaydedelim ki bilgilere direk ulaşabilelim

          String eachValueArr[]=eachValue.split("-");//[Ali, Can, 10 ,H , MF]

//5 kaydettiğimiz valuArr'inde istenen bilgiyi kontrol edip istenen sari sağlayan ogrencilerin,
            //istenen sarti saglayan ogrencilerin, istenen bilgileri yazdrın

if (eachValueArr[2].equalsIgnoreCase(istenenSinif+"")
        && eachValueArr[3].equalsIgnoreCase(istenenSube)){

    System.out.println(
            eachkey+" "+
            eachValueArr[0]+" "+
            eachValueArr[1]


    );//103 Ali Cem
        }


        }















    }
}
