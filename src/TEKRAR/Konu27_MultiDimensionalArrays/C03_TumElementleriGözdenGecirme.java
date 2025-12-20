package TEKRAR.Konu27_MultiDimensionalArrays;

import java.util.Arrays;

public class C03_TumElementleriGözdenGecirme {
    public static void main(String[] args) {

        int[][] arr = {{2, 3, 7}, {3, 5}, {4}, {1, 2, 3, 6, 43}};

        //arr deki cift sayiların toplamını yazdirin...

        int ciftSayıToplam = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] % 2 == 0) {

                    ciftSayıToplam += arr[i][j]; //arr deki çift sayıların toplamı :14
                }

            }

        }

        System.out.println("arr deki çift sayıların toplamı :" + ciftSayıToplam);


//arr deki tek sayılardan en buyuk olanı yazdırın....
// arr={{2,3,7},{3,5},{4},{1,2,3,6,8}};
        int enbuyuk = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] % 2 != 0 && arr[i][j] > enbuyuk) {

                    enbuyuk = arr[i][j];

                }

            }

        }

        System.out.println("arr deki buyuk deger " + enbuyuk + " sayısıdır... ");
//arr deki buyuk deger 43 sayısıdır... .


//arr deki tum sayıları 1 artırın....

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j]+=1;



            }
        }

        System.out.println("arr deki tüm sayıları bir artırınca..."+ Arrays.deepToString(arr));
//arr deki tüm sayıları bir artırınca...[[3, 4, 8], [4, 6], [5], [2, 3, 4, 7, 44]]



//arr deki tum tek sayilari ve çift sayilari ayri ayri toplayıp
// ciftSayilarToplami-tekSayilarToplamini yazdirin...
//.[[3, 4, 8], [4, 6], [5], [2, 3, 4, 7, 44]]
ciftSayıToplam=0;
int tekSayiToplam=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j]%2==0){

                    ciftSayıToplam+=arr[i][j];
                }else {

                    tekSayiToplam+=arr[i][j];
                }

            }


        }
        System.out.println("arr deki : "+ "çift sayılar toplamı - tek sayılar toplamı :" + (ciftSayıToplam-tekSayiToplam));
       //arr deki : çift sayılar toplamı - tek sayılar toplamı :54



    }

}