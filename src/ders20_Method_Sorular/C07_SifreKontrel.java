package ders20_Method_Sorular;

public class C07_SifreKontrel {

    public static void main(String[] args) {

     // verielen şifre için
     // aşağıdaki şartları kontrol edip
     // kullanıcıya düzeltilmesi gereken tüm eksiklikleri yazdıran
     // tum şartları kontrol ettikten sonra
     //sifrede hata yoksa true, hata varsa false donduren
     // bir metod oluştrun
     //ilkharf kucuk olmalı
     //son karakter rakam olamlı
     // sifre bosluk içermemeli
     // uzunlugu en az 10 karakter olmalı


        //System.out.println(isSifreDogruMu("Adf iuy")); //false ve metodun içindeki hatalar yazıldı

        System.out.println(isSifreDogruMu("asdfk12345688")); //true
        // hatalalrı yazdırmak istemediğimizde istenmeyen durumlar için yazılan soutla silinirse sadece true yada false yazar
        //  System.out.println("son karakter rakam olmalı"); vb...

    }


       public static boolean  isSifreDogruMu(String sifre){

           int count=0;
           // ilk harf kucuk olmalı

           char ilkharf=sifre.charAt(0);
           if (!Character.isLowerCase(ilkharf)){
               System.out.println(" ilk harf kucuk olmalı");
               count++;
           }

           // son karakter rakam olmalı

           char sonKarakter=sifre.charAt(sifre.length()-1);

           if (!Character.isDigit(sonKarakter)){

               System.out.println("son karakter rakam olmalı");
               count++;
           }

           //sifre bosluk içermemeli

           if (sifre.contains(" ")){

               System.out.println("girilen şifre boşluk içermemeli");
               count++;

           }

           //uzunluğu en az 10 karakter olmalı
           if (!(sifre.length()>10)){

               System.out.println("şifrenin uzunluğu en az 10 karakter olmalı");
               count++;
           }

           if (count==0){

               return true;


           }else {

               return false;
           }





       }



}
