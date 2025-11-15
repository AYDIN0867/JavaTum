package TEKRAR.Konu14_SubString;

import java.util.Scanner;

public class C05_Soru2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String girilenMetin = scanner.nextLine();


        if (girilenMetin.contains("ev") && girilenMetin.contains("iş")) {

            System.out.println("Evden çalışmak gibisi yok");

        } else if (girilenMetin.contains("ev")) {

            System.out.println("Ev gibisi var mi");

        } else if (girilenMetin.contains("iş")) {

            System.out.println("Çalışmak ne güzel");

        } else System.out.println("Çok çalışmak lazim, çoook");


    }


}



