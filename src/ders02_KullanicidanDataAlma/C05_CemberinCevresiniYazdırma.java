package ders02_KullanicidanDataAlma;

import java.util.Scanner;

public class C05_CemberinCevresiniYazdırma {
    public static void main(String[] args) {
        // soru6- kullanicidan bie çemberin yariçapını alıp,
        //çevresini ve alanını yazdırın
        // cevre=2*pı*yariçap,alan=PI*yaricap*yaricap

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Çemberin yarı Çapını Giriniz");

        double yaricap=scanner.nextDouble();
        double pisayisi=3.14;

        System.out.println("Çemberin çevresi : " + (2*pisayisi*yaricap));
        System.out.println("çemberin alanı : "+ (pisayisi*yaricap*yaricap));




    }
}
