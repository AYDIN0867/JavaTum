package ders57_MapStringValue;

public class C01_NumaraIleOgrenciArama extends OgrenciMap {
    public static void main(String[] args) {

        // ogrenci map inde verilen öğrenci numaralı ogrencinin
        // sinif ,sube,isim ve soyIsmini yazdirin

        int ogrenciNo=103;

       // System.out.println(ogrenciMap);//{}
       // System.out.println(ogrenciMap);
        //  System.out.println(ogrenciMap);
        /*
        {101=Ali-Can-10-H-MF,
        102=Veli-Cem-10-K-TM,
        103=Ali-Cem-11-K-TM,
        104=Ayse-Can-10-H-MF,
        105=Sevgi-Cem-11-M-TM,
        106=Sevgi-Can-10-K-MF,
        107=Esra-Han-11-M-SOZ}
         */

//1. adım öğreci valuyeyi kaydedelim
        String ogrenciValue=ogrenciMap.get(ogrenciNo);//Ali-Can-10-H-MF

//2. adım bilgilere rahat ulaşabilmek için valuye arraye donustreilim

String [] valueArr=ogrenciValue.split("-");  // Ali,Can,10,H,MF

// 3. adım arrayeden istenen bilgileri alırız.
// sinif ,sube,isim ve soyIsmini yazdirin
        System.out.println(ogrenciNo+" " +
                "numaralı ogrenci bilgileri");
        System.out.println(

                "Istemis oldugunuz ogrencinin Sinifi : "+valueArr[2]+
                 "\nogrencinin Subesi :  "+valueArr[3]+
                 "\nogrencinin Bölümü :  " +valueArr[4]+
                        "\nogrencinin Adı :  " +valueArr[0]+
                        "\nogrencinin SoyAdı :  " +valueArr[1].toUpperCase()



        );





    }
}
