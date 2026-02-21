package TEKRAR.Konu.Konu18_ForLoop;

import java.util.Scanner;

public class C09_StringiTerstenYazdırma {


    public static void main(String[] args) {

        //Kullanicidan bir String isteyin ve String i tersten yazdırın.
        //orn input: Sabri, output:irbaS

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz...");
        String girilenMetin=scanner.nextLine();

        for (int i = girilenMetin.length()-1; i >=0; i--) {

            System.out.print(girilenMetin.charAt(i));

        }







    }



}
