package ders15_String_Manipulations;

import java.util.Scanner;

public class C06_Soru {
    public static void main(String[] args) {

    // kullanicidan bir metin isteyin
    // metindeki bosluk ve harf olamayan herseyi silin
    // ornek:input: J1a4v*a )G&^56uzel_!dir.
    //output: Java Guzeldir

    Scanner scanner=new Scanner(System.in);
        System.out.println("lütefn metmi giriniz");
        String metin=scanner.nextLine();

       // ilk önce rakamlardan kurtulalım

        metin=metin.replaceAll("\\d","");

//şimdi space i korumaya almalıyız

        metin=metin.replaceAll(" ","1");

        //w olayanlardan kurtulalım

        metin=metin.replaceAll("\\W","");


      metin=  metin.replaceAll("_","");

      metin=metin.replaceAll("1"," ");

  //d Bir rakam (0-9)
// D rakam olamayan karakter
// w bir kelime karakteri
// W kelime karakteri olmayan bir karakter
// s beyaz boşluk karakteri (bosluk,tab,yeni satır vb..)
// S beyaz bosluk olmayan karakter
// s+ birden fazla white space karakteri için


        System.out.println(metin);






    }
}
