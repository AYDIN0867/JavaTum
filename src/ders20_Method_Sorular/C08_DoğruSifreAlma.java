package ders20_Method_Sorular;

import java.util.Scanner;

public class C08_DoğruSifreAlma {
    public static void main(String[] args) {

// kullanıcıdan bir şifre isteyin
        // C07 deki şifeyi kontrol edin
        // ve sifre uygun oluncaya kadar işlemi tekrar edin
        //sifre uygun olduğunda kaç denemede uygun sifre yazabildiğini söyleyin

Scanner scanner=new Scanner(System.in);
String sifre="";
boolean sifreGecerlimi=false;

        for (int i = 1; i <10000 ; i++) {

            System.out.println("lütfen şifrenizi giriniz...");
            sifre=scanner.nextLine();
            //şifrenin gecerli olup olmadığı kontrol edilip
            //sonucu kaydedelim..

            sifreGecerlimi=C07_SifreKontrel.isSifreDogruMu(sifre);

            if (sifreGecerlimi==true){

                System.out.println(i+" denemede gecerli şifre girdiniz");
                break;
            }

        }



    }

}
