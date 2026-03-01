package TEKRAR.Konu.Konu41_Encapsulation;

public class C02_Runner {
    public static void main(String[] args) {
        /*

        Access Modifier kullanarak bir variable'ye
        ulaşabiliyorsak o variableyi hem kullanabilir
        hem de varaiableye deger ataması yapabiliriz

        Ulaşamıyorsak da ne kullanabilir
        ne de deger ataması yapabiliriz...

         */

/*
Static variablelere ulaşmak için obje
oluşturmaya gerek olmaz,
static variablelerin diger adı
class variablelerdir class isimleri ile kullanılırlar

 */

        //System.out.println(C01.strPris);
        //private ye ne yaparsak yapalım class dısndan ULAŞILAMAZ
// sadece kendi class ından ulaşılır
        System.out.println(C01.strDefs);//bunlar private değil ve de static oldugu icin
        // class ismi ile ulaşabilriz
        System.out.println(C01.strPros);
        System.out.println(C01.strPubs);
//Yasasin package static
//Yasasin aile static
//Yasasin public static
 C01.strDefs="Yeni class def";
 C01.strPros="Yeni class protected";
 C01.strPubs="yeni class pub";

        System.out.println(C01.strDefs);
        System.out.println(C01.strPros);
        System.out.println(C01.strPubs);
//Yeni class def
//Yeni class protected
//yeni class pub

  /*

  Static olmayan variablelere ulasabilmek icin
  CO1 class ından obje olustrabiliriz...

   */

 C01 obj1=new C01();
 System.out.println("===================================");

        System.out.println(obj1.strDef);
        System.out.println(obj1.strPro);
        System.out.println(obj1.strPub);

obj1.strDef="yeni class def";
obj1.strPro="yeni class protected";
obj1.strPub="Yeni class public";





    }

}
