package TEKRAR.Konu.Konu21_MetodOverLoading;

public class C01_OverLoading {
    public static void main(String[] args) {

        /*
        Javada bir CLASS icerisinde aynı isim ve ayni parametrelere sahip birden fazla metod OLUŞTURULAMAZ...

         */

    }

    public static void  topla(int sayi1,int sayi2){ //topla int int e ikinci defa izin vermez

        System.out.println("Iki int sayinin toplami : "+ (sayi1+sayi2));
    }


    //  public static void  topla(int sa,int b){ //topla int int e ikinci defa izin vermez
   //     System.out.println("Iki int sayinin toplami : "+ (sa+b));
  //  }

    public static void  topla(int sayi1,double sayi2){ //topla int int e ikinci defa izin vermez

        System.out.println("Iki int sayinin toplami : "+ (sayi1+sayi2));//signutaresi farklı oldugu için aynu isimde metod oluşturabiliriz..

        //signutare= metod adı ve parametrelerinin data türü ve sıralaması...

        //bir metod call un calisması icin metod call da yazdıgımız argumentler ile
        //metoddaki parametreler uyumlu olmalıdır...
    }


}
