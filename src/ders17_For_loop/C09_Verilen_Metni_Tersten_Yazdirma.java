package ders17_For_loop;

import java.util.Scanner;

public class C09_Verilen_Metni_Tersten_Yazdirma {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");
        String girilenmetin=scanner.nextLine();


        for (int i = girilenmetin.length()-1; i >=0 ; i--) {

            System.out.print(girilenmetin.charAt(i));

        }





    }

}
