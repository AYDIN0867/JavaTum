package ders24_ArraysVeTekrarMethod;

import java.util.Arrays;

public class C07_Method_Kullanma {

    public static void main(String[] args) {

        int [] sayilar={2,4,6,-9,-5,-2};
//sayılar arreyindeki pozitif sayıların toplamınıı yazdırın
        System.out.println(C06_Arrays_Pozitif_Sayıların_Toplmaı.getpozitifSayilarınToplami(sayilar));//12

String [] sirketler={"sonny","coolstoves","tesla"," samsung"};
//şirket ismi en uzun ve kısa olanı yazdır

        C09_Enzuzun_Enkısa_Kelimeler.printEnkısaEnzuznKelime(sirketler);
// asayolar arreyinde 4 var mı ?
        C08_Kullanımsayısı.printKullanımSayisi(sayilar,4);//1

        // sayılar arrayine 7 ve 9 değerlerini ekleyin

sayilar=C10_Arraye_Eleman_Ekleme.arrayeElemaneekle(sayilar,7);
sayilar=C10_Arraye_Eleman_Ekleme.arrayeElemaneekle(sayilar,9);
        System.out.println(Arrays.toString(sayilar));



    }
}
