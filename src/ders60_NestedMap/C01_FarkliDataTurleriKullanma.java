package ders60_NestedMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_FarkliDataTurleriKullanma {
    public static void main(String[] args) {

        List<Integer>   sayilar=new ArrayList<>();

//        sayilar.add(12);
//       sayilar.add("Ali");
//       sayilar.add('k');
//
//        Integer[]arr={4,5,6,7};
//
//        sayilar.add(arr);


       List<Object> herseyList=new ArrayList<>();

        herseyList.add(12);
        herseyList.add("Ali");
        herseyList.add('k');

        Integer[]arr={4,5,6,7};

        herseyList.add(arr);


        List<String> isimler=new ArrayList<>(Arrays.asList("Hilal","Gulay","Senol","Aysegul"));

        herseyList.add(isimler);

        /*
        sayilar listesi deklare edilirken Integer lardan olusacagi icin Integer olmayan datayı ekleyemeyiz
         */

        System.out.println(herseyList);
//[12, Ali, k, [Ljava.lang.Integer;@5f184fc6, [Hilal, Gulay, Senol, Aysegul]]


        // =. indeksteki sayıyının 2 katını yazdırın

        //System.out.println(herseyList.get(0)*2);//Operator '*' cannot be applied to 'java. lang. Object', 'int'
        System.out.println((Integer) herseyList.get(0)*2);

        //System.out.println((Integer) herseyList.get(1)*2);//ClassCastException

//1. indeksteki Stringin length ini yazdırın

        System.out.println(((String) herseyList.get(1)).length());//3

        //3. indeksteki array i yazdırın

        System.out.println(Arrays.toString((Integer[])herseyList.get(3))); //[4, 5, 6, 7]

        // //3. indeksteki arrayin length ini yazdırın

        System.out.println(((Integer[]) herseyList.get(3)).length);//4

    }
}
