package ders20_Method_Sorular;

public class C02_KucukOlmayanıYazdır {

    public static void main(String[] args) {

      //verilen iki tam sayıdan kucuk olmayanı yazdıran bir method oluşturun

     kucukOlmayanıYazdır(4,78);
     kucukOlmayanıYazdır(-34,43);

    }

    public static void kucukOlmayanıYazdır(int sayi1,int sayi2){


        System.out.println(sayi1<sayi2?sayi2:sayi1);
    }


}
