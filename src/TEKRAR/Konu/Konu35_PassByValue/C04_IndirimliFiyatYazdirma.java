package TEKRAR.Konu.Konu35_PassByValue;

public class C04_IndirimliFiyatYazdirma {

    public static void main(String[] args) {

        //3 farklı metod oluşturun
        //verilen fiyat variablesine %10,%20,%40 indirim yapın...
       // metodlarada fiyatın indirimli halini kaydedip
       //  urunun %10 indirimli fiyat : 90 seklinde yazdırın...
      double fiyat=200;
      indirimliFiyatYazdir10(fiyat);//%10 indirimli fiyat : 180.0
      indirimliFiyatYazdir20(fiyat);//%20 indirimli fiyat : 160.0
      indirimliFiyatYazdir10(fiyat);//%10 indirimli fiyat : 180.0
      indirimliFiyatYazdir40(fiyat);//%40 indirimli fiyat : 120.0


    }

    public static void indirimliFiyatYazdir10(double fiyat){

        fiyat=90*fiyat/100;

        System.out.println("%10 indirimli fiyat : "+ fiyat);

    }

    public static void indirimliFiyatYazdir20(double fiyat){

        fiyat=80*fiyat/100;

        System.out.println("%20 indirimli fiyat : "+ fiyat);

    }

    public static void indirimliFiyatYazdir40(double fiyat){

        fiyat=60*fiyat/100;

        System.out.println("%40 indirimli fiyat : "+ fiyat);




    }
}

