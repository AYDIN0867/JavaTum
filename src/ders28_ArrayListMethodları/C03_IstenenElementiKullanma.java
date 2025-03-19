package ders28_ArrayListMethodları;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_IstenenElementiKullanma {

    public static void main(String[] args) {

        int [] arr={3,5,6,8,1};

        // arr deki tum elementleri toplayın

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            toplam+=arr[i];

        }

        System.out.println("arreydeki tüm eleenlerin toplamı " +toplam);//23

        List<Integer> sayilar=new ArrayList<>(Arrays.asList(3,6,8,1,4,0));

        // sayilar listesinin 2. indeksindeki sayiyı yazdırın

        System.out.println(sayilar.get(2));//8
        System.out.println(sayilar.get(0));//3
        System.out.println(sayilar.get(5));//0
        //System.out.println(sayilar.get(10));//IndexOutOfBoundsException

        // sayilar listesindeki tum elementleri toplayın

        toplam=0;

        for (int i = 0; i < sayilar.size(); i++) {

            toplam+=sayilar.get(i);

        }

        System.out.println(" sayılar listesindeki sayıların toplamı : "+ toplam);//22

        System.out.println(sayilar); //[3, 6, 8, 1, 4, 0]

        // 2. indeksindeki elementi 5 yapın  istenen bu =[3, 6, 5, 1, 4, 0] 8 gidecek 5 gelecek

        sayilar.set(2,5);
        System.out.println(sayilar);//[3, 6, 5, 1, 4, 0] 8 gitti 5 geldi

        // 4.indeksteki elementi yazdırn

        System.out.println(sayilar.get(4));// 4 indeksteki 4 tür

        // sayilar listesindeki 4 indeksi 11 yapın denildiğinde set kullanılır

        sayilar.set(4, 11);
        System.out.println(sayilar);//[3, 6, 5, 1, 11, 0]

        // 4. indekse 23 ekleyin kaykılma yapılacak

        sayilar.add(4,23);
        System.out.println(sayilar); //[3, 6, 5, 1, 23, 11, 0]




    }
}
