package ders25_Arrays;

import java.util.Arrays;

public class C05_TumElementleriniArtırma {

    public static void main(String[] args) {


        //verilen bir int arrayin
        //tüm elementlerini 2 artırın

        int [] arr={3,7,0,2,4,6};


        System.out.println(Arrays.toString(arr)); //[5, 9, 2, 4, 6, 8]




    }
   // verilen bir int array'in
   // tüm elementleri verilen
    // sayi kadar artırıp bize döndüren bir method oluşturun
    //eski arrayi yeni haliyle kaydedin


public static int [] arrayinElemanlarınıArtır(int[]arr,int artırmaMiktarı) {


    for (int i = 0; i < arr.length; i++) {

        arr[i] += artırmaMiktarı;

    }
return arr;
}


}
