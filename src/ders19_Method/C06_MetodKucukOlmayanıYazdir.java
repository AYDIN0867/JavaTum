package ders19_Method;

public class C06_MetodKucukOlmayanıYazdir {
    public static void main(String[] args) {



        //verilen iki tamsayidan kucuk olmayanı yazdıran bir metod olusturun

        kucukOlmayaniYazdir(4,78);
        kucukOlmayaniYazdir(23,23);//23


    }


    public static void kucukOlmayaniYazdir(int sayi1,int sayi2){

        System.out.println(sayi1<sayi2 ? sayi2 : sayi1);



    }


}

