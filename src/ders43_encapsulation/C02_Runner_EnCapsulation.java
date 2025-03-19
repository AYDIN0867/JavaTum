package ders43_encapsulation;

public class C02_Runner_EnCapsulation {

    public static void main(String[] args) {

      /*

     Access Modifier kullanarak
     bir variable ulaşabiliyorsak o variable i hem kullanabilir
     hemde o variable e deger atamasi yapabiliriz

     Ulasamıyorsak da ne kullanılabilir ne de deger ataması yapabiliriz


       */

   /*
   static variablelara ulaşmak için
   obje oluşturmaya gerek olmaz
   static varaiableların adi class variablelardır
   class ismi ile birlikte kullanılabilir

    */

      // System.out.println(C01_encapsulation.strPris);
        // strPris variablesi private olduğu için class dışından kullanılmaz

        System.out.println(C01_encapsulation.strDefs);
        System.out.println(C01_encapsulation.strPros);
        System.out.println(C01_encapsulation.strPubs);

        C01_encapsulation.strDefs="Yeni class def";
        C01_encapsulation.strPros="Yeni class protected";
        C01_encapsulation.strPubs="Yeni class public";
//STATIC olan variablelere private olmamak şartı ile başka class dan ulaşmak mümkün
        //e ulaşmak münkün ise deger atamak zaten mümkün
        System.out.println(C01_encapsulation.strDefs);
        System.out.println(C01_encapsulation.strPros);
        System.out.println(C01_encapsulation.strPubs);
//Static OLMAYAN variableler yani instance variablelere ise OBJE üzerinden ulaşacağız

   C01_encapsulation obj=new C01_encapsulation();

        System.out.println("=============================");

       // System.out.println(obj.strPri);
//static olmayan yani instance variable private ise yine ulaşamayız ve hata verir
        // bu neden le 45. satırı yoruma aldım

        //ama private olmayan diğer instance variablelere ulaşıyorum ve yeni değer de atıyorum ;

        System.out.println(obj.strDef);
        System.out.println(obj.strPro);
        System.out.println(obj.strPub);

        obj.strDef="yeni class def";
        obj.strPro="yeni class protected";
        obj.strPub="yeni class public";






    }
}
