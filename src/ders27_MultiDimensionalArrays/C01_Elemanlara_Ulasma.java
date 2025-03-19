package ders27_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_Elemanlara_Ulasma {

    public static void main(String[] args) {


        /*
        Arraylerde herhangi bir yazdırma işlemi yapacağımız zaman
        ne yazdırabileceğimizi iyi bilmeliyiz

        * eger





         */

       int [][] arr={{2,3,7,},{3,5},{4},{1,2,3,6,8}};

        System.out.println(arr[0][2]);//7
        System.out.println(arr[3][3]);//6
        System.out.println(arr[1][0]);//3

        // iki katlı bir arreyde inner array yazdırmak istersek ,

        System.out.println(arr[0]); //[I@5f184fc6 bize referansını veriyor

        System.out.println(Arrays.toString(arr[0]));//[2, 3, 7]
        System.out.println(Arrays.toString(arr[2]));//4


 // arr[3][1] ini yazdır
        //önce bunun integer mi array mi olduğunu anlamamzı gerekir

        System.out.println(arr[3][1]);//2

        //arr[1] yazdır denildiğinde

        System.out.println(Arrays.toString(arr[1]));

      //{{2,3,7,},{3,5},{4},{1,2,3,6,8}}

        System.out.println(Arrays.deepToString(arr)); //[[2, 3, 7], [3, 5], [4], [1, 2, 3, 6, 8]]


    }
}
