package ders24_ArraysVeTekrarMethod;

import java.util.Arrays;

public class C05_Arrayin_Tum_eleman_Yazdirma {

    public static void main(String[] args) {

        int [] arr={2,5,7,4,1,6,9};

        //arrayin tüm elemanlarını yazdırın..

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+" "); //2,5,7,4,1,6,9

        }

        System.out.println("");
    // arrayi yazdırn!!!!

        System.out.println(arr);
// non-primitive data tütündeki variableler doğrudan yazdırılayamayabilir
 // bir arrayi doğrudan yazdırmak istediğimizde arryi değil stack memory de tutulan referansı yazdırır
 // arryin referansını değil kendisini yazdrımak istersek
 //ARRAYS classinden hazır method kulanılır

        System.out.println(Arrays.toString(arr));//[2, 5, 7, 4, 1, 6, 9]
        String[] arrstr={"ali","veli","zeki"};
        System.out.println(Arrays.toString(arrstr));//[ali, veli, zeki] böyle yazdırır aama  lenght değişmez

// array primitive data türündekilerin kendilerini
        //non primitivlerin ise referanslarını tutarlar
    }
}
