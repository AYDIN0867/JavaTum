package ders26_Arrays_Methodları;

import ders25_Arrays.C07_ElemanArama;

import java.util.Arrays;

public class C02_BinarySearch {
    public static void main(String[] args) {

String [] harfler={"d","t","p","k","z"};

// verilen arr de a harfinin olup olmadığını yazdırın


C07_ElemanArama.elemanArama(harfler,"t");

/*
 Arrays.binarySearch() bir arrayde aranan elementin
 hangi index'de olduğunu verir

 ANCAK bu methoddan önce sort() çalıştırılmalıdır.
 sort() çalıştırılmadan yapılan aramalardan sonuç bilinmez






 */

        System.out.println(Arrays.binarySearch(harfler,"d"));//0
       System.out.println(Arrays.binarySearch(harfler,"t"));//-5
        System.out.println(Arrays.binarySearch(harfler,"p"));//2
        System.out.println(Arrays.binarySearch(harfler,"k"));//-2
        System.out.println(Arrays.binarySearch(harfler,"z"));//4
        System.out.println(Arrays.binarySearch(harfler,"a"));// -1
        System.out.println(Arrays.binarySearch(harfler,"x"));//-5

// burada bazı sonuçların doğru bazı sonuçların eksili verilmesi yani yanlış verilmesi
// sort yapılmadan aranma yapıldığı için



Arrays.sort(harfler); //yeni sıralama [d, k, p, t, z]
        System.out.println(Arrays.toString(harfler));

        System.out.println(Arrays.binarySearch(harfler,"d"));//0
        System.out.println(Arrays.binarySearch(harfler,"t"));//3
        System.out.println(Arrays.binarySearch(harfler,"p"));//2
        System.out.println(Arrays.binarySearch(harfler,"k"));//1
        System.out.println(Arrays.binarySearch(harfler,"z"));//4
        System.out.println(Arrays.binarySearch(harfler,"a"));// -1
        System.out.println(Arrays.binarySearch(harfler,"x"));//-5
        // normlade array listted olmayanlar için olsa idi nerede olurdu mantığından yerlerini
        // söyler ama başlarına eksi loyar









    }
}
