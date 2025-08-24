package TEKRAR.Konu02_DataKullanimiveVariables;

public class D04_VariableNamingConvention {
    public static void main(String[] args) {

     int YAS=40;
     int Yas=67;
     int yas=23;
     int yAS=47;

     //variable isismleri genellikle kucuk hrfle baslar
        //Ancak buyuk harfle baslansa da hata olarak altını cizmez

        System.out.println(yAS);//47

        //int int =45; isim olarak java da tanımlı keyword leri kabul etmez....hata veririr.
        //stack memaory primitiviler de tututlur variable değeri ile birlikte stackmemory de tututlur...
        //non primitivlerde referans stack memoryde tutulur pointer ile  heap memory de ise yerini belirlemis
        //Declaration ve assigment ayni satirda yapılabilir

        int not =80;
        String isim="Ramazan";
        boolean ogrenciMi=true;
        double notOrta=89.3;


        //yada once decelaration ,sonra assigment yapılabilir

         int okulNo;
         okulNo=90;
         okulNo=(okulNo+23)/2;

         //Decleration sadece 1 kere yapılır,assigment ise istenilen kadar yapılabilir...


        //ınteger;byte,short,int,long
        //float;float,double
        //true için 1 false için hazfızada O degeri tutulur

        //byte 8 bit
        //short 16 bit
        //int 32 bit
        //long 64bit
        //float 32bit float yazıldıgında sonuna f eklenir float a=20f;
        //double 64 bit

        //Non-primitive data türlerinin geneli için object tabiri de kullanılır.
        //cunku tum non-primitive data turleri kendilerine ait bir class tarafından
        //olusturulan objelerdir.

      //method ve variable isimleri kucuk harfle baslar ve bu teamuldur...


    }
}
