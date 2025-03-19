package ders28_ArrayListMethodları;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ListOlusturmaVeEleman_Ekleme {

    public static void main(String[] args) {

    //içine String elementler koyabileceğimiz bir ArrayList olusturun

    String [] arr={"ali","veli"}; // arr in data turu Arraydir

  // List <String> isimler= //list soyuut bir olduğundan obje oluşturulamaz

        List<String> isimler=new ArrayList<>();
        List<String> isimler1=new ArrayList<>();

        System.out.println(isimler);//[]


        //içine int elementleri koyabileceğimiz sayilar isminde bir ArrayList olusturun

       // List<int>sayilar=new ArrayList<>(); //Type argument cannot be of primitive type
        // int primitive olduğu için kabul edilmedi bizde Wrapper class olan Integer i kullanacağız

       List<Integer> sayilar=new ArrayList<>();

       //listeye 3,6,8 ve 9 u ekleyin

        sayilar.add(3);
        sayilar.add(6);
        sayilar.add(8);
        sayilar.add(9);

        System.out.print(sayilar);//[3, 6, 8, 9]
        System.out.println("");
//listenin 3 . indeksine element olarak 2  ekleyin yani dokuzun yerine ekelyeceğiz

        sayilar.add(3,2);//[3, 6, 8,2 ,9]
        System.out.print(sayilar);//[3, 6, 8, 2, 9]
        System.out.println("");
        sayilar.add(1,5);//[3,5,6, 8, 2, 9]
        System.out.print(sayilar);//[3, 5, 6, 8, 2, 9]


        // element olarak 3,4,5,6,2,3,4,2,3,4,5,4,7,8,9 bulunduran bir array list oluşturun

        List<Integer> yeniList=new ArrayList<>(Arrays.asList(3,4,5,6,2,3,4,2,3,4,5,4,7,8,9));
        System.out.println(yeniList);

/*
eğer  list oluşturulurken konulacak elementler belli ise
Arrays class'indan asList () ile direkt eklenebilri


 */

// içinde 10,20,30 elementelri bulunduran yeni bir liste oluşturun


        List<Integer> ikibasamalılar=new ArrayList<>(Arrays.asList( 10,20,30 ));

        // yukarıda oluşturduüumuz sayılar listesine yeni listenin tamamımını ekleyin

        sayilar.addAll(ikibasamalılar);

        System.out.println(sayilar); //[3, 5, 6, 8, 2, 9, 10, 20, 30]

        sayilar.addAll(2, ikibasamalılar);

        System.out.println(sayilar); //[3, 5, 10, 20, 30, 6, 8, 2, 9, 10, 20, 30] listenin arasına yazdırma


    }
}
