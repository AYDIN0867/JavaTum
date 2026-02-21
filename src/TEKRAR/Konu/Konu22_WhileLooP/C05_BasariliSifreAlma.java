package TEKRAR.Konu.Konu22_WhileLooP;

import TEKRAR.Konu.Konu20_MetodOlusturma.C10_SifreKontrol;

import java.util.Scanner;

public class C05_BasariliSifreAlma {
    public static void main(String[] args) {

 //daha once yaptıgımız sifre kontrolu metod'unu kullanarak
 // kullanıcı hatasız bir sifre girinceye kadar tekrar tekrar sifre isteyin
 // kabul edilebilir bir sifre girdiğinde " şifreniz  basarılı olarak kaydedildi"yazdırın


        Scanner scanner=new Scanner(System.in);
        boolean tekrarSoralımMı=true;
        String grilenSifre="";
        while (tekrarSoralımMı){

            System.out.println("lütfen sifrenizi giriniz...");
            grilenSifre=scanner.nextLine();

          tekrarSoralımMı=!C10_SifreKontrol.isPasswordValid(grilenSifre);


        }

        System.out.println("şifreniz başarılı bir şekilde kaydedildi..");



    }
}
