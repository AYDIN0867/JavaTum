package ders40_Varraks;

import java.sql.Array;

public class C02_VarragsKullanımı {

    public static void main(String[] args) {

        // argument olarak girilen sayilardan
        //ilki hariç geriye kalanlari toplayıp
        //bulunan toplam değer ile ilk sayının carpımını yazdıran
        //bir method oluşturun

        arrayToplaCarp(3,4,5,6,7);//3*(4+5+6+7)==>66
        arrayToplaCarp(2,2,3,4,5,7);//3*(2+3+4+5+7)==>42
        arrayToplaCarp(2,3);//6
        arrayToplaCarp(5);//0 yazdırır çünkü topla 0 atadık




    }

   public static void arrayToplaCarp(int ilksayi, int...geriyeKalanlar) {

       int toplam=0;
       for (int each
               :  geriyeKalanlar ) {

           toplam+=each;
       }
       System.out.println("işlem sonucu"+ilksayi*toplam);

    }



}
