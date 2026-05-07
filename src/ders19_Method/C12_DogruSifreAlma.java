package ders19_Method;

import java.util.Scanner;

public class C12_DogruSifreAlma {
    public static void main(String[] args) {

        //Kullanıcıdan bir sifre isteyin
        //C11 metodu kullanarak islemi tekrar edin
        // sifre uygun oluncaya kadar islemi tekrar edin
        // sifre uygun oldugunda kac denemede uygun sifre yazılabildigini  söyleyin

        Scanner scanner=new Scanner(System.in);
        //kullanıcının kaç kere de bildeceğini bilmiyouru

        String sifre="";
        Boolean sifreGcerliMi=false;

        for (int i = 1; i <10000 ; i++) {

            System.out.println("lütfen sifrenizi giriniz");
            sifre=scanner.nextLine();


            //sifrenin gecerliliğini kontrol edip sonucunu kaydedeceğiz...



            sifreGcerliMi=C11_SifreKontrolTekrar.sifreGecerliMi(sifre);

            if (sifreGcerliMi==true){

                System.out.println(i + " denemede gecerli şifre girdiniz");
                break;
            }

        }





    }
}
