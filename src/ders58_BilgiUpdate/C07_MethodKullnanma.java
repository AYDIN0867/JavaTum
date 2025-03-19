package ders58_BilgiUpdate;

import ders57_MapStringValue.OgrenciMap;

public class C07_MethodKullnanma {

    public static void main(String[] args) {

    OgrenciMap.verilenSinifveSubedekiOgrencilerinSubesiniUpdateyap(11,"M","T");

        System.out.println(OgrenciMap.ogrenciMap);

OgrenciMap.bolumUpdate("EA","TM");
//{101=Ali-Can-10-H-MF, 102=Veli-Cem-10-K-TM,
// 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF,
// 105=Sevgi-Cem-11-T-TM, 106=Sevgi-Can-10-K-MF,
// 107=Esra-Han-11-T-SOZ}
// Bölümü ea olanları tm yaptık

        System.out.println(OgrenciMap.ogrenciMap);


    }

}
