package TEKRAR.Konu07_RelationalOperators;

public class C02_AndOperatoru {
    public static void main(String[] args) {

//&& ile & arasındaki fark nedir????? yada neden ihityac duyarız...
//&& oparatoru sonuc oadaklıdır...bir tane false bulunca geriye kalanara bakmaz
//diğerine göre daha hızlıdır...

//tek & and oparatoru atama olup olmamasına dikkat eder


     int a=10;
     int b=20;

        boolean genelSonuc1= a<=b && a<b && a>b-8;

        System.out.println(genelSonuc1);//False

        boolean genelSonuc2= a>=b & a<b & a>b-8;

        System.out.println(genelSonuc2);//False

        //bazen 2. ve 3. islemlerde atamalar olabilir
        //eger o islemler yapılmazsa atamalarda yapılmamıs olur
        //bu durumda sonuc false olsa da tum islemleri yapılmasını isteriz...

        boolean sonuc1=true;
        boolean sonuc2=true;
        boolean sonuc3=true;

        boolean genelSonuc=(sonuc1= a>=b) & (sonuc2 = a<b) &(sonuc3=a>b-8);

        System.out.println(genelSonuc);//false
        System.out.println(sonuc1);//false
        System.out.println(sonuc2);//true
        System.out.println(sonuc3);//false

        //int a=10;
       // int b=20;

        boolean sonuc4=true;
        boolean sonuc5=true;
        boolean sonuc6=true;

        boolean genelSonuc3=(sonuc4= a>=b) && (sonuc5 = a<b) && (sonuc6=a>b-8);

        System.out.println(genelSonuc3);//false
        System.out.println(sonuc4);//false
        System.out.println(sonuc5);//true HIC BAKMADI ATAMA İŞLEMLERINDE KULLANILMAMALI...
        System.out.println(sonuc6);//true




    }
}
