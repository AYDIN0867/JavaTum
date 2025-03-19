package ders04_WrapperClass_MatematikselIslemler;

public class C01_WrapperClasses {

    public static void main(String[] args) {


        String str="java candir";

        int sayi=34;

        System.out.println(str.toUpperCase());// JAVA CANDIR
        System.out.println(str.charAt(2));//V

        // JAVA primitive  data türlerinde bazi hazir metodlar kullanabilmemiz için
        // wrapper classs'ları oluşturmuştur
        //boolean,char,byte,short,int,long,float,double
        //Boolean,Character,Byte,Short,Integer,Long,Float,Double

        int sayi1=5;

        Integer sayi2=sayi1;
        Integer sayi3=3456;
        int sayi4=sayi3;


        // primitive variableler ile AYNI data türündeki wrapper calsslar arasında geçiş mümkündür
        //ama farklı wrapper classs lara arasındaki  geçiş mümkündeğildir
        int sayi5=25;
        short sayi6=45;
        byte sayi7=23;

        int sayi8=sayi6;// short==>int  auto widening olur
        sayi6=sayi7;// byte==>short auto widening

        Short sayi9=45;
        //Integer sayi10=sayi9; bu satırda hata verir çünkü nonprimitive iki wrapper arasında olmaz


        //Integer sayi11=sayi6;// warpper class olan Integere short atayamazsın// ncasting de olmaz

        String fiyat1="23";
        String fiyat2="45";

        // String olarak verilen iki ürünün fiyatını toplayın
        // içinde SADECE sayı olduğunda emin olduğumuz stringleri wrapper classları kullanrak
        //sayıya çevirebiliriz

        int fi1=Integer.parseInt(fiyat1);
        int fi2=Integer.valueOf(fiyat2);

        System.out.println("fiyatların toplamı :" +(fi1+fi2));//68

        fiyat1="23.45";
        fiyat2="34.43";

        double f1=Double.parseDouble(fiyat1);// yaptığımız işlem wrapper ve variableler sadece sayılar olunca çalışır
        double f2=Double.valueOf(fiyat2);

        System.out.println("ondalıklı stringlerin toplamı: "+(f1+f2));


        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Short.MIN_VALUE);//-32768



// kullanıcıdan bir karakter alıp
        char harf='s';

        // verielen karakterin Buyuk Harf olup olmadığını yazdırın

        System.out.println(Character.isUpperCase(harf));//false

        // verielen karakterin Kucuk Harf olup olmadığını yazdırın

        System.out.println(Character.isLowerCase(harf));//true

        // verielen karakterin sayi olup olmadığını yazdırın

        System.out.println(Character.isDigit(harf));//false

        // verielen karakterin harf olup olmadığını yazdırın
        System.out.println(Character.isLetter(harf));//true

        // verielen karakterin alfabetik olup olmadığını yazdırın

        System.out.println(Character.isLetter(harf));// true

        // verielen karakteri büyük harf yazdırın // VERİLEN CHAR OLDUĞU İÇİN string gibi to upper doğrudan kullanamyız
        // wrapper class ile yaparız Character.touppercase(harf) deriz ki dedik...:)

        System.out.println(Character.toUpperCase(harf));//S
    }
}
