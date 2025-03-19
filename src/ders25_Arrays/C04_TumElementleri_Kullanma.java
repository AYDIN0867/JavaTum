package ders25_Arrays;

import java.util.Arrays;

public class C04_TumElementleri_Kullanma {
    public static void main(String[] args) {

        int [] sayilar={4,7,1,3,4,8,2,1};

        // sayilar arrayini yazdırın;

        System.out.println(Arrays.toString(sayilar)); //[4, 7, 1, 3, 4, 8, 0, 1]

// sayilar arrayinin tüm elementlerini yan yana yazdırın

        for (int i = 0; i < sayilar.length; i++) {

            System.out.print(sayilar[i]+" "); //4 7 1 3 4 8 0 1

        }
        System.out.println("");

     // sayilar array'indeki tum elementlerin toplamını yazdırın
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {
           toplam+=sayilar[i];


        }

        System.out.println("sayılar arreindeki elementlerin toplamı :"+toplam);

// sayılar arrayindeki çift sayıların çarpımı

        int çarpım=1;
        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i]%2==0){

                çarpım*=sayilar[i];
            }

        }

        System.out.println("sayılar arreyindeki elementlerin çarpımı :"+çarpım);



    }
}
