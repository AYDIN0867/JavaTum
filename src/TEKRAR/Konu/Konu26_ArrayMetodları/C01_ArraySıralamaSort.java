package TEKRAR.Konu.Konu26_ArrayMetodları;

import java.util.Arrays;

public class C01_ArraySıralamaSort {
    public static void main(String[] args) {


String [] isimler={"Metin","Hakan","metehan","Makail","Sedat","Kemal","Yakup"};

//array i natural order'a gore duzenleyip (dogal siralama) yazdırın

        System.out.println(Arrays.toString(isimler));//[Metin, Hakan, metehan, Makail, Sedat, Kemal, Yakup]
//java da sıralama ascı table gore yapılır kucuk harfler ascı table de sonra gelir...

/*

natural order sayılar icin kucukten buyuge , metinler icin ise sozluk sıralamasına göre yapar
java case sensetive oldugunu ve kucuk harflerin buyuk harflerden sonra geldigini unutmayınız...

 */

 String str="hayat güzeldir";
        System.out.println(str.toUpperCase());//HAYAT GUZELDİR
        System.out.println(str);//Hayat Güzeldir

/*
Ancak arraylerde yapılan değişiklik atama gibi değişiklik kalıcı olur....Stringde ki değişmeme olmamaı
string in immutable olmasından kaynaklıdır....
Array ve arraylist de metod ile yapılan degisiklikler KALICI olur...
 */






    }
}
