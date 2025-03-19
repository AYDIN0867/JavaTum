package ders52_throwsVeFinalyKeywords;

public class C01_BaziExceptionsTürleri {
    public static void main(String[] args) {

  //1-NullPointerException

  String str=null;
  String s;
       //System.out.println(s); Variable 's' might not have been initialized
        String t="";
        //t variablesine deger atanmıştır dolayısıyla java t yi deger atanmamis kabul etmez

        System.out.println(str);//null
        System.out.println("Ali"+str);//Alinull
       // System.out.println(str.length()); //NullPointerException

        //2- StringIndexOutOfBoundsException
        //3- ArrayIndexOutOfBoundsException

        //4-ArithmeticException:Matematiksel hatalara olusur
        //5- tum excepiton'larin Parent class idir

        //6- Exception : Tum excepiton'larin parentidir

        //7-FileNotExcepiton:IO exceptionların childidir
        //dosyaya ulasilmak istediğinde dosya bulunumazsa olusur

        //8-IOException :Dosya okuma veya dosyaya bilgi yazdirma ile ilgili
        //tum exceptionlarin parentidir

        //9-NumberFormatException: String olarak verilen bir sayiyi parse ederken
        //String digit olmayan bir karakter icerirse olusur

        String str1="23";//23a yazarsak pars Integer işimize yaramaz NumberFormatException verir..
        String str2="34";

        //str1 ve str2 yi matematiksel olarak toplayın

         int a=Integer.parseInt(str1);
         int b=Integer.parseInt(str2);

        System.out.println("str1 ve str2 nin matematiksel toplami : " +(a+b));
        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));

        System.out.println(Integer.hashCode(a));


        //10- ClassCastException:Class casting yaparken
        //yapilmayacak bir casting 'i syntax' a uydurarak yapmaya çalişirsak oluşur

        //Non-primitive data türlerinde
        // bir data turundeki degeri, baska data turundeki variable a ATAYAMAZSINIZ
        //Bu kuralin ıstisnasi parent-child class'lar arasinda atama yapilabilir


        Integer sayi=20;

      //  Double dbl=(Double) sayi; //Inconvertible types; cannot cast 'java. lang. Integer' to 'java. lang. Double
        //aralarinda parent child ilişkisi olmadigindan bu atamaya izin vermez

        Object obj=sayi; //Integer IS-A Object diyebiliyoruz ,aralarinda parent child ilişkisi vardir

        System.out.println(obj);


        Double dbl=(Double) obj; //Object HAS-A Double islişkisi var ,Object Parent
        //bu atamayı csasting ile yapabilriz
        //ama
              //yazdirdigimizda
        System.out.println(dbl); //ClassCastException hatasi verir

        //11-IllegalArgumant Exception




    }
}
