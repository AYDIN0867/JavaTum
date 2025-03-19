package ders02_KullanicidanDataAlma;

import java.util.Scanner;

public class C04_KullanicidanBilgiAlipYazdirma {
    public static void main(String[] args) {

        // kullanıcidan ismini,soyismini ve yasini alıp
        // asagidaki formatta yazdirin
        // girilen bilgiler:J Doe,44

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen İsminizi Giriniz");
        String isim=scanner.nextLine();

        System.out.println("Lütfen Soyisminizi Giriniz");
        String soyisim=scanner.nextLine();

        System.out.println("Lütfen Yasınızı Giriniz");
        double yas=scanner.nextDouble();

        System.out.println("Girilen Bilgiler : "+isim.charAt(0)+" "+soyisim+", "+yas);




    }
}
