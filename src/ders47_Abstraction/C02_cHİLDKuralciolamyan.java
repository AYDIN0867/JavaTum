package ders47_Abstraction;

public class C02_cHİLDKuralciolamyan extends C01_KuralcıOlmayanParent{

    boolean emekliMi=true;
    double ücret=4.5;

    public static void main(String[] args) {

      /*

      1-child classlar baslangıc itibari ile parent claslardaki tüm özelliklere (variable/method)
      sahiptir.

      2-Child classlar isterlerse parent class daki özellikleri kendilerine uyarlayabilirler

      3- child class itiyyacı varsa patentta olmayan yeni özellikler ekler
       */


    }


    public void method3(){
        //1. madde
        System.out.println(sayi);//23
        System.out.println(isim);//Ali
        metod1();//parent method calıştı


        //2. madde
        System.out.println(emekliMi);
        method2();//child method2 calişti

       //3. madde
        System.out.println(ücret);//4.5
        method4();//
    }

    public void method2(){

        System.out.println("child method2 calıştı");
    }

    //3. madde

    public void method4(){}





}
