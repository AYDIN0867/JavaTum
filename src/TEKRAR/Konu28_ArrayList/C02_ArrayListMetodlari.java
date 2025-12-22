package TEKRAR.Konu28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C02_ArrayListMetodlari {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>(Arrays.asList(5,7,2,9,1,2,5,9,3));

        System.out.println(sayilar);//[5, 7, 2, 9, 1, 2, 5, 9, 3]

        //listede kac element oldugunu yazdırın

        System.out.println(sayilar.size());//9

        //listede element olarak 7 nin olup olmadıgını yazdırın

        System.out.println(sayilar.contains(7));//true

        //listede varsa 2 nin  ilk indeksini yazdırın

        System.out.println(sayilar.indexOf(2));//2

        //listede varsa 2 nin son kullanılma index ini yazdırın

        System.out.println(sayilar.lastIndexOf(2));//5 sondan bulur baştan sayar


        //[5, 7, 2, 9, 1, 2, 5, 9, 3]

        //listede varsa 11 in ilk index ini yazdırın...

        System.out.println(sayilar.indexOf(11));//-1 listede olmadıgı icin eksi 1 i verdi...
        System.out.println(sayilar.lastIndexOf(10));//-1 listede olmadıgı icin eksi 1 i verdi...

        //listede 2 icin asagıdaki cumlelerden uygun olanı yazdırın...
        //listede 2 yok
        //listede 2 sadece 1 tane var
        //listede 2 1 den fazla var...

        if (sayilar.indexOf(2)<0){

            System.out.println("listede 2 yok");

        } else if (sayilar.indexOf(2)==sayilar.lastIndexOf(2)) {

            System.out.println("listede 2 birtane var");

        }else System.out.println("listede 2 birden fazla var");


        //listedeki tum elementleri natural order a uygun olarak sıralayın...

        Collections.sort(sayilar);
        System.out.println(sayilar); //[1, 2, 2, 3, 5, 5, 7, 9, 9]

        //listedeki tüm elementleri silin

        sayilar.clear();
        System.out.println(sayilar);//[]


    }
}
