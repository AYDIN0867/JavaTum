package ders13_String_manipulations;

public class C16_LastIndexOf {
    public static void main(String[] args) {


String str="ali topu tut, tut ali tut";

// cümlede "tut" un ilk kullanım index'i

        System.out.println(str.indexOf("tut"));

// cumlede "tut un ikinci kullanım index'i
        System.out.println(str.indexOf("tut", 10));

//   cumlede "tut un 3. kullanım index'i
        System.out.println(str.indexOf("tut", 15));

// cümlede "ali" nin ilk kullanım index'i

        System.out.println(str.indexOf("ali"));

// cümlede "ali" nin ikinci kullanım index'i

        System.out.println(str.indexOf("ali", 1));

        // cümlede "ali" nin 3. kullanım index'i

        System.out.println(str.indexOf("ali",19));//-1 değerini verdi ve burdan alinin
        // 3 . değerinin olmadığını anlıyoruz.

        // cümlede "tut" un son kullanım indexi nedir?

        System.out.println(str.lastIndexOf("tut"));//22, lastindexof kelimeyi
        // sondan bulur indeksi baştan sayar

        //cümlede ali nin son kullanım indexini bulalım

        System.out.println(str.lastIndexOf("ali"));

//cümlede "top"un son kullanım indeksi

        System.out.println(str.lastIndexOf("top"));//4
        System.out.println(str.indexOf("top"));// 4 bir tane olduğu
        // için aynı çıkıyor

   //     "ali topu tut, tut ali tut"
   //cümlede tut kelimesinin sondan ikinci kullanımının indeksini bulunuz

        System.out.println(str.lastIndexOf("tut",21)); //21 yazdık çünkü son indeksinin 22 olduğunu yukarıda bulduk
        //22 den bir önce 21 den başalatarak soryoruz //14






    }

}
