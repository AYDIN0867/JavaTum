package ders23_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoopSoru1 {

    public static void main(String[] args) {

       //kullanıcıdan baslangic ve bitis harflerini alıp,
       // o harfleri ve aralarındaki harfleri yazdırın
       // kullanıcı bir harf girerse uyarı verip yeniden harf girmesini isteyin
       //kullanıcı harf girinceye kadar tekrar isteyin

        Scanner scanner=new Scanner(System.in);

        char baslangic='a';
        char bitis='s';
        String girilenBaslangic="";
        String girilenBitiş="";

        do {

            System.out.println("lütfen baslangıc bir harf giriniz..");
            girilenBaslangic=scanner.nextLine();

            System.out.println("lütfen bitiş için bir harf giriniz..");
            girilenBitiş=scanner.nextLine();
            baslangic=girilenBaslangic.charAt(0);
            bitis=girilenBitiş.charAt(0);
            if (girilenBaslangic.length()>1||girilenBitiş.length()>1){

                System.out.println("başalangıc ve bitiş degeri için harf girmeliisniz");
            } else if (!Character.isLetter(baslangic)||!Character.isLetter(bitis)) { //girilen başlangıç ve bitiş tek karakter
                System.out.println("giridiğiniz karakter harf olamlıdır");
            } else{//kullanıcı tek karakter girdive bu harf

                while (baslangic<=bitis){

                    System.out.print(baslangic+" ");
                    baslangic++;
                }

            }



        }while (girilenBaslangic.length()>1||girilenBitiş.length()>1 ||!Character.isLetter(baslangic)||!Character.isLetter(bitis)                     );



    }
}
