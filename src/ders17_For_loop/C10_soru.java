package ders17_For_loop;

import java.util.Scanner;

public class C10_soru {

    public static void main(String[] args) {

//tersine cevirip kaydedeydedeilim

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");
        String girilenmetin=scanner.nextLine();

        String tersMetin="";

        for (int i = girilenmetin.length()-1; i >=0 ; i--) {

            tersMetin+=girilenmetin.charAt(i);

        }


        System.out.println(tersMetin);


        // girilenmetnin palindrom (tersten) olup olmadığını yazdırın


        if (girilenmetin.equalsIgnoreCase(tersMetin)){

            System.out.println("girilen metin palindrom");
        }else {

            System.out.println("girirlen metin palindrom değil");
        }



    }
}
