package ders30_StaticKeyword;

public class C04_PassByValue {

    /*

    bu konu programlama dilini oluşturuanların vereceği bir karardır
     ve java Pass by Value yi tercih etmiştir.

     Pass by value => bir methoddan başka bşr methoda bir variable yollanırken
      variablenin kendisini değil değerini(value) yollamaktır.böylece göderilen methodd yapılan değişiklikler
       asil variablede değişiklik yapmaz

     */


    public static void main(String[] args) {

        //gönderdiğimiz sayının karesini alıp yazdıran method oluşturun



        int sayi1 =6;
        karesiniyazdır(sayi1);



    }


    public static void karesiniyazdır(int sayi1){

        sayi1=sayi1*sayi1;

        System.out.println("sayının karesi:"+sayi1);

    }
}
