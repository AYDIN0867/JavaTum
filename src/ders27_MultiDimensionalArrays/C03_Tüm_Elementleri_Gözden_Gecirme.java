package ders27_MultiDimensionalArrays;

import java.util.Arrays;

public class C03_Tüm_Elementleri_Gözden_Gecirme {

    public static void main(String[] args) {

        int [][] arr={{2,3,7,},{3,5},{4},{1,2,3,6,8}};

        // arr deki cift sayıların toplamını yazdırın

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j]%2==0){

                    toplam+=arr[i][j]; //[[3, 4, 8], [4, 6], [5], [2, 3, 4, 7, 9]]
                }

            }

        }

        System.out.println("çift sayiların toplamı "+ toplam);

        // arr'deki tek sayılardan en büyük olanı yazdırın
       int enBuyukSayi=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if ( arr[i][j]%2!=0 && arr[i][j]>enBuyukSayi){

                    enBuyukSayi= arr[i][j];


                }


            }

        }

        System.out.println("arraydeki en büyük tek sayı "+enBuyukSayi);

    // arr deki tum sayıları bir artırın

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j]+=1;

            }

        }

        System.out.println(Arrays.deepToString(arr));


// arr deki tum tek sayiları ve cift sayiları ayrı ayrı toplayıp
        // çiftSayilarToplamı-tekSayilarToplamını yazdırın

        int çiftSayilarınToplamı=0;
        int tekSayilarınToplamı=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j]%2==0){

                    çiftSayilarınToplamı+=arr[i][j];

                }else {

                    tekSayilarınToplamı+=arr[i][j];
                }



            }

        }

        System.out.println("arreydeki çift sayıların toplamı "+ çiftSayilarınToplamı);//28
        System.out.println("arreydeki tek sayıların toplamı "+ tekSayilarınToplamı);//27  System.out.println("arreydeki çift sayıların toplamı "+ çiftSayilarınToplamı);
        System.out.println("arreydeki çift sayıların toplamı ile tek sayılarının toplamı farkı "+(çiftSayilarınToplamı-tekSayilarınToplamı));//1



    }
}
