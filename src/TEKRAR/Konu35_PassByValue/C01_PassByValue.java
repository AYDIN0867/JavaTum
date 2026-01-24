package TEKRAR.Konu35_PassByValue;

import java.util.Scanner;

public class C01_PassByValue {
    public static void main(String[] args) {

       String str="Hayır gör hayır olsun..";

        System.out.println(str.toUpperCase());//HAYIR GÖR HAYIR OLSUN..

        System.out.println(str);//Hayır gör hayır olsun..


        // verilen isim kac kelime olursa olsun
        // tum isimleri ilk harf buyuk, sonraki harfleri buyuk olrak
        // duzenleyip  yazdıran bir metod olusturun

        buyukHarfCevir("merhaba");

//        Scanner scanner=new Scanner(System.in);
//        String  girilenCumle=scanner.nextLine();

    }

    public static void buyukHarfCevir(String girilenCumle){


       girilenCumle=girilenCumle.substring(0,1).toUpperCase()+girilenCumle.substring(1).toLowerCase();
       girilenCumle=girilenCumle;

        System.out.println(girilenCumle);

    }


}
