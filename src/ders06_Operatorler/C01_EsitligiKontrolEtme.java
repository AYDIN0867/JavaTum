package ders06_Operatorler;

public class C01_EsitligiKontrolEtme {

    public static void main(String[] args) {

        int a=5;
        int b=8;
        int c=3;

        System.out.println(a==b); //5==8==>//false

        System.out.println(b==a+c);//true

        System.out.println(b>c);// true

        System.out.println(c>a);//false

        System.out.println(a=b);//8

        System.out.println(c=a-b);//0

        System.out.println(a!=b);// 8!= 0 true

        System.out.println(a!=c);// false

        System.out.println(a>=b);//true

        // char data turu matematiksel işlemlerde
        // ASCII table'daki degerleri ile isleme girer

        System.out.println('a'<='c');//true

        System.out.println('a'=='a');// true

        System.out.println('b'!='b');//false

        System.out.println('d'!='e');//true


        // String'de ise== beklediğimiz sonuçları vermeye biliri

        String s1="Ali";
        String s2="Ali";
        String s3="A"+"l"+"i";
        String s4="A";
        String s5="li";
        String s6=s4+s5;
        String s7=new String("Ali");
        System.out.println(s3);//ali
        System.out.println(s1==s2);// true
        System.out.println(s1==s3);// Ali==Ali // true
        System.out.println(s1==s6);//false
        System.out.println(s1==s7);//false


        // şimdilik =='i Stringleri karşılaştırmak için kullanmayacağız
        // eğer iki Stringin metin olarak aynı olup olmadığını kontrol etmek istersek
        // equals() ı kullanmalıyız

        System.out.println(s1.equals(s2));// true
        System.out.println(s1.equals(s3));// Ali==Ali // true
        System.out.println(s1.equals(s6));//true
        System.out.println(s1.equals(s7));//true






    }
}
