package ders20_Method_Sorular;

public class C03_MetniTersttenYazdir {

    public static void main(String[] args) {

       //verilen metni terstten YAZDIRAN bir method oluşturun

        metniTerstenYazdir("java bu isi cözmüs");

    }

    public static void metniTerstenYazdir(String metin){


        for (int i = metin.length()-1; i >=0 ; i--) {
            System.out.print(metin.charAt(i));
        }

    }




}
