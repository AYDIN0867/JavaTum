package TEKRAR.Konu.Konu26_ArrayMetodları;

import java.util.Arrays;

public class C05_ArrayeDegerEklemeMetod {
    public static void main(String[] args) {

int [] sayilar={3,5,6,2,1};
//satilar array ine  8 ekle

       sayilar= arrayEkle(sayilar,8);
        System.out.println(Arrays.toString(sayilar));//[3, 5, 6, 2, 1, 8]


        sayilar= arrayEkle(sayilar,9);
        System.out.println(Arrays.toString(sayilar));//[3, 5, 6, 2, 1, 8, 9]

    }

    //Verilen int bir array'e istenen bir elemani ekleyip
    // son halini donduren bir metod olusturun...

    public static int [] arrayEkle(int [] arr,int ekleencekSayı){

        int [] sayilar={3,5,6,2,1};
        int [] arrNeww=new int[arr.length+1]; //[0, 0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length; i++) {

            arrNeww[i]=arr[i]; //[3, 5, 6, 2, 1, 0];

        }
     arrNeww[arrNeww.length-1]=ekleencekSayı;


     return arrNeww;
    }





}
