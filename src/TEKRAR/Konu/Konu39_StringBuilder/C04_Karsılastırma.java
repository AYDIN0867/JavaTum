package TEKRAR.Konu.Konu39_StringBuilder;

public class C04_Karsılastırma {
    public static void main(String[] args) {

    String str="Aşi";
    StringBuilder sb=new StringBuilder("Ali");
    StringBuilder sb1=new StringBuilder("Ali");

    //aynı metne sahip olan str, sb ve sb1 i karşılaştıralım...

       // System.out.println(str==sb);//Operator '==' cannot be applied to 'java.lang.String', 'java.lang.StringBuilder'
/*
java non-primitive data turlerinın farklı data turelrinin  ==ile   karşılaştırılamsına izin vermez
StringBuilderler metin aynı olsa da eşit eşitte false doner
 */

//2- equals () metodu ile karşılaştırma...

        System.out.println(str.equals(sb));//false
        //Result of 'str.equals(sb)' is always 'false'
        //'equals' between objects of inconvertible types 'String' and 'StringBuilder'

        System.out.println(sb.equals(sb1));//false
//Suspicious call to 'equals()' on 'StringBuilder' object

        System.out.println(sb.equals(sb));//true sadece kendisi ile karşılaştırmada ture diğerlerinde false verir

//3- compare() ile karşılaştırma


   StringBuilder sb2=new StringBuilder("Umut");
   StringBuilder sb3=new StringBuilder("Amut");
   StringBuilder sb4=new StringBuilder("umut");
   StringBuilder sb5=new StringBuilder("Talu");
   StringBuilder sb6=new StringBuilder("Umut");

        System.out.println(sb2.compareTo(sb3));//20 Umut==>Amut
        System.out.println(sb2.compareTo(sb4));//-32 Umut==>umut ASCII table goru buyuk U ile kucuk u arasında 32 fark vardır...
        System.out.println(sb2.compareTo(sb5));//1
        System.out.println(sb2.compareTo(sb6));//0 ise metin olarak aynıdır...

/*
compare metodu ilk karaterlerden başlayarak her iki
stringBuilder daki tum indexlerdeki karakterleri compare eder
eger bir indekste aynıolmayan karakterler bulursa bu iki karakter
arasındaki ASCII deger farkını yazdırır...

 */
    }
}
