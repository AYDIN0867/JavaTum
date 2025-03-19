package ders42_OOP;

public class C01_AccessModifier {
/*
class leveld aoluşturulan her variable ve her methodun mutlaka access modifieri vardır
java da 4 access modifier vardır en dardan genişe doğru
1-private
2-default //sadece içinde bulunduğu package...
3-protected
4-public

bunlardan default access modifier GORUNUR OLMAZ eğer görünür olaral public protected veya private yazılmadı ise
java otomatik olarak default acceess modifier olarak kabul eder
 */



    String isim;//default degeri null
    public int sayi;//default 0
    protected short shrt; //aile gibi başka packagede ki child class
    private double dbl;
    public static boolean güzelmi;

    public static void main(String[] args) {


    }


    public static void method1(){

    }

    static void method2(){}


}
