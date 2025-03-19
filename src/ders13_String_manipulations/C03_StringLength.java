package ders13_String_manipulations;

import java.util.Scanner;

public class C03_StringLength {

    public static void main(String[] args) {

        // kullanıcıdan bir metin isteyin
        // ve girilen metinde kaç karakter kullanıldığını yazdırın


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");
        String girilenMetin=scanner.nextLine();

        // ve girilen metinde kaç karakter kullanıldığını yazdırın

        System.out.println(girilenMetin.length());//10

        // girilen metnin son karakterini yazdırın
        System.out.println(girilenMetin.charAt(girilenMetin.length()-1));
        System.out.println(girilenMetin.substring(9));

        // baştan 3. karakteri yazdırın

        System.out.println(girilenMetin.charAt(2));//a

        // sondan 3. karakteri yazdırın

        System.out.println(girilenMetin.charAt(girilenMetin.length()-3));


        //metindeki baştan 2. ve sondan 3. karakteri yan yana yazdırın

        System.out.println(""+girilenMetin.charAt(1)+girilenMetin.charAt(girilenMetin.length()-3));



    }
}
