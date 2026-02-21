package TEKRAR.Konu.Konu26_ArrayMetodları;

import TEKRAR.Konu.Konu25_Arrays.C06_ElemanArama;

import java.util.Arrays;

public class C02_BinarySearch {
    public static void main(String[] args) {

  /*
  Arraylerde istenen elementi varlıgı binary search ile aranır fakat
  öncesinde mutlaka sort yapılmalıdır....
   */

 String [] harfler ={"d","t","p","k","z"};

//verilen arr de a harfinin olup olmadıgını yazdırın..

        System.out.println(C06_ElemanArama.harfAdetSayısıHesapla(harfler, "a")); //istenen harf arrayde yok...
        System.out.println(C06_ElemanArama.harfAdetSayısıHesapla(harfler, "t")); //1

//javanın oluşturdugu binarySearch bize indeksini verir

        System.out.println(Arrays.binarySearch(harfler,"d"));//0
        System.out.println(Arrays.binarySearch(harfler,"t"));//-5
        System.out.println(Arrays.binarySearch(harfler,"p"));//2
        System.out.println(Arrays.binarySearch(harfler,"k"));//-2
        System.out.println(Arrays.binarySearch(harfler,"z"));//4
        System.out.println(Arrays.binarySearch(harfler,"a"));//-1
        System.out.println(Arrays.binarySearch(harfler,"x"));//-5

      //eger sort metodu yapmadan binarysearch yapılınca bazen bilir bazen hatalı sonuc verir

Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler)); //[d, k, p, t, z]


    }
}
