package ders26_Arrays_Methodları;

import java.util.Arrays;

public class C05_ArrayeYeniBir_Eleman_Ekleme {
    public static void main(String[] args) {

int [] sayilar={3,5,6,2,1};

// sayilar arrayine 8 ekleyin;

        sayilar=arrayeElemanEkle(sayilar,8);

        System.out.println(Arrays.toString(sayilar));

        sayilar=arrayeElemanEkle(sayilar,9);

        System.out.println(Arrays.toString(sayilar));

        sayilar=arrayeElemanEkle(sayilar,11);

        System.out.println(Arrays.toString(sayilar));









//verilen int bir arraye istenen bir elamanı ekleyip
        // son halini donduren bir method olusturun





    }

    public static int[] arrayeElemanEkle(int []arr,int eklenecekSayi ){
    // örnek arr={3,5,6,2,1}

        int [] yeniArr=new int [arr.length+1];//[0,0,0,0,0,0]

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i]=arr[i];

        }

yeniArr[yeniArr.length-1]=eklenecekSayi;

        arr=yeniArr;

        return arr;

    }
}
