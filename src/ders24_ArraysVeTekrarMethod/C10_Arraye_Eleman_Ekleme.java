package ders24_ArraysVeTekrarMethod;

import java.util.Arrays;

public class C10_Arraye_Eleman_Ekleme {

    public static void main(String[] args) {


      //  Verilen bir integer array’e istenen bir elemani ekleyip bize yazdıranbir method yazin,
        //  eski array’e yeni degeri atayin.

      int [] arr={3,6,9};
      int eklencekSayi=1;
  arr=  arrayeElemaneekle(arr,eklencekSayi);
        System.out.println("arreyin yeni hali:"+Arrays.toString(arr));

        arr=  arrayeElemaneekle(arr,5);
        arr=  arrayeElemaneekle(arr,8);
        System.out.println("arreyin yeni hali:"+Arrays.toString(arr));


    }


public static int [] arrayeElemaneekle(int [] arr,int eklencekSayi){


    int []yeniArr=Arrays.copyOf(arr,arr.length+1);
    yeniArr[yeniArr.length-1]=eklencekSayi;

    arr=yeniArr;
    //önce uzunluğu eki arreyden bir fazla olandan yeni bir arrey oluşturuup eski arreydeki
    //elemanları yeniarraye kopyalarız
    //sonra ensonda klan elemana ekelenecek sayı değirini atayalım
    //eski arr in yeni arreye ataması yapılır



   return arr;



}


}
