package TEKRAR.Konu.Konu35_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C06_List_BypassValue {
    public static void main(String[] args) {
        List<String>isimler=new ArrayList<>(Arrays.asList("Cansu","Dilan","Bahadır","Maya"));

      //verilen bir isim listesini parametre olarak alıp
      // kullanıcıdan bir isim alıp listeye ekleyen
      //ve listenin yeni halini yazdıran bir metod olusturun

birIsimEkle(isimler);//listeye bir isim ekledim [Cansu, Dilan, Bahadır, Maya, muteza]
        System.out.println("mainde liste "+ isimler);

//metodda listenin kendisine doğrudan atama var mı yok uani olmadıgı içim
//değişiklik kabuldur...








      // verilen isimler listesine yeni halini yazdıran bir metod olusturun..






    }
public static void birIsimEkle(List<String> isimler){
    Scanner scanner=new Scanner(System.in);
    System.out.println("lütfen bir isim giriniz...");
    String isim=scanner.nextLine();



    isimler.add(isim);

    System.out.println("listeye bir isim ekledim "+ isimler);



}



public static void  yeniListeOlustur(List<String> isimler){
        isimler=new ArrayList<>();

    Scanner scanner=new Scanner(System.in);
    System.out.println("lütfen bir isim giriniz...");
    String isim=scanner.nextLine();



    isimler.add(isim);
    System.out.println("yeni liste olusturum isim ekledim"+ isimler);




}


}
