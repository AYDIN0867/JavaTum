package TEKRAR.Konu.Konu23_DoWhileLoop;

import java.util.Scanner;

public class C05_AradakiHarfleriYazdırMetodla {
    public static void main(String[] args) {






    }


    public static void aradakiHarfiYazdir(String metin1,String metin2){

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

                    System.out.print(girilenHarfilk+ " ");
                    girilenHarfilk++;
                }
            }

        }while (girilenBaslangıcMetin.length() > 1 || girilenBitisMetin.length() > 1||!Character.isLetter(girilenHarfilk) || !Character.isLetter(girilenHarfikinci));

    }




    }





