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






    }
}
