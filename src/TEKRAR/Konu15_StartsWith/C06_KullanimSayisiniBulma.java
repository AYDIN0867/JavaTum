package TEKRAR.Konu15_StartsWith;

import java.util.Scanner;

public class C06_KullanimSayisiniBulma {
    public static void main(String[] args) {

// kullanicidan bir cümle ve cümlede aratılacak bir metin isteyin
// girilen cumle ve metin e gore asagıdaki 3 sonuctan uygun olanı yazdırın
// 1- cumle aranan metni icermiyor
// 2- cumle aranan metni sadece 1 adet iceriyor
// 3- cumle aranan metni 1 den fazla içeriyor

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz...");
        String girilenMetin=scanner.nextLine();
        System.out.println("aranmasını istediğiniz kelimeyi giriniz");
        String aranacakKelime=scanner.nextLine();
        int aranacakKelimeİndeksi=girilenMetin.indexOf(aranacakKelime);

        if (aranacakKelimeİndeksi==-1){

            System.out.println("cumle aranan metni içermiyor");

        }

        if (aranacakKelimeİndeksi!=-1&&girilenMetin.indexOf(aranacakKelime)+1>girilenMetin.indexOf(aranacakKelime)){

            System.out.println("aranan metin birden fazla var ");

        }else if(aranacakKelimeİndeksi!=-1){

            System.out.println("aranan kelime bir tane var");

        }
//ali topu tut tut ali topu tut
    }
}
