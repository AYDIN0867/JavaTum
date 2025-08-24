package TEKRAR.Konu05_WrapperClasses;

public class C01_WrapperClasses {
    public static void main(String[] args) {


   String str ="Java Candir";
   int sayi=34;

  //Java primitive data turlerinde bazi hazir methodlar kullanabilmemiz icin
  //WRAPPER CLASS'lari olusturmustur
  //boolean, char   ,byte, short, int  , long, float, double
  //Boolean, Character, Byte, Short, Integer, Long, Float,Double

        System.out.println(str.toUpperCase());//JAVA CANDIR
        System.out.println(str.charAt(2));//v

        int sayi1=5;
        Integer sayi2=sayi1;

        Integer sayi3=3456;
        int sayi4=sayi3;


      String fiyat1="23";
      String fiyat2="45";
      //String olarak verilen iki urunun fiyatını toplayın

        int fiy1=Integer.parseInt(fiyat1);
        int fiy2=Integer.valueOf(fiyat2);

        System.out.println("Fiyatlarin Toplami : "+(fiy1+fiy2));

        fiyat1="23.45";
        fiyat2="34.43";

        double f1=Double.parseDouble(fiyat1);
        double f2=Double.parseDouble(fiyat2);

        System.out.println("Fiyatlarin Toplami : "+(f1+f2));//57.88

        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Integer.MIN_VALUE);//-32768

         //kullanicidan bir karakter alip
         char harf = 's';

        //verilen karakterin Buyuk Harf olup olmadıgını yazdırın

        System.out.println(Character.isUpperCase(harf));//false

        //verilen karakterin Kucuk Harf olup olmadıgını yazdirin

        System.out.println(Character.isLowerCase(harf));//true

        //verilen karakterin Sayi olup olmadıgını yazdırın

        System.out.println(Character.isDigit(harf));//false

        //verilen karakterin harf olup olmadıgını yazdırın

        System.out.println(Character.isLetter(harf));

        //verilen karakterin alfabetik  olup olmadıgını yazdırın

        System.out.println(Character.isAlphabetic(harf));





    }
}
