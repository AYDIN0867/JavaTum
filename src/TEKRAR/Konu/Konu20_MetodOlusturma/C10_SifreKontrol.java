package TEKRAR.Konu.Konu20_MetodOlusturma;

public class C10_SifreKontrol {
    public static void main(String[] args) {

        // Soru 4: verilen sifre icin
        // asagidaki sartları kontrol edip
        // kullanıcıya düzeltilmesi gereken tum eksiklikler yazdiran
        // tum sartları kontrol ettikten sonra
        // sifrede hata yoksa true, hata varsa false donduren
        // bir method olusturun
        //- ilk harf kucuk harf olmalı
        //- son karakter rakam olmalı
        //- sifre bosluk icermemeli
        //- uzunlugu en az 10 karakter olmalı...


        //System.out.println(isPasswordValid("12hhkjl"));//false
        System.out.println(isPasswordValid("Akklımdhklls12"));

    }


    public static boolean isPasswordValid(String girilenSifre){

        char ilkHarf=girilenSifre.charAt(0);
        int sonKarakter= Integer.parseInt(String.valueOf((girilenSifre.length()-1)));
        int sayac=0;

        if (Character.isLowerCase(ilkHarf)){

            System.out.println("ilk harf buyuk olmalı");
            sayac++;
        }

        if ((sonKarakter>0&&sonKarakter<10)){

            System.out.println("son karakter rakam olmalı");
            sayac++;
        }

        if (girilenSifre.contains(" ")){

            System.out.println("şifre boşluk içermemeli");
            sayac++;
        }

        if (girilenSifre.length()<10){

            System.out.println("karakter sayısı 10 dan az olmamalı");
            sayac++;

        }

        if (sayac==0) {

           System.out.println("girilen şifre doğru");
            return true;
        }else {

            return false;
        }





    }
}
