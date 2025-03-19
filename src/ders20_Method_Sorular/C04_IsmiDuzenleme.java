package ders20_Method_Sorular;

import java.util.Scanner;

public class C04_IsmiDuzenleme {
    public static void main(String[] args) {



        isimDuzenlemeDondurme("ali","cabbar");// ne konsolde görürüm ne de sonra kullanırım
        System.out.println(isimDuzenlemeDondurme("ali", "cabbar"));// konsolde görürrüm ama sonra kullanamam


        String isim=isimDuzenlemeDondurme("veli","kibar");//konsolde görmem,ama katdettiğimiz için
        // bundan sonra hep ali olarak kullananabilirim


        System.out.println(isim);
        System.out.println(isim.length());
        System.out.println(isim.contains("veli"));//false

    }


   public static String isimDuzenlemeDondurme(String isim,String soyIsim){

String duzenlenMisIsim=   isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+" " +

        soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).toLowerCase();

       return duzenlenMisIsim;
   }





}
