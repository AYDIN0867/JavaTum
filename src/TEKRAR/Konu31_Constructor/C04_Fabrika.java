package TEKRAR.Konu31_Constructor;

public class C04_Fabrika {

    C04_Fabrika(){



    }

    /*

    5-9 satırı arasındaki constructor default değildir
    parametresiz bir cosntructordır.....
    bu constructor ı biz yazdığımızda default silinmiş oldu

     */
    String perIsim="isim atanmamis";
    String perAdres="adres atanmamis";
    String perTel="tel atanmamis";

    public double maasHesabı(double mesai, double fazlaMesai){



        return (mesai*17+fazlaMesai*23)/2;
    }

/*

Java Object Oriented Programing kullanılır...
Yani biz java ile once Class'lar olusturup o class
'lardan olusturacagımız objeler ile istedigimiz
islemleri yaparız....

Java  olusturulan her class dan OBJE OLUSTURULABILMESİ ICIN
HER CLASS A bir CONSTRUCTOR KOYAR...


 */

  /*
  dEFAULT CONSTRUCTOR GORUNMEZ
  BODY Sİ BOŞTUR
  BİZ kendimiz oluşturdugumuzda silinir...

   */

}
