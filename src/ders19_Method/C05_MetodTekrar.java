package ders19_Method;

public class C05_MetodTekrar {

    public static void main(String[] args) {

//verilen bir tamsayının,
//asal sayi olup olmadıgını kontrol edip, sonucu yazdıran bir metod olusturun...

        asalMiyazdir(30);//Asal degil

    }

public static void asalMiyazdir(int sayi){

    for (int i = 2; i <sayi ; i++) {

        if(sayi%i==0){

            System.out.println("Verilen "+sayi+" sayisi asal değil");
            break;

        }

        if(i==sayi-1){

            System.out.println("Verilen "+sayi+" sayisi asal");

        }

    }



}



}
