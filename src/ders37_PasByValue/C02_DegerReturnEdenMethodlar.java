package ders37_PasByValue;

import java.util.Scanner;

public class C02_DegerReturnEdenMethodlar {

    public static void main(String[] args) {

        // verilen isim ve soy isim kac kelime olursa olsun duzenleyip
        // ilk harfleri buyuk, geriye kalan harfler kucuk olacak şekilde
        // "Isim Soyisim" halinde bize donduren bir method olusturun


        // kullanıcidan isim ve soyisim alip
        // method da duzenleyip yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen isminizi yazınız....");
        String isim=scanner.nextLine();
        System.out.println("lütfen soyisminizi yazınız...");
        String soyIsim=scanner.nextLine();

        System.out.println(isimDuzenle(isim, soyIsim)); //Mehmet Karnaval Tujtag


    }

    public static String isimDuzenle(String isim,String soyIsim) {

        isim=isim+" "+soyIsim;

        String [] isimler=isim.split(" ");
        String yeniIsim="";

        for (int i = 0; i < isimler.length; i++) {

            yeniIsim+=isimler[i].substring(0,1).toUpperCase()+isimler[i].substring(1).toLowerCase();

            if (i<isimler.length-1){

                yeniIsim+=" ";
            }

        }
            return yeniIsim;
    }
}
