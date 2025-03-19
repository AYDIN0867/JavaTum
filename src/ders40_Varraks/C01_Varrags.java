package ders40_Varraks;

import java.util.Arrays;

public class C01_Varrags {


    public static void main(String[] args) {




        topla(3,5);//8
        topla(3,4,5);//12
        topla(3,4,5,6);//18
        topla(2,5,7,8,11,15);//48


/*

varrags variety of arguments java farklı sayıda parametre yazmak yerine

array alt yapısını kullanana varrags oluşturmuştur
 */
    }

    public static void topla(int...sayilar) {
    int toplam=0;
        for (int each
                 :  sayilar ) {

            toplam+=each;
           }


        System.out.println(sayilar.length+" adet sayinin toplami :" +toplam);

    }

    public static void topla(int a,int b){

        System.out.println("iki tamsayının toplamı "+(a+b));
    }

    public static void topla(int a,int b,int c){

        System.out.println("üç tamsayının toplamı "+(a+b+c));
    }



}
