package TEKRAR.Konu.Konu07_RelationalOperators;

public class C03_OrOperatoru {
    public static void main(String[] args) {

        // or oparatoru işareti || dir.....
        //sadece boolean şartlardan bir  true ise true yazdırır
        //or oparatoru toplama işlemine benzetilir ...

        //eger bir degerin verilen ARALIKTA olup olmadıgına bakmak istersek && oparatoru tercih edilir

        char verilenHarf='t';

        //verilen harfin kucuk harf oldugunu kontrol edin...

        System.out.println(verilenHarf>='a' && verilenHarf<='z'); //true

      // verilen harf a ile k arasında oldugunu kontrol edin

        System.out.println(verilenHarf>='a' && verilenHarf<='k');  //false


        int verilenSayi=25;

        //verilen sayının iki basamaklı oldugunu testedin

        System.out.println(verilenSayi>=10 && verilenSayi<=99);//true

        //verilen sayının 100 ile 200 arasında oldugunu kontrol edin
        System.out.println(verilenSayi>=100 && verilenSayi<=200);//true

        //Eger bir degerin verilen aralıgın DISINDA oldugunu kontrol etmek isteresek
        //|| or operatoru kullanılır

        verilenHarf='m';

        //verilen harfin kucuk harf OLMADIGINI kontrol edin
        System.out.println(verilenHarf<'a' || verilenHarf>'z');//false

        verilenSayi=25;

        //verilen sayının 3 basamaklı pozitif OLMADIGINI kontrol edin

        System.out.println(verilenSayi<100 || verilenSayi>999 );//true

        //verilen sayının 100 ile 200 arasında olmadıgını kontrol edin
        System.out.println(verilenSayi<100 || verilenSayi>200 );



    }
}
