package ders58_BilgiUpdate;

import ders57_MapStringValue.OgrenciMap;

public class C06_YilSonuSinifArtirma extends OgrenciMap {

    public static void main(String[] args) {

   //yil sonu sinif artirma yapın
   // her ogrenci bir ust sinifa gecirin
   //sinif 12 ise "mezun" yapın zaten,mezun olanlara dokunmayın


        System.out.println(ogrenciMap);
//{101=Ali-Can-10-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF, 107=Esra-Han-11-M-SOZ}
        yilSonuSinifArtir();

        System.out.println(ogrenciMap);
    //    {101=Ali-Can-11-H-MF, 102=Veli-Cem-11-K-TM, 103=Ali-Cem-12-K-TM, 104=Ayse-Can-11-H-MF, 105=Sevgi-Cem-12-M-TM, 106=Sevgi-Can-11-K-MF, 107=Esra-Han-12-M-SOZ}

        yilSonuSinifArtir();

        System.out.println(ogrenciMap);

//{101=Ali-Can-12-H-MF, 102=Veli-Cem-12-K-TM, 103=Ali-Cem-Mezun-K-TM, 104=Ayse-Can-12-H-MF, 105=Sevgi-Cem-Mezun-M-TM, 106=Sevgi-Can-12-K-MF, 107=Esra-Han-Mezun-M-SOZ}


    }
}
