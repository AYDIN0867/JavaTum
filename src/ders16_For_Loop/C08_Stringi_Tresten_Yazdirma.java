package ders16_For_Loop;

import java.util.Scanner;

public class C08_Stringi_Tresten_Yazdirma {
    public static void main(String[] args) {

//tersine cevirip yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");
        String girilenmetin=scanner.nextLine();


        for (int i = girilenmetin.length()-1; i >=0 ; i--) {
            System.out.println(girilenmetin.charAt(i));
        }





    }
}
