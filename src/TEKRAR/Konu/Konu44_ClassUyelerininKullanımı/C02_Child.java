package TEKRAR.Konu.Konu44_ClassUyelerininKullanımı;

public class C02_Child extends C01_Parent {

    String str="Child class";
    String t ="Hamza";
    String k="Ahmet";



    public void method2(){System.out.println("Child method2");}
    public void method4(){System.out.println("Child method4");}


    public static void main(String[] args) {

        C02_Child obj=new C02_Child();
        obj.method1();

    }

    public void method1(){

        String str="Child class metod";
        String t ="Cansu";
        String k="Oguzhan";

    }




}
