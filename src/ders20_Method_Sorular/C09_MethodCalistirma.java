package ders20_Method_Sorular;

public class C09_MethodCalistirma {

    public static void main(String[] args) {


        C01_AsalMıYazdir.asalMıYazdir(43);
        C01_AsalMıYazdir.asalMıYazdir(45);
        C02_KucukOlmayanıYazdır.kucukOlmayanıYazdır(28,48);

        C03_MetniTersttenYazdir.metniTerstenYazdir("Java candir");
        System.out.println("");
        //aşağıda verilen metnin palinrom olup olmadığını yazdırın

      String metin="java candir";
      String terMetin=C05_MetniTerseCevirme.metnintersiniDondur(metin);

if(metin.equalsIgnoreCase(terMetin)){

    System.out.println("verilen metin palindrom");
}else{

    System.out.println("verilen metin palimndrome değil");
}


    }
}
