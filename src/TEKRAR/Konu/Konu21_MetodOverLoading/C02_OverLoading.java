package TEKRAR.Konu.Konu21_MetodOverLoading;

public class C02_OverLoading {
    public static void main(String[] args) {

        topla(2,5);
        topla(2.5,3.4);
        topla(2,8.3);



    }

    public static void  topla(int sayi1,int sayi2){ //topla int int e ikinci defa izin vermez

        System.out.println("Iki int sayinin toplami : "+ (sayi1+sayi2));//signutaresi farklı oldugu için aynu isimde metod oluşturabiliriz..

    }


    public static void  topla(double sayi1,double sayi2){ //topla int int e ikinci defa izin vermez

        System.out.println("Iki double sayinin toplami : "+ (sayi1+sayi2));//signutaresi farklı oldugu için aynu isimde metod oluşturabiliriz..

    }




}
