package ders15_String_Manipulations;

import java.util.Scanner;

public class C07_SoruBankaEkraniYıldızlıBilgiler {

    public static void main(String[] args) {

        // kullanıcıdan ismini soyismini
        // ve 16 haneli kredi kartı numarasını alın
        // bilgileri aşağıdaki gibi yazdırın
        //girilen isim soy-isim  :C** D****
        // kredi kartı no: **** **** **** 4567

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen İsminizi Giirniz  :");
        String isim=scanner.nextLine().toUpperCase();
        System.out.println("lütfen soyisminizi giriniz  :");
        String soyIsim=scanner.nextLine().toUpperCase();
        System.out.println("lütfen kredi kartı noyu giriniz");
        String krediKartiNo=scanner.nextLine();
        System.out.println(
                isim.substring(0,1).toUpperCase()+
                        isim.substring(1).replaceAll("\\w","*")+" "+
                        soyIsim.substring(0,1)+soyIsim.substring(1).replaceAll("\\w","*")+
                        ",\n"+krediKartiNo.substring(0,3).replaceAll("\\d","*")+"**** ****"+krediKartiNo.substring(krediKartiNo.length()-4)



        );


    }
}
