package ders15_String_Manipulations;

import java.util.Scanner;

public class C04_ReplaceFirst {
    public static void main(String[] args) {

        String str=" Java ile yazilim dünyasına giris yap";

        //sadece ilk "a" harfini    "A" ile değiştirip yazdırın

      //  System.out.println(str.replaceFirst("a", "A"));
        // sadece ilk 'e' harfini 'E' olarak değiştirip yazdırın

       // System.out.println(str.replaceFirst("e", "E"));



        str="Java 1-3 ayda ogrenilir";
        // str 'daki 1 rakamını 2 olarak degisitirip yazdırın


        System.out.println(str.replace("1", "2"));

        //kullanıcıdan bir cümle isteyin
        //eger cümle içinde rakam varsa,ilk rakam yerine x yazın


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle=scanner.nextLine();

        System.out.println(cumle.replaceFirst("\\d","X"));
        System.out.println(str.replaceFirst("\\d","0"));
       // System.out.println(cumle.replaceFirst("\\d", "0"));



/*

buralarda regex kullanılır

\\d Bir rakam (0-9)
\\ D rakam olamayan karakter
\\ w bir kelime karakteri
\\ W kelime karakteri olmayan bir karakter
\\ s beyaz boşluk karakteri (bosluk,tab,yeni satır vb..)
\\ S beyaz bosluk olmayan karakter
// s+ birden fazla white space karakteri için











 */





    }
}
