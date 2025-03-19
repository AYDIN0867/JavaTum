package ders25_Arrays;

import java.util.Arrays;

public class C01_ArrayOlusturmaVeYazdirma {

    public static void main(String[] args) {


       // 4 int değer koyabileceğimiz sayılar arrayi olusturun

       int [] sayılar=new int [4]; //[0,0,0,0]

        // 5 String değer koyabileceğimiz sayılar arrayi olusturun
      String[] isimler=new String[5];//[null,null,null,null,null]

      // 2 boolean deger koyabileceğimiz bir array oluşturun
        boolean [] sonuclar=new boolean[2];// [false,false]

      // içinde 56,67,23,97 degerlerinin olduğu notlar arreyi oluşturun

       int [] notlar={ 56,67,23,97} ;

       //içinde mevsim isimlerinin olduğu mevsimler arreyi oluşturun

        String [] mevsimler={"ilkbahar","yaz","sonbahar","kıs"};

        // notlar arreyindeki 23 ü yazdırın

        System.out.println(notlar[2]);//23
        System.out.println(mevsimler[3]);//kış
        System.out.println(isimler[1]);//null

        // notlar arreyindeki 2. sayiyi 45 yapın
        notlar[1]=45;

        //isimler arreyindeki ilk ismi muhmut yapın

        System.out.println(isimler[0] = "mahmut");
        System.out.println(Arrays.toString(isimler));//[mahmut, null, null, null, null]


    }
}
