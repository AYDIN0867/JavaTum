package TEKRAR.Konu.Konu16_Empty_Length;

import java.util.Scanner;

public class C05_VerilenMetniTemizleme {
    public static void main(String[] args) {

        //kullanıcıdan bir metin isteyin
        // metinde bosluk ve harf olamayan herseyi silin
        // ornek : input :J1a4v*a )G*&^56uzel_!dir.
        // output : Java Guzeldir


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz...");

        String metin=scanner.nextLine();

        String metin1=metin.replaceAll("\\d","");
        //suan metin1 de rakam olmadıgını biliyoruz boşlukları korumak için boşlukların yerine bir şey yazıp sonra silelim
        metin1=metin1.replaceAll(" ","1");

        metin1=metin1.replaceAll("\\W", "");

        //_ çizgi iin özel yazmamız lazım

        metin1=metin1.replaceAll("_", "");

        metin1=metin1.replaceAll("1"," ");
        metin1+=".";
        System.out.println(metin1);


    }
}
