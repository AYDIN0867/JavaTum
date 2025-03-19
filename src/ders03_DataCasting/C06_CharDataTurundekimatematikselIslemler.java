package ders03_DataCasting;

public class C06_CharDataTurundekimatematikselIslemler {

    public static void main(String[] args) {

        char chr1='a';
        char chr2='b';
        char chr3='c';
        char chr4='d';
// char data türündeki bir variable veya değeri
        // matematiksel işlemlerde kullanılırsa java direk ascii table deki değeri ile işleme alır
        System.out.println(chr1+chr2+chr3+chr4);//87+98+99=294
        System.out.println('a'+'b'+'c');//294


        // sayi olarak verilmiş bir degerin char karsiligini yazdırınn

        int sayi1=97;// a

        int sayi2=65;//A

        System.out.println((char) sayi1);
        System.out.println((char) sayi2);

        // verilen bir harfin sonrasındaki 3 karakteri yazdırın
        //örn: verilen harf :k ise sonraki karakter :l,m,n

        char chr5='k';

        System.out.println(

                (char)  (chr5+1 ) +" ," +(char)(chr5+2) +","+(char)(chr5+3 )// parantez içine char yazmaz isek

                // matemetaiksel karlşılıklarını yazıdır java


        );



// verilen bir karakterin 'k' dan sonra olup olmadığını yazdırın

        char chr6='a';
        char chr7='m';

        System.out.println(chr6>'k');//97>108 burda matematiksel sonuçtan false getirir
        System.out.println(chr7>'m');// true çıkar çünkü 110 108 den büyüktür







    }
}
