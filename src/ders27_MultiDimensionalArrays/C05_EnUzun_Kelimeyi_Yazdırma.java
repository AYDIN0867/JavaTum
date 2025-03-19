package ders27_MultiDimensionalArrays;

public class C05_EnUzun_Kelimeyi_Yazdırma {

    public static void main(String[] args) {

        String [] [] arr={{"ali","okula","git"},{"merhabalar","arkadaşlar"},{"bu","is","olacak"}};

        // iki katlı array'deki en uzun kelimeyi yazdırın

        // tum elementleri gozden gecirecek miyiz?EVET
         String enuzunKelime="";
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j].length()>enuzunKelime.length()){

                    enuzunKelime=arr[i][j];
                }

            }

        }

        System.out.println("arraydeki en uzun kelime :"+enuzunKelime);

    }
}
