package TEKRAR.Konu34_StaticKeyWord;

public class C01_StaticKeyWord {
    static  int sayi=20;
    int yas=40;
//static variableler bütün class dan kullanılabilir...

    public static void main(String[] args) {

        sayi++;
       // yas++;
//bir static metoddan static olmayan variable  yani instance olan yas yada metod kullanılamaz
// yas++; yorumdan al altı kırmızı olacak çunku yas++ static degil...


    }

    public static void method1(){
        sayi++;
       // yas++;

    }

    public void method2(){
        sayi++;
        yas++;
        method1();
        method2();

    }


}
