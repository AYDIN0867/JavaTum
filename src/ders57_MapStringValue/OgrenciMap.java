package ders57_MapStringValue;

import java.util.*;

public class OgrenciMap {

    public static Map<Integer, String> ogrenciMap = new HashMap<>();

    static {

        ogrenciMap.put(101, "Ali-Can-10-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");
        ogrenciMap.put(107, "Esra-Han-11-M-SOZ");


    }

    // ogrenci map inde verilen öğrenci numaralı ogrencinin
    // sinif ,sube,isim ve soyIsmini yazdirin


    public static void numaradanOgrenciBilgisiyazdir(int ogrenciNo) {

        //1. adım öğreci valuyeyi kaydedelim
        String ogrenciValue = ogrenciMap.get(ogrenciNo);//Ali-Can-10-H-MF

//2. adım bilgilere rahat ulaşabilmek için valuye arraye donustreilim

        String[] valueArr = ogrenciValue.split("-");  // Ali,Can,10,H,MF

// 3. adım arrayeden istenen bilgileri alırız.
// sinif ,sube,isim ve soyIsmini yazdirin
        System.out.println(ogrenciNo + " " +
                "numaralı ogrenci bilgileri");
        System.out.println(

                "Istemis oldugunuz ogrencinin Sinifi : " + valueArr[2] +
                        "\nogrencinin Subesi :  " + valueArr[3] +
                        "\nogrencinin Bölümü :  " + valueArr[4] +
                        "\nogrencinin Adı :  " + valueArr[0] +
                        "\nogrencinin SoyAdı :  " + valueArr[1].toUpperCase()


        );


    }

    public static void soyIsimdenListeYazdir(String verilenSoyısım) {
        Collection<String> ogrenciValulerineCollection = ogrenciMap.values();

        System.out.println(ogrenciValulerineCollection);//
            /*
        {101=Ali-Can-10-H-MF,
                102=Veli-Cem-10-K-TM,
                103=Ali-Cem-11-K-TM,
                104=Ayse-Can-10-H-MF,
                105=Sevgi-Cem-11-M-TM,
                106=Sevgi-Can-10-K-MF,
                107=Esra-Han-11-M-SOZ}
         */

        for (String each                  //Ali-Cem-11-K-TM
                : ogrenciValulerineCollection) {


            String[] valueArr = each.split("-");


            if (valueArr[1].equalsIgnoreCase(verilenSoyısım)) {

                System.out.println(

                        valueArr[2] + " " +
                                valueArr[3] + " " +
                                valueArr[0] + " " +
                                valueArr[1]


                ); //11 M Sevgi Cem
            }


        }


    }

    public static void sinifSubeListesiYazdirma(Integer istenenSinif, String istenenSube) {

        // sinif ve sube verildiginde
        // o siniftaki ogrencilerin
        //numara, isim, soyisim lerini liste olarak alt alta yazdiran bir method olusturun


        //1- tum valueleri kaydederiz
        // ogrenciMap.keySet() methodu Set olarak tum valueleri getirir

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();
        //[101,102,103,104,105,106,107]

        //2 bir for each loop ile her bir key i ele alalım

        for (Integer eachkey
                : ogrenciKeySeti) {
            //[101,102,103,104,105,106,107]
            //3 bizim each getirdiği key e ait valueyu kaydedelim

            String eachValue = ogrenciMap.get(eachkey);//Ali-Can-10-H-MF,
            //4 valuyeyi split ile bölüp bir array olarak kaydedelim ki bilgilere direk ulaşabilelim

            String eachValueArr[] = eachValue.split("-");//[Ali, Can, 10 ,H , MF]

//5 kaydettiğimiz valuArr'inde istenen bilgiyi kontrol edip istenen sari sağlayan ogrencilerin,
            //istenen sarti saglayan ogrencilerin, istenen bilgileri yazdrın

            if (eachValueArr[2].equalsIgnoreCase(istenenSinif + "")
                    && eachValueArr[3].equalsIgnoreCase(istenenSube)) {

                System.out.println(
                        eachkey + " " +
                                eachValueArr[0] + " " +
                                eachValueArr[1]


                );//103 Ali Cem
            }


        }


    }

    public static void isimdenOgrenciListele(String verilenIsim) {

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();
        //2- bir foor-each loop ile her bir key i ele alalım
        System.out.println("ismi: " + verilenIsim + " olan ogrenci listesi");
        for (Integer eachKey
                : ogrenciKeySeti) {

            //3- each'in getirdiği key e ait valueye kaydedelim

            String eachValue = ogrenciMap.get(eachKey);

            //4- value'yu split ile bolup bir array olarak kaydedelim ki bilgilere direk ulaşalım

            String[] eachValueArr = eachValue.split("-");


            if (eachValueArr[0].equalsIgnoreCase(verilenIsim)) {

                System.out.println(

                        eachKey + " " +
                                eachValueArr[2] + " " +
                                eachValueArr[3] + " " +
                                eachValueArr[0] + " " +
                                eachValueArr[1]


//ismi: Aliolan ogrenci listesi
//101 10 H Ali Can
//103 11 K Ali Cem


                );


            }


        }
    }

//numarası verilen ogrencinin soyismini update yapma

    public static void numaraIleSoyisimUpdate(Integer verilenNo, String yenisoyısim) {

        String verilenNoVlaue = ogrenciMap.get(verilenNo);

//2-bilgilere rahat ulaşmak icin value'yu split edelim

        String[] verielnNoValueArr = verilenNoVlaue.split("-");


//3- array uzerinde istenen kontrolleri ve update i yapin

        verielnNoValueArr[1] = yenisoyısim;

//4- update array de yapıldı , bu değişiklikliği map e yapabilmek için
        //array i yeniden - (tire) ile birleştirip yeniValue elde edelim

        String verilenNOyeniValue = String.join("-", verielnNoValueArr);


//5- key belli, yeniValue de olusturuldu, ikisini kullanarak map'i update edin

        ogrenciMap.replace(verilenNo, verilenNOyeniValue);


    }

    public static void kullanicidanAlinanBilgilerleOgrenciekle() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ogrenci No ? :");
        int ogrenciNo = scanner.nextInt();

        String ogrenciValue = "";


        scanner.nextLine();
        System.out.println("isim ?");
        ogrenciValue += scanner.nextLine();
        ogrenciValue += "-";

        System.out.println("soyisim ?");
        ogrenciValue += scanner.nextLine();
        ogrenciValue += "-";

        System.out.println("sinif ?");
        ogrenciValue += scanner.nextLine();
        ogrenciValue += "-";

        System.out.println("sube?");
        ogrenciValue += scanner.nextLine().toUpperCase();
        ogrenciValue += "-";

        System.out.println("bolüm ?");
        ogrenciValue += scanner.nextLine();

        ogrenciMap.put(ogrenciNo, ogrenciValue);


    }

    public static void verilenSinifveSubedekiOgrencilerinSubesiniUpdateyap(int sinif, String eskiSube, String yeniSube) {

        //1- tum key'leri kaydederiz
        //ogrenciMap.keySet () method u Set olarak tum key'leri getirir

        Set<Integer> ogrenciKeySet = OgrenciMap.ogrenciMap.keySet();
        //2-bir for-each loop ile her bir key i ele alalım
        for (Integer eachKey
                : ogrenciKeySet) { //101,102,103,104,105,106,107

            //3-each 'in getirdiği key'e ait valueyi kaydedelim

            String eachValue = ogrenciMap.get(eachKey);

            //4- value'yu split ile bolup

            String[] eachValueArr = eachValue.split("-");
            //bir array olarak kaydedelim ki bilgilre dogrudan ulasabilelim


            //5- kaydettiğimiz valueArr'inde istenen bilgiyi kontrol edip
            //istenen sarti sağlayan ogrencilerin, istenen bilgileri update edin
            //     101=Ali-Can-10-H-MF,
            if (eachValueArr[2].equalsIgnoreCase(sinif + "") && eachValueArr[3].equalsIgnoreCase(eskiSube)) {
                eachValueArr[3] = yeniSube;

                //10/K sinifindaki ogrencilerin subelerini Z yapin

                //6-array de yapılan değişiklikliği ma e tasimak icin
                //arryi (tire) - ile birleştirip yeniValue olusturalim

                String birlesenYeniValue = String.join("-", eachValueArr);

                //7-eachKey ve yeni value ile map i update edelim...

                ogrenciMap.put(eachKey, birlesenYeniValue);
            }


        }


        //6. ve 7 adımları if içine yazarak tüm ögrencileri yeniden map e yüklemesin sadece sınıf ve
        // subesi istenen değere şit olan öğrencileri güncellesin ve map e kelsin


    }

    public static void bolumUpdate(String eskiBolum, String yeniBolum) {

        Set<Integer> ogrenciKeySet = OgrenciMap.ogrenciMap.keySet();

        //2-bir for-each loop ile her bir key i ele alalım

        for (int eachkey
                : ogrenciKeySet) {

            //3-each 'in getirdiği key'e ait valueyi kaydedelim
            String eachValue = ogrenciMap.get(eachkey);

            //4- value'yu split ile bolup

            String[] eachValueArr = eachValue.split("-");

            //ogrenci map inde tum ogrencileri gozden gecirip
            // verilen eskiBolum bilgisine sahip olanlari
            //yeniBölüm olarak update edin
            //     101=Ali-Can-10-H-MF,

            if (eachValueArr[4].equalsIgnoreCase(eskiBolum)) {

                eachValueArr[4] = yeniBolum;
                //map de güncellleme yapmak için tekrar birleştiriyoruz

                String yenidenBirleşenValue = String.join("-", eachValueArr);

                ogrenciMap.put(eachkey, yenidenBirleşenValue);


            }


        }


    }

    public static void yilSonuSinifArtir() {

        Set<Integer> ogrenciKeySet = OgrenciMap.ogrenciMap.keySet();

        //2-bir for-each loop ile her bir key i ele alalım

        for (int eachkey
                : ogrenciKeySet) {

            //3-each 'in getirdiği key'e ait valueyi kaydedelim
            String eachValue = ogrenciMap.get(eachkey);

            //4- value'yu split ile bolup

            String[] eachValueArr = eachValue.split("-");

            //ogrenci map inde tum ogrencileri gozden gecirip
            // verilen eskiBolum bilgisine sahip olanlari
            //yeniBölüm olarak update edin
            //     101=Ali-Can-10-H-MF,

            String eskiSinif = eachValueArr[2];

            switch (eskiSinif) {

                case "9":
                    eachValueArr[2] = "10";
                    break;

                case "10":
                    eachValueArr[2] = "11";
                    break;

                case "11":
                    eachValueArr[2] = "12";
                    break;

                case "12":
                    eachValueArr[2] = "Mezun";
                    break;

            }


            String yenidenBirleşenValue = String.join("-", eachValueArr);

            ogrenciMap.put(eachkey, yenidenBirleşenValue);


        }


    }







}




