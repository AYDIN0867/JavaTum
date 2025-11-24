package TEKRAR.Konu18_ForLoop;

import java.util.Scanner;

public class C10_StringTersineCeviripKaydetme {

    public static void main(String[] args) {

//Kullanicidan bir String isteyin ve String i tersine çevirip kaydedin...
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz...");
        String girilenMetin=scanner.nextLine();
        String tesrMetin="";


        for (int i = girilenMetin.length()-1; i >=0; i--) {

      tesrMetin+=girilenMetin.charAt(i);

        }

        System.out.println(tesrMetin);

//girilen metinin palidrom olup olmadıgını yazdırın...

     if (girilenMetin.equalsIgnoreCase(tesrMetin)){

         System.out.println("metin palidrom");
     }else System.out.println("palidrom değil...");




    }
}
