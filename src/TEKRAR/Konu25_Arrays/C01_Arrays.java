package TEKRAR.Konu25_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

//Arrayler(diziler) java da ayni data turunden birden faza eleman barındırabilen
        //objelerdir...
//Kural1- bir array oluşturuken 2 sey deklare edilmek zorundadır...
//A- içine konulacak elementelrin data turu...bir array in içinde farklı data turunde element olamaz

int [] arr =new int[5];


//B-içine kac element konulacağı(length)
        //oluşturulan bir array in uzunlugu sabittir...degistirilmez...

//bir array 2 sekilde deklare edilşr

//A- int arr [] ;
//B- int []  arr ;

//3- bir array e 2 sekilde deger atanabilir;

        //A- direk deger atanabilir int [] arr ={1,3,5,6,7,9}
        //A- direk deger atanabilir int [] arr ={1,3,5,6,7,9}

 //b- uzunlugu belirtilerek olusturulur ama elemanlara deger ataması yapılmaz...
 //bu durumda java belirtilen uzunlukta ve defaul degerlee sahip bir array oluşturur
 // int [] arr =new int [5];  [0,0,0,0,0]
//bir array in length nasil bulunur...
        int [] arrayy ={1,2,3,4,5};

        System.out.println(arrayy.length);//5

  //4 int deger koyabileceğimiz sayılar array i oluşturun...

        int [] sayilar=new int[4];
        System.out.println(arrayy);//[I@e9e54c2

 // 5 isim koyabileceğimiz bir array oluşturun

     String [] isimler=new String[5];

// 2 boolean deger koyabileceğimiz bir array oluşturun

boolean [] sonuclar=new boolean[2];//[false,false]

//icinde 56,67,23,97 degerleinin oldugu notlar array i oluşturun

int [] notlar={56,67,23,97};

//icinde mevsim isimlerinin oldugu mevsimler array i oluşturun

   String [] mevsimler={"ilkbahar","Yaz","Sonbahar","Kıs"};

//notlar array in deki 23 ^ü yazzdırın

        System.out.println(notlar[2]);//23

//mevsimler arrayindeki kıs i yazırın

        System.out.println(mevsimler[3]);//kıs


   //notlar array indeki 2. sayıyı 45 yapın

   notlar[1]=45;

   //ilkbahar,yaz,sonbahar,kıs
   // mevsimler array'inin 5.elementini yazdırın....
       // System.out.println(mevsimler[4]);//sınırları bilmez 4 . indeksi var mı yok mu bilmez...
        //çalıştırınca hata verir.>ArrayoutOfBoundIndex hatası verir
      //mevsimler array ine 5.mevsim olarak birmevsim yazdığımızdada hata verir

     // mevsimler[4]="Tatil";//yazdık burda hata vermedi ama çalıştırdığımızda   >ArrayoutOfBoundIndex hatası verir

        //isimler array i ni yazdıralım...
        System.out.println(Arrays.toString(isimler)); //[null, null, null, null, null]

        System.out.println(Arrays.toString(notlar));//[56, 45, 23, 97] virgül ve boşluk elementlere değil array e aittir..









    }

}
