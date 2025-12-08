package TEKRAR.Konu14_SubString;

import java.util.Scanner;

public class C04_Soru {
    public static void main(String[] args) {

        // kullanicidan bir metin isteyin
        // metin ev içeriyorsa "Ev gibisi var mi"
        // metin iş içeriyorsA "Çalışmak ne güzel"
        // metin hem ev hem  iş içeriyorsa "Evden çalışmak gibisi yok"
        // metin bu iki kelimeyi de içermiyorsa "Çok çalışmak lazim, çoook" yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String girilenMetin=scanner.nextLine();

        if (!(girilenMetin.contains("ev")&& girilenMetin.contains("iş"))) {

            System.out.println("Çok çalışmak lazim, çoook");

        } else if (girilenMetin.contains("Ev gibisi yok")&& girilenMetin.contains("Çalışmak ne güzel")) {

            System.out.println("Evden çalışmak gibisi yok");


    } else if (girilenMetin.contains("Ev gibisi yok")) {

            System.out.println("Ev gibisi var mi");

        }else System.out.println("Çalışmak ne güzel");


    }
}
