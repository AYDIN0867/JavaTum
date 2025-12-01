package TEKRAR.Konu20_MetodOlusturma;

import java.util.Scanner;

public class C11_DogruSifreAlma {

    public static void main(String[] args) {

        // Kullanıcıdan bir sifre isteyin
        // C10 daki metodu kullanarak sifreyi kontrol edin
        // ve sifre uygun oluncaya kadar islemi tekrar edin,
        // sifre uygun oldugunda kac denemede uygun sifre yazabildigini söyleyin


        Scanner scanner=new Scanner(System.in);

            String sifre;
            int sayac=0;
            boolean sifreGecerliMi=false;

        for (int i = 1; i <10000 ; i++) {

            System.out.println("lütfen bir şifre giriniz...");
            sifre = scanner.nextLine();
            sifreGecerliMi = C10_SifreKontrol.isPasswordValid(sifre);

            if (sifreGecerliMi == true) {

                System.out.println(i + "denemede sifreyi buldunuz");
                break;


            }


        }





    }
}
