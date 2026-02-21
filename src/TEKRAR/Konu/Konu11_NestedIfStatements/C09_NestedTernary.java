package TEKRAR.Konu.Konu11_NestedIfStatements;

import java.util.Scanner;

public class C09_NestedTernary {
    public static void main(String[] args) {
        //kullanıcıdan pozitif bir tamsayi alın
        //verilen sayi pozitif ise "pozitif"
        // negatif ise "negatif"
        // pozitif veya negatif değilse "notr" yazdırn




        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir sayı giriniz");
        int girilenSayi1 = scanner.nextInt();

        System.out.println(girilenSayi1>0 ? "sayi pozitif" : (girilenSayi1<0 ? "negatif" :"nötr"));

        //sayi tek ise 3 ün katı  veya 3 ün katı değil

        System.out.println(

                girilenSayi1%2==0

                ?  girilenSayi1%5==0 ? "5 in katı" : "5 in katı değil"

                :

        girilenSayi1%3==0 ? "sayi 3 ün katı" : "sayi 3 ün katı değil"


        );




    }
}
