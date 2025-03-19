package ders06_Operatorler;

public class C03_MantiksalOperatorler {

    public static void main(String[] args) {

        // eger bir degerin verilen aralıkta olup olamdığına bakmak istersek
        //&& operatörü çalıştırılır

         char verilenHarf='t';

        // verilen harfin kucuk harf oldugunu kontrol edin
        System.out.println(verilenHarf>='a'&& verilenHarf<='z');//true

        // verilen harfin a ile k arasında oldugunu kontrol edin
        System.out.println(verilenHarf>='a'&& verilenHarf<='k');// false

        int verielnSayi=25;

        // verilen sayının 2 basamaklı  oldugunu kontrol edin

        System.out.println(verielnSayi>=10 && verielnSayi<=99);//true

        // verilen sayının 100 ile 200 arasında (sinirler dahil) oldugunu kontrol edin

        System.out.println(verielnSayi>=100 && verielnSayi<=200);//false



        // eger bir degerin verilen aralıgın DISINDA olduğunu kontrol etmek istersek
        // || (veya) operatörü kullanılmalıdır

        verilenHarf='m';

        // verilen harfin kucuk harf olmadığını kontrol edin
        System.out.println(verilenHarf<'a'||verilenHarf>'z');// true

        // verilen harfin a ile t arasında  olmadığını kontrol edin
        System.out.println(verilenHarf<'a'||verilenHarf>'t');//false çünkü m bu iki harfin arasında

        verielnSayi=25;

        // verielen sayının 3 basamaklı pozitif sayı olmadığını kontrol edin

        System.out.println(verielnSayi<100 || verielnSayi>999);//true

        // verilen sayının 100 ile 200 arasında (sinirler dahil) oldugunu kontrol edin

        System.out.println(verielnSayi<100 || verielnSayi>200);//true




    }
}
