package TEKRAR.Konu21_MetodOverLoading;

public class C03_OverLoading {
    public static void main(String[] args) {


        topla(5);//topla int ==>10
        topla(2.3,3.5);//topla double double ==>5.8
        topla(2.4,'b');//topla double char ==>100.4 daha kolay cast edeceği char icinm integer oldugu içi
        //3i topla metodunu secer...


    }

    public static void  topla(int sayi1){ //topla int

        System.out.println("Iki int sayinin toplami : "+ (sayi1+sayi1));//signutaresi farklı oldugu için aynu isimde metod oluşturabiliriz..

    }

    public static void  topla(int a,int b){ //topla int int e ikinci defa izin vermez

        System.out.println("Iki int sayinin toplami : "+ (a+b));

    }

    public static void  topla(double c,int d){ //topla int int e ikinci defa izin vermez

        System.out.println("Iki int sayinin toplami : "+ (c+d));//signutaresi farklı oldugu için aynu isimde metod oluşturabiliriz..

    }

    public static void  topla(float c,int d){ //topla int int e ikinci defa izin vermez

        System.out.println("Iki int sayinin toplami : "+ (c+d));//signutaresi farklı oldugu için aynu isimde metod oluşturabiliriz..

    }

    public static void  topla(double c,double d){ //topla int int e ikinci defa izin vermez

        System.out.println("Iki int sayinin toplami : "+ (c+d));//signutaresi farklı oldugu için aynu isimde metod oluşturabiliriz..

    }




}
