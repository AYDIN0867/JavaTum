package TEKRAR.SorularStringManipulations;

import java.util.Scanner;

public class C04_IsimDüzenleme {
    public static void main(String[] args) {

        //Kullanıcıdan isim ve soyismini ayri ayri alın
        //- isim daha uzun ise,
        //- isim ve soyisim ilk harf buyuk, kalanlar kucuk seklinde yazdırın
        //soyisimdaha uzunsa
        //- ismi ilk harf buyuk diğerleri kucuk, soyisim tamamını buyuk harflerle yazidirin


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz....");
        String isim=scanner.nextLine();

        System.out.println("lütfen soyisminiz giriniz...");
        String soyIsim=scanner.nextLine();

        if (isim.length()>soyIsim.length()){

            System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()
            +" "+soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).toLowerCase()

            );


        }

        if (isim.length()<soyIsim.length()){

            System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()
                    +" "+soyIsim.toUpperCase()

            );


        }






    }
}
