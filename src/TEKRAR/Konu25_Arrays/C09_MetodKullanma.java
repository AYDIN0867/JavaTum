package TEKRAR.Konu25_Arrays;

import java.util.Arrays;

public class C09_MetodKullanma {
    public static void main(String[] args) {

        int [] arr={3,6,7,3,5,1};
        String [] barare={"a","c","d","x","a","s","s","s","k","ş","l","d"};

       arr= C04_TumElementleriArtirma.arrayinElemanlarınıArtır(arr,3);

        System.out.println(Arrays.toString(arr));//[6, 9, 10, 6, 8, 4]


        arr= C04_TumElementleriArtirma.arrayinElemanlarınıArtır(arr,1);

        System.out.println(Arrays.toString(arr));//[7, 10, 11, 7, 9, 5]

        System.out.println(C05_PozitifElementleriTopla.pozitifSayılarıTopla(arr));//49 son halini topluyor

        System.out.println(C06_ElemanArama.harfAdetSayısıHesapla(barare, "a"));
        System.out.println(C06_ElemanArama.harfAdetSayısıHesapla(barare, "k"));

       int [] olusturdum= C07_KullaniciyaArrayOlusturma.arrOlustur();
        System.out.println(Arrays.toString(olusturdum));

    }
}
