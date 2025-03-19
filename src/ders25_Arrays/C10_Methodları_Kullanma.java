package ders25_Arrays;

import java.util.Arrays;

public class C10_Methodları_Kullanma {

    public static void main(String[] args) {


        int [] arr={3,6,7,3,5,1};

       arr= C05_TumElementleriniArtırma.arrayinElemanlarınıArtır(arr,4);
        System.out.println(Arrays.toString(arr)); //[7, 10, 11, 7, 9, 5]
        System.out.println(C06_Pozitif_Elementlerin_Toplami.pozitifSayilariTopla(arr));//49

      int [] kullanıcıArr=  C08_KullanıcıyaArrayOluşturtma.integerArrayOlustur();
        System.out.println(Arrays.toString(kullanıcıArr));



    }
}
