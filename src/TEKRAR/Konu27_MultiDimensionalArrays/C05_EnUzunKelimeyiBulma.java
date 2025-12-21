package TEKRAR.Konu27_MultiDimensionalArrays;

public class C05_EnUzunKelimeyiBulma {
    public static void main(String[] args) {

        String [][] arr={{"Ali","okula","git"},{"Merhabalar","arkadaslar"},{"Bu","is","olacak"}};

        //iki katlı arraydeki en uzun kelimeyi yazdırın...

        // Tum elementleri gozden gecirecek miyiz EVET İSE,,,çift loop u yapıştuır...
String enUzunKelime="";

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {


                if (arr[i][j].length()>enUzunKelime.length()){

                    enUzunKelime=arr[i][j];

                }


            }


        }

        System.out.println("en uzun kelime :" + enUzunKelime);//en uzun kelime :Merhabalar


    }
}
