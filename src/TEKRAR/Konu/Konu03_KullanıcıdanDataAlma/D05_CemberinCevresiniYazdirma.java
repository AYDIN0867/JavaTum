package TEKRAR.Konu.Konu03_KullanıcıdanDataAlma;

import java.util.Scanner;

public class D05_CemberinCevresiniYazdirma {
    public static void main(String[] args) {

        //Soru 6 Kullanıcıdan bir cemberin yarıcapını alıp,
        //cevresini ve alanını yazdırın...

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen demberin yarıcapını cm olarak girimiz...");
        double yariCap=scanner.nextDouble();
        double Pi=3.14;

        System.out.println("Çemberin cevresi : "+(2*Pi*yariCap));
        System.out.println("Cemberin alanı : "+(Pi*yariCap*yariCap));








    }
}
