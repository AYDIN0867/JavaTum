package TEKRAR.Konu35_PassByValue;

import java.util.Arrays;

public class C05_BirdenFazlaElemanBarindıranYapılar {
    public static void main(String[] args) {

     int [] arr={3,5,6};
     arr[1]=8;//elementlerden birine atama yapıyoruz 5 in yerine 8 koymak isitiyoruz
     System.out.println(Arrays.toString(arr)); //[3, 8, 6]
     int [] yeniArr={2,5,7};

        arr=yeniArr;

        System.out.println(Arrays.toString(yeniArr));
  //array'in elementlerini birer artırıp son halini yazdiran bir metod olusturun...

        birArtirYazdir(arr);// elemanları ertırdık...[3, 6, 8]
        System.out.println("main metodda arr"+Arrays.toString(arr));
//metodda araba değişti mi;yani arr nin kendisine atama oldumu?
//hayır sadece elementleri üzerinden  değişim yapıldı...
//main metodda arr[3, 6, 8]

        birArtirYazdir(arr);// elemanları ertırdık...[4, 7, 9]
        System.out.println("main metodda arr"+Arrays.toString(arr));//main metodda arr[4, 7, 9]


    }

    public static void birArtirYazdir(int [] arr){

        for (int i = 0; i < arr.length; i++) {

            arr[i]+=1;

        }

        System.out.println("elemanları ertırdık..." + Arrays.toString(arr));


    }




}
