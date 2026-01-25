package TEKRAR.Konu35_PassByValue;

import java.util.Arrays;
import java.util.List;
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

        isimDüzenleYazdir("pelin su yılmaz denir");

    }

    public static void buyukHarfCevir(String girilenCumle){
        girilenCumle=girilenCumle.toUpperCase();
        System.out.println(girilenCumle);

    }

    public static void isimDüzenleYazdir(String str){

        List<String>isimParcali= Arrays.asList(str.split(" "));
        String yeniIsim="";

        for (int i = 0; i < isimParcali.size(); i++) {

            yeniIsim+=isimParcali.get(i).substring(0,1).toUpperCase()+
                    isimParcali.get(i).substring(1).toLowerCase();

            if (i<isimParcali.size()-1){
                yeniIsim+=" ";
            }


        }

        System.out.println("ismin düzenlenmiş hali : "+ yeniIsim);


    }

}
