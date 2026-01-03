package TEKRAR.Konu30_ForEachLoop;

import java.util.Scanner;

public class C03_HarfKullanımSayisiniBulma {
    public static void main(String[] args) {

        //kullanıcıdan bir cumle ve bir harf alın,
        // harf cumlede kullanılmıssa kac kere kullanıdıgını yazdırın
        //kullanılmadıysa "harf cumlede kullanılmadı " yazdırın


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz...");
        String cumle=scanner.nextLine();

        System.out.println("lütfen aranacak harfi giriniz...");
        String aranacakHarf=scanner.nextLine().substring(0,1);

        String [] karakterler=cumle.split("");
int kullanımAdedi=0;

        for(String each:karakterler){

            if (each.equals(aranacakHarf)){

                kullanımAdedi++;

            }

        }

        System.out.println(aranacakHarf+"in kullanım adedi : "+ kullanımAdedi);


    }
}
