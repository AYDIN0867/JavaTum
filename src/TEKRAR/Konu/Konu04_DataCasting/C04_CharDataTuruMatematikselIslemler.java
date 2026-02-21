package TEKRAR.Konu.Konu04_DataCasting;

public class C04_CharDataTuruMatematikselIslemler {
    public static void main(String[] args) {

        char chr1='a';
        char chr2='b';
        char chr3='c';
//char data turundeki  bir variable'i veya degeri matematiksel işlemlerde kullanırsak
        //java dogrudan ASCII table deki degeri ile işleme alır ve ınteger ile özdeşleştirmiştir

        System.out.println(chr1+chr2+chr3);//97+98+99==>294
        System.out.println('a'+'b'+'c');//97+98+99==>294
        System.out.println("a"+"b"+"c");//abc

//sayi olarak verilmiş bir degerin char karsiligini yazdirin....

    int sayi1=97;//a
    int sayi2=65; //A


        System.out.println((char)sayi1);//  a
        System.out.println((char) sayi2);//A



   //verilen bir harfin sonrasindaki 3 karakteri yazdirın
   //orn: verilen harf k ise sonraki 3 karakter :l,m,n

char karakter='k';

        System.out.println((int)karakter);
   int sayiK=107;

        System.out.println(

                (char)(karakter+1)+ ", "+(char) (karakter+2) + ", "+(char) (karakter+3)


        );

        System.out.println(

                (char)(sayiK+1)+ ", "+(char) (sayiK+2) + ", "+(char) (sayiK+3)


        );



//verilen bir karakterin 'k' dan sonra olup olmadıgını yazdırın...

char chr6='a';
char chr7='m';

        System.out.println(chr6>'k');//false
        System.out.println(chr7>'k');//true





    }

}
