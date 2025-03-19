package ders37_PasByValue;

import java.util.Arrays;
import java.util.Random;

public class C05_BirdenFazlaElemanbarindıranYapılar {

    public static void main(String[] args) {

        int [] arr={3,5,6};

        arr [1]=8;// elementlerden birine atama var

        System.out.println(Arrays.toString(arr));//[3, 8, 6]

        int [] yeniArr={2,5,7};

        arr=yeniArr;// arr nin kendisine atama var

        System.out.println(Arrays.toString(arr));//[2, 5, 7]

        // array'in elementlerini birer artırıp son halini yazdiran bir method olusturun


        elementleriBirArtir(arr); //[3, 6, 8]
        System.out.println("main methodda arr: "+Arrays.toString(arr)); //[3, 6, 8]

       elementleriBirArtir(arr); // methodda elemanları artırdım: //[4, 7, 9]

        System.out.println("main methodda arr :"+Arrays.toString(arr)); //[4, 7, 9]

        // arraye 5 uzunluğunda ve içinde 100 den kucuk rastgele pozitif sayilar bulunan
        // yeni bir array atayıp arrayi yazdiran method oluşturun

        rastgeleSayiAta(yeniArr); //yeni array atadım : [35, 68, 40, 89, 32]

        System.out.println("main methodda arr :"+Arrays.toString(arr)); //[4, 7, 9]

    }

    public static void rastgeleSayiAta(int [] arr) {

        int [] yeniArr=new int [5];

        Random random=new Random();

        for (int i = 0; i < yeniArr.length ; i++) {

            yeniArr[i]= random.nextInt(100);

        }

        arr=yeniArr;

        System.out.println("yeni array atadım : "+Arrays.toString(yeniArr));

    }

    private static void elementleriBirArtir(int[]arr) {

        for (int i = 0; i < arr.length; i++) {

            arr[i]+=1;

        }

        System.out.println("elemanları arttırdım"+Arrays.toString(arr)); //


    }
}
