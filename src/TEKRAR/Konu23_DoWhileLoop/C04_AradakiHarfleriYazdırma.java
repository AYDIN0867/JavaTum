package TEKRAR.Konu23_DoWhileLoop;

import java.util.Scanner;

public class C04_AradakiHarfleriYazdırma {
    public static void main(String[] args) {

        /*
        Kullanıcıdan baslangıc ve bitis harflerini alıp,
        o harfleri ve aralarındaki harfleri yazdırın...
        Kullanıcı bir harf değil bir metin girerse  uyarı verip, yeniden
        harf girmesini isteyin
        kullanıcı harf girinceye kadar tekrar isteyin...
         */

        Scanner scanner = new Scanner(System.in);
        char girilenHarfilk = 'a';
        char girilenHarfikinci = 's';
        String girilenBaslangıcMetin = "";
        String girilenBitisMetin = "";

        do {

            System.out.println("lütfen  baslangıc için bir harf giriniz....");
            girilenBaslangıcMetin = scanner.nextLine();
            girilenHarfilk = girilenBaslangıcMetin.charAt(0);

            System.out.println("lütfen  bitis için bir harf giriniz....");
            girilenBitisMetin = scanner.nextLine();
            girilenHarfikinci = girilenBitisMetin.charAt(0);

            if (girilenBaslangıcMetin.length() > 1 || girilenBitisMetin.length() > 1) {

                System.out.println("lütfen baslangıc ve bitis degeri için bir harf girmelisiniz.....");
            } else if (!Character.isLetter(girilenHarfilk) || !Character.isLetter(girilenHarfikinci)) {// girilen baslangıc ve girilen bitis tek karakter...

                System.out.println("girdiğiniz harf karaketer olmalıdır...");
            }else {//kullanıcı tek karakter girdi ve girilen karakter harf...

               while (girilenHarfilk<=girilenHarfikinci){

                   System.out.println(girilenHarfilk+ " ");
                   girilenHarfilk++;
               }
            }

        }while (girilenBaslangıcMetin.length() > 1 || girilenBitisMetin.length() > 1||!Character.isLetter(girilenHarfilk) || !Character.isLetter(girilenHarfikinci));

    }

}