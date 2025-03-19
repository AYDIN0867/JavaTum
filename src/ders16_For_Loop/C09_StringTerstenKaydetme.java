package ders16_For_Loop;

import java.util.Scanner;

public class C09_StringTerstenKaydetme {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");
        String girilenmetin=scanner.nextLine();

        String tersMetin="";

        for (int i = girilenmetin.length()-1; i <=0 ; i--) {
            tersMetin+=girilenmetin.charAt(i);
            System.out.println(tersMetin);

        }

        if (girilenmetin.equalsIgnoreCase(tersMetin)){

            System.out.println("verilen değer palindrom");
        }else{

            System.out.println("palindrom değil");
        }



    }
}
