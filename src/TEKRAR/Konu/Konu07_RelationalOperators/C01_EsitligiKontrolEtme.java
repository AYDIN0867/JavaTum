package TEKRAR.Konu.Konu07_RelationalOperators;

public class C01_EsitligiKontrolEtme {
    public static void main(String[] args) {
        int a=5;
        int b=8;
        int c=3;

        System.out.println(a==b); //false

        System.out.println(b==a+c);//true

        System.out.println(b>c);//true

        System.out.println(c>a);//false

        System.out.println(a=b);//8 a artık 8

        System.out.println(c=a-b);//0

        System.out.println(a!=c);//true

        System.out.println(a!=b);//true


      //char data turu matematiksel islemler
      //ASCII table'daki degerleri ile islemem girer



        System.out.println('a'<='c');//  true a=97 b=98 c=99
        System.out.println('a'=='a');//  true
        System.out.println('b'!='b');//false
        System.out.println('d'!='e');//true

        //String de ise == bekledigimiz sonuclari vermeyebilir

        String s1= "Ali";
        String s2= "Ali";
        String s3= "A"+ "l"+ "i";
        String s4="A";
        String s5="li";
        String s6 =s4+s5;
        String s7=new String("Ali");


        System.out.println(s1==s2);//Ali==Ali ==> True
        System.out.println(s1==s3);//Ali==Ali ==> True
        System.out.println(s1==s6);//Ali==Ali ==> False
        System.out.println(s1==s7);//Ali==Ali ==> False


        /*
        JAVA derslerinin bu asamasında =='i Stringleri karsilastirmak icin KULLANMAYACAGIZ
        eger iki Strin'in metin olarak ayni olup olmadıgını kontrol etmek istersek
        equals() kullanmalıyız...
         */

        System.out.println(s1.equals(s2));//Ali equals Ali ==> True
        System.out.println(s1.equals(s3));//Ali equals Ali ==> True
        System.out.println(s1.equals(s6));//Ali equals Ali ==> True
        System.out.println(s1.equals(s7));//Ali equals Ali ==> True




    }
}
