package ders05_Increment_decrement;

public class C04_Preincrement_Postincrement {

    public static void main(String[] args) {

/*
++ ve -- 'nin özel bir kullanımı vardir
EGER bir satırda sadece ++a veya a++ varsa,
ikisi de aynı işlevi görür , a nın değerini bir artırılar.

ayni şekilde bir satırda sadece --a veyaa-- varsa
ayni işlevi yapıp a yi bir azaltırlar

farkları ++ ve -- kullanılan satırda başka bir işlem daha
yapılırsa ortaya çıkar

++ veya --nin diger işlemden önce mi sonra mı yapılacağına
++ veya -- nin variable dan önce veya sonra yazılmasına göre
karar vereceğiz..

++a, --b ; ++ veya -- variable den önce yazılmıssa
önce artırma veya azaltma yapılır, sonra diğer işlem yapılır

a++,b--; ++ veya -- variableden sonra yazılmıssa
 artırma veya azlatma sonra yapılabilir, önce diğer işlemler yapılır


 */
      int a=20;
      int b=40;

      a++;
      b--;

        System.out.println("36.satirda a :"+a+", b :"+b);// yukarıda a++ ve b-- tekolduğu için öncesi sonrası
        // önemli değil aynı sonucu verir. 21,39 yazdırır

        ++a;
        --b;

        System.out.println("42.satirda a :"+a+", b :"+b);// yukarıda a++ ve b-- tekolduğu için öncesi sonrası
        // önemli değil aynı sonucu verir. 22,38  yazdırır


        System.out.println(a++);//a  nın değerini sonra bir artır ve a nın değerini ÖNCE yazıdır yani 22 yazar

        System.out.println("47.satirda a :"+a+", b :"+b);//a:23, b:38

        System.out.println(++a);// a nın değerini önce bir artır anın yeni değeri 24 yazdırılan da 24

        System.out.println("52.satirda a :"+a+", b :"+b);//a:24, b:38

        System.out.println(b--);// önce b nin değerini yazdır sonra bir azalt ..38 yazar
        System.out.println("55.satirda a :"+a+", b :"+b);//a:24, b:37 yazar üsteki devam ediyor


        System.out.println(--b);// sonra b nin değerini yazdır önce bir azalt ..38 yazar
        System.out.println("59.satirda a :"+a+", b :"+b);//a:24, b:36


       a=b++;//a:24, b:36
       System.out.println("63.satirda a :"+a+", b :"+b); //a:36 b:37

        a=++b;//a:24, b:36
        System.out.println("63.satirda a :"+a+", b :"+b); //a:38 b:38

        b=a++/2;

        System.out.println("70.satirda a :"+a+", b :"+b); //a:39 b:19


        b=++a/2;

        System.out.println("75.satirda a :"+a+", b :"+b); //a:40 b:20


    }
}
