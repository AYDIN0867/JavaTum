package TEKRAR.Konu26_ArrayMetodları;

import TEKRAR.Konu25_Arrays.C08_EnUzunVeEnKisaKelime;

import java.util.Arrays;

public class C03_ArraySplit {
    public static void main(String[] args) {

        String str="Ali topu at, at Ali at";

        String [] arrVirgul=str.split(",");
        System.out.println(Arrays.toString(arrVirgul));//[Ali topu at,  at Ali at]

        String [] arrSpace=str.split(" ");
        System.out.println(Arrays.toString(arrSpace));//[Ali, topu, at,, at, Ali, at]

String cümle="birinin evine girerken kör, çıkarken de dilsiz ol...";
//cümledeki en kısa ve en uzun kelimeyi yazdırın...

String [] kelimeler=cümle.split(" ");
        System.out.println(Arrays.toString(kelimeler)); //[birinin, evine, girerken, kör,, çıkarken, de, dilsiz, ol...]

        C08_EnUzunVeEnKisaKelime.enUzunEnKısaYazdır(kelimeler); //En kısa isim: de, En uzun isim: girerken







    }
}
