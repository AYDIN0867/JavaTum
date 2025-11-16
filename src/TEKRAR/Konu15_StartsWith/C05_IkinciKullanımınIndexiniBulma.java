package TEKRAR.Konu15_StartsWith;

import java.util.Scanner;

public class C05_IkinciKullanımınIndexiniBulma {
    public static void main(String[] args) {

   // Kullanıcıdan bir metin isteyin
   // girilen metin'de 2. a nın index ini yazdırın
   // eger 2. a yoksa metin 2 a icermeli yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz...");

        String girilenMetin=scanner.nextLine();

         int ilkAindeks=girilenMetin.indexOf("a");

        if (girilenMetin.indexOf("a",ilkAindeks+1)<0){

            System.out.println("girilen metin 2 a içermeli");

        } else System.out.println(girilenMetin.indexOf("a",ilkAindeks+1));


    }
}
