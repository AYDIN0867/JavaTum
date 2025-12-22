package TEKRAR.Konu28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayListOlusturmaElemanEkleme {
    public static void main(String[] args) {

        //içine string elelemntler koyabileceğimiz bir arrayList olusturun

        String [] arr={"ali","veli"};//arr nin data turu Array,
        //string içindeki elementlerin data türüdür...

      //  List<String> isimler=new List<>();
        //'List' is abstract; cannot be instantiated
        List<String> isimler=new ArrayList<>();
        //list absrtact oldugundan obje oluşturulamaz...


      //3 türlü yazımı vardır

      List<String> elemanlar=new ArrayList<>();
      List<String> elemanlar1=new ArrayList<String>();
      ArrayList<String> elemanlar3=new ArrayList<>();

    //collections da aralarındaki farka değineceğiz...

        System.out.println(isimler);//[]


    //icine int elemenler koyabileceğimiz sayilar isminde bir ArrayList olusturun...

        List<Integer> sayilar=new ArrayList<>();
//elmasın içine konulacak elementlerin data türü primitive olmaz...

    //Listeye 3,6,8 ve 9 ekleyin....

sayilar.add(3);
sayilar.add(6);
sayilar.add(8);
sayilar.add(9);


        System.out.println(sayilar);//[3, 6, 8, 9]

        //listenin 3. indeksine eleman olrak 2 ekleyin

        sayilar.add(3,2);
        System.out.println(sayilar); //[3, 6, 8, 2, 9]


// element olarak 3,4,5,6,2,3,4,2,3,4,5,4,7,8,9 bulunduran bir ArrayList olusturun

  List<Integer> numaralar=new ArrayList<>(Arrays.asList(3,4,5,6,2,3,4,2,3,4,5,4,7,8,9));
        System.out.println(numaralar);//[3, 4, 5, 6, 2, 3, 4, 2, 3, 4, 5, 4, 7, 8, 9]


        /*

        eger list oluşturularken içine konulacak elementleri belli ise Arrays.aslist
        ile hepsi eklenir....

         */

List<Integer> ekList=new ArrayList<>(Arrays.asList(10,20,30));
        System.out.println(ekList);


        sayilar.addAll(ekList);
        System.out.println(sayilar);//[3, 6, 8, 2, 9, 10, 20, 30]
        sayilar.addAll(3, ekList);
        System.out.println(sayilar);//[3, 6, 8, 10, 20, 30, 2, 9, 10, 20, 30]
        //arraylerde arrayListte yapılan değişiklikler atamagibidir....


    }
}
