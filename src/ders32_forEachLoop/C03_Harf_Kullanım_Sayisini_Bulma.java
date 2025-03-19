package ders32_forEachLoop;

import java.util.Scanner;

public class C03_Harf_Kullanım_Sayisini_Bulma {

    public static void main(String[] args) {

       // kullanicidan bir cümle ve harf alin,
       // harf cumlede kullanılmıssa kac kere kullanıldığını yazdırın
       // kullanılmadıysa "harf cumlede kullanılmamıs " yazdırın


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir cumle giriniz");
        String cumle=scanner.nextLine();
        System.out.println("lütfen bir harf giriniz");
       // char harf=scanner.nextLine().charAt(0);
        String aranacakHarf=scanner.nextLine().substring(0,1);

        String[] karakterlerArr=cumle.split("");

        int sayac=0;

        for (String each
                 :karakterlerArr   ) {

            if (each.equals(aranacakHarf)) {

                sayac++;
            }
        }
            if (sayac==0){

                System.out.println("harf cumlede kullanılmamıştır");
            }else {

                System.out.println("Aranan "+aranacakHarf+" harfi cumlede "+sayac+" defa kullanılmıs");
            }








    }
}
