package TEKRAR.Konu.Konu25_Arrays;

import java.util.Arrays;

public class C03_TumElementleriKullanma {
    public static void main(String[] args) {

        int [] sayilar={4,7,1,3,4,8,0,1};

        //sayilar array'ini yazdirin...

        System.out.println(Arrays.toString(sayilar)); //[4, 7, 1, 3, 4, 8, 0, 1]

        //sayilar array'inin tum elementlerini yan yana yazdirin...

        for (int i = 0; i < sayilar.length; i++) {

            System.out.print(sayilar[i]+" ");

        }

        /*

        EGER arrayin tüm elementlerine ulaşmak gerekiyorsa
        for loop kullnaırız...

        */


    // sayilar array'inin tum elementlerin toplamını yazdirin...

        int toplam=0;

        for (int i = 0; i < sayilar.length; i++) {

            toplam+=sayilar[i];

        }

        System.out.println("sayılar array indeki elementlerin toplamı :"+ toplam);


        //sayılara arry indeki çift sayıların carpımı

        int carpım=1;

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i]%2==0){

                carpım*=sayilar[i];

            }


        }

        System.out.println("sayılar arrayindeki çift sayıların carpımı :"+ carpım);

    }





}
