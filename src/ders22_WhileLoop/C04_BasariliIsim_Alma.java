package ders22_WhileLoop;

import ders20_Method_Sorular.C07_SifreKontrel;

import java.util.Scanner;

public class C04_BasariliIsim_Alma {

    public static void main(String[] args) {

//daha once yaptığımız sifre kontrolu methodunu kullanarak
        // kullanıcı hatasız bir şifre girinceye kadar tekrar tekrarşifre isteyin
        //kabul edilebilir bir şifre girdiğinde "şifreniz basarili olarak kaydedildi" yazdirın

        Scanner scanner=new Scanner(System.in);

        boolean tekrarSorayımMı=true;
        String girilenSifre="";
        while (tekrarSorayımMı){

            System.out.println("lütfen şifrenizi giriniz");

            girilenSifre=scanner.nextLine();

            tekrarSorayımMı=!C07_SifreKontrel.isSifreDogruMu(girilenSifre);

        }

        System.out.println("şifreniz başarılı olarak kaydedildi");

    }
}
