package ders55_collections.Set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C02_TekrarlariSilme {

    public static void main(String[] args) {

        //verilen bir arrayde tekrar eden elelemntleri silip
        //array i her elementin sadece 1 tane olduğu hale donusturen
        //ve bize doduren bir method olusturun

        int [] sayilar={2,4,5,4,3,5,6,7,3,2,4,5,8,2,3,4,5,1,2,3};

       sayilar= arrayiTekrarsizYap(sayilar);
        System.out.println(Arrays.toString(sayilar));//[1, 2, 3, 4, 5, 6, 7, 8]


        int [] arr={3,3,3,3,3,5,5,5,5,7,7,7,3,5,777};

        arr=arrayiTekrarsizYap(arr);
        System.out.println(Arrays.toString(arr));//[3, 5, 7, 777]
    }

    //verilen bir arrayde tekrar eden elelemntleri silip
    //array i her elementin sadece 1 tane olduğu hale donusturen
    //ve bize doduren bir method olusturun

    public static int [] arrayiTekrarsizYap(int [] arr){

        Set<Integer> tekrarSizSet=new TreeSet<>();
        for ( int each
                : arr  ) {

            tekrarSizSet.add(each);
        }

        //System.out.println("tekrasizSet in son hali  : "+tekrarSizSet); //tekrasizSet in son hali  : [1, 2, 3, 4, 5, 6, 7, 8]
        //System.out.println("sayiar arreyinin  in son hali  : "+ Arrays.toString(arr));//sayiar arreyinin  in son hali  :
        // [2, 4, 5, 4, 3, 5, 6, 7, 3, 2, 4, 5, 8, 2, 3, 4, 5, 1, 2, 3]

//bizden istenen elementleri bir set olarak elde ettik bize görevde sayilar arreyini bu hale getirmemiz isteniyor
        //o zaman arrayi tekrarsiz settedi elemanlardan oluşan hale dönüştürüelim


        arr=new int[tekrarSizSet.size()];//[0,0,0,0,0,0,0,0]
        int index=0;
        for ( int each
                :  tekrarSizSet ) {
            arr[index]=each;
            index++;

        }

      //  System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 6, 7, 8]


return arr;

    }


}
