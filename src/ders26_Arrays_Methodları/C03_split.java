package ders26_Arrays_Methodları;

import ders25_Arrays.C09_EnUzunveEnKısaKelime;

import java.util.Arrays;

public class C03_split {

    public static void main(String[] args) {

        //cümledeki en kısa ve en uzun kelimeyi yazdırın
String str="java gün gectikçe daha da güzelleşiyor";
str="bu özellik çok güzelmiş";
String [] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        C09_EnUzunveEnKısaKelime.enkısaEnuzunKelimeYazdir(kelimeler);

    }
}
