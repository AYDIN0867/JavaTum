package TEKRAR.Konu.Konu25_Arrays;

import java.util.Arrays;

public class C04_TumElementleriArtirma {
    public static void main(String[] args) {

        //verilen bir int array in tum elemanlarını 2 artırın...

        int [] arr={3,7,0,2,4,6};

        for (int i = 0; i < arr.length; i++) {

            arr[i]+=2;


        }

        System.out.println(Arrays.toString(arr)); //[5, 9, 2, 4, 6, 8]



    }

    public static int [] arrayinElemanlarınıArtır(int [] arr,int artısMiktari){



        for (int i = 0; i < arr.length; i++) {

            arr[i]+=artısMiktari;


        }

        return arr;
    }




}
