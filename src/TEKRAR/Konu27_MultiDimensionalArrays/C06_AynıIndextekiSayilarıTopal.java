package TEKRAR.Konu27_MultiDimensionalArrays;

import java.util.Arrays;

public class C06_AynıIndextekiSayilarıTopal {

    public static void main(String[] args) {

        //verilen 2 katlı ve 2 inner array e sahip bir int array de
        //aynı index e sahip elementleri toplayıp
        // yeni oluşturacağımızı tek katlı bir array e bu toplamları atayın....

        //input  int [][] arr={{3,4,5},{2,3,6,7}}
        //out put [5,7,11]

        int [][] arr={{3,4,5},{2,3,6,7}};
        int ortakIndexi=arr[0].length<arr[1].length?arr[0].length:arr[1].length;

        int [] ortakIndexdekiSayilarinToplamıArrayi=new int[ortakIndexi];

        for (int i = 0; i < ortakIndexdekiSayilarinToplamıArrayi.length; i++) {

            ortakIndexdekiSayilarinToplamıArrayi[i]=arr[0][i]+arr[1][i];

        }


        System.out.println(Arrays.toString(ortakIndexdekiSayilarinToplamıArrayi)); //[5, 7, 11]



    }
}
