package ders12_String_Manipulations;

import java.util.Scanner;

public class C14_IsimDuzenleme {

    public static void main(String[] args) {

        // verilen ismi soyismi alıp
        // Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak şekilde duzenleyip
        // isism bosluk soyisim seklinde bize DONDUREN bir method olusturun
        // input:Ali soyIsim=YILMAZ. method return:Ali Yilmaz

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz  :");
        String isim=scanner.nextLine();
        System.out.print("lütfen soyadınızı giriniz :");
        String soyIsim=scanner.nextLine();


        System.out.println(

                isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+" " +

                soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).toLowerCase()

        );



    }
}
