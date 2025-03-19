package ders28_ArrayListMethodları;

import java.util.*;

public class C02_ListMethodlari {
    public static void main(String[] args) {


        List<Integer> sayilar=new ArrayList<>(Arrays.asList(5,7,2,9,1,2,5,9,3));
        System.out.println(sayilar);

        // listede kac element olduğunu yazdırın

        System.out.println(sayilar.size());

        // listede 7'nin var olup olmadığını yazdırın

        System.out.println(sayilar.contains(7));//true
        System.out.println(sayilar.contains(11));//false



        // listede varsa 2 nin ilk indeksini yazdırn

        System.out.println(sayilar.indexOf(2));//2

        // listede  2 nin son indeksini yazdırın

        System.out.println(sayilar.lastIndexOf(2));//5 sondan arar ama bastan indeksini verir

        // listede varsa 11 in ilk indeksini yazdırn

        System.out.println(sayilar.indexOf(11));//-1 olmadığı için eksi1 yazdırın


        // listede 2 için aşağıdaki cumlelerden uygun olanı yazdırın
        // listede 2 yok
        // listede 2 sadece bir tane var
        // listede 2 1 den fazla var


        if (sayilar.indexOf(2)==-1){

            System.out.println("listede 2 yok");
        } else if (sayilar.indexOf(2)==sayilar.lastIndexOf(2)) {

            System.out.println("listede 2 bir tane var");

        }else{

            System.out.println("listede 2 birden fazla var");
        }

        // listedeki tüm elemenleri naturel order yap

        Collections.sort(sayilar);

        System.out.println(sayilar);//[1, 2, 2, 3, 5, 5, 7, 9, 9]

        // listedeki tüm elemanları silin

        sayilar.clear();
        System.out.println(sayilar); // tertemiz yapar boş verir..[]



    }
}
