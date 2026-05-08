package TEKRAR.Konu.Konu46_Overriding;

public class C05_Child extends C04_Parent {

   /*

   Child class'ta parent class'tan bir metodu
   override etmek istersek öncelikli olarak parent class
   ile aynı SIGNUTARE  sahip bir metod olusturulabilir
   signature e sahip bir metod olusturulabilir signature
   farklı olursa ismin aynı olması override sağlamaz...

    */




public void solunum(){


}

public void metod1(int sayi){

/*
override metod oluşturmak icin @Override notasyonu kullanılabilir
fakat bu notasyonu kullanmak zorunlu değildir.Over ride noasyonu
intellij tarafından otomatik olusturulur..bu notasyon parent class taki override edilen metodu takip eder
eğer silinir veya değiştirilirse override işlemi gecersiz olur...
Bu gecersizlik nedeniyle de @OverRide notasyonu sayesinde CTE verir

Notasyon kullanılmayan override işleminde
parent class taki metod takip edilmez
silinmesi ya da değişmesi durumunda Overriding
özelligi biter fakat kod calısmaya devam eder


Degismesi ya da silinmesi sonucu





 */

}

    @Override
    public void method2() {
        super.method2();
    }


    public void method3(){



    }
}
