package TEKRAR.Konu.Konu29_ArrayListSoruCozumu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_VerilenArrayiListeCevirme {
    public static void main(String[] args) {

Integer [] arr ={3,5,6,7,8,9,2,3,5,3,4,6,2,7};

// arr array'ini bir list olarak kaydedin....

        List<Integer> arrList=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            arrList.add(arr[i]);

        }
        System.out.println(arrList);//[3, 5, 6, 7, 8, 9, 2, 3, 5, 3, 4, 6, 2, 7]
        arrList.add(10);
        arrList.add(20);
        arrList.remove(0);
        arrList.remove(0);
        System.out.println(arrList); //[6, 7, 8, 9, 2, 3, 5, 3, 4, 6, 2, 7, 10, 20]


//Array class ında bu isi yapan hazir asList () method u var
// for loopsuz yapmabiliriz ancak 2 adet olumsuz yan etkisi var
        List<Integer> yeniArrList= Arrays.asList(arr);

        System.out.println(yeniArrList); //[3, 5, 6, 7, 8, 9, 2, 3, 5, 3, 4, 6, 2, 7]


        //element eklemek istediğimşzde ki bu bir list eklenebiliri

        //yeniArrList.add(10);//calıştırdıgımızda eklmeye izin verilmez
        //yeniArrList.remove(0); //Aynı sekilde silmeye de izin verilmez kod calsıtırıldıgında...
        //ekleme ve cıkarma yaıpalamadıgına göre list olmasının da bir anlamı kalmadı....

        arr[0]=10;
        arr[1]=20;

        System.out.println("arr ye atama yaptıktan sonra yeniArrList "+yeniArrList);
//arr ye atama yaptıktan sonra yeniArrList [10, 20, 6, 7, 8, 9, 2, 3, 5, 3, 4, 6, 2, 7] arr ye atama yaptık ama yeniArrList de değişti...




    }
}
