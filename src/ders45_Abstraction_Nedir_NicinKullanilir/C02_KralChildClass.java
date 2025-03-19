package ders45_Abstraction_Nedir_NicinKullanilir;

public class C02_KralChildClass extends C01_KuralciOlmayanParent{

    /*

    Eger normal class yapisi ve inheritance kullanırsak Child class Kral olur
    -parent class daki tum variable ve methodlari kullanabilir
    -isterse parent classdaki methodları override edebilir
    -isterse parent class da olmayan yeni variable veya methodları ekleyebilir



    java abstraction sayesinde PARENT classlar kendilerini chil eden classların
    MUTLAKA OVERRIDE ETMESI GEREKEN METHODLARI belirleme tanimistir


     */




    public static void main(String[] args) {

        C02_KralChildClass child=new C02_KralChildClass();
        child.method();



    }

    public void method2(){System.out.println("child class method2 calisti");}
    public void method5(){System.out.println("child class method5 calisti");}

    public void method() {

        System.out.println(isim);
        sayi=34;
        method1();
        method2();//Child Class method2 calisti
        this.method2();//Child Class method2 calisti
        super.method2();//method2 calisti


    }
}
