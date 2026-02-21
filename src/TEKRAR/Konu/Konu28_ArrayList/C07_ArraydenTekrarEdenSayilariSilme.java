package TEKRAR.Konu.Konu28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C07_ArraydenTekrarEdenSayilariSilme {
    public static void main(String[] args) {

    //Verilen bir array de tekrar eden sayi varsa
    //tekrar eden sailari silip,
    // array i her sayidan sadece 1 tane bulacak şekilde kaydedin
    // ornek input :{2,3,4,5,2,4,2,2,4,2,4,3,5,1}
    // output:{1,2,3,4,5}

    int [] arr= {2,3,4,5,2,4,2,2,4,2,4,3,5,1};

        List<Integer>tekrasizList=new ArrayList<>();

        int bulunmaAdedi=1;
        for (int i = 0; i < arr.length; i++) {

            if (!tekrasizList.contains(arr[i])){

              tekrasizList.add(arr[i]);

            }

        }

        System.out.println("tekrarsız Liste"+ tekrasizList); //tekrarsız Liste[2, 3, 4, 5, 1]
        Collections.sort(tekrasizList);

        System.out.println(Arrays.toString(arr));//[2, 3, 4, 5, 2, 4, 2, 2, 4, 2, 4, 3, 5, 1]

/*
Biz tekrarsız elementleri tekrarsızListeye koyduk ancak görev ARRAY i tekrarsız hale getirmek idi
Bu durumda array in uzunlgunu değişştirremeyeceğimiz için arr e yeni bir değer atamalıyız...
 */

       arr=new int[tekrasizList.size()];

        for (int i = 0; i < arr.length; i++) {

            arr[i]=tekrasizList.get(i);

        }


        System.out.println("array in tekrarsız hali "+ Arrays.toString(arr));//array in tekrarsız hali [1, 2, 3, 4, 5]



    }
}
