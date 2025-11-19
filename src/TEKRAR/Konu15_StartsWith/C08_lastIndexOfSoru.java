package TEKRAR.Konu15_StartsWith;

import java.util.Scanner;

public class C08_lastIndexOfSoru {
    public static void main(String[] args) {


        // Kullanıcıdan bir cumle ve cumlede aratılacak metin isteyin
        // girilen metin ve cumleleye gore asagıdaki 3 sonuctan uygun olanı yazdırın
        // 1-cumle aranan metni icermiyor
        // 2-cumle aranan metni sadece 1 adet iceriyor
        // 3-cumle aranan metni 1 den fazla iceriyor



        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir cumle giriniz...");
        String girilenMetin=scanner.nextLine();
        System.out.println("lütfen aranacak metni yazınız ");
        String aranacakKelime=scanner.nextLine();


        if (girilenMetin.lastIndexOf(aranacakKelime)==-1){

            System.out.println("aranacak kelime cumlede yok");

        } else if (girilenMetin.lastIndexOf(aranacakKelime)!=-1&&aranacakKelime.lastIndexOf(aranacakKelime)>aranacakKelime.lastIndexOf(aranacakKelime)-1) {

            System.out.println("metin cümlede birden fazla var");

        }else System.out.println("aranacak kelime bir tane var");

        //************************DAHA KOLAY ÇÖZÜMÜ

        int ilkKullanımIndeksiAranacakKelime=girilenMetin.indexOf(aranacakKelime);
        int sonKullanımIndeksiAranacakKelime=girilenMetin.lastIndexOf(aranacakKelime);

        if (ilkKullanımIndeksiAranacakKelime==-1){

            System.out.println("malesef aranan kelime yok");
        } else if (ilkKullanımIndeksiAranacakKelime==sonKullanımIndeksiAranacakKelime) {

            System.out.println("aranacak kelime bir tane var");

        }else System.out.println("aranacak kelime birden fazla var");




    }
}
