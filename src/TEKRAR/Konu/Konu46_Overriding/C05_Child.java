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

    /*

    Parenttaki metoda overriding yaptığımız metod eğer override notasyonu
    ile yapılınca parentta signutarede değişiklik yaptığımızda hata verir
    ama override notasyonu OLMADAN overridign yaptğımızda ise daha sonra
    parent class da signutare yada silkinme sonucu childdeki metod
    da hata vermez ayrı bir metod olarak childdeki metod devam eder...



     */

    /*

    static olarak işaretlenen metodlar override EDİLEMEZLER
    CHİLD CLASS ta aynı signutare sahip bir metod oluşur
    ama bu ikisi override ilişkisi kurmazlar
    her ne kadar signutare leri aynı olsa da static olarak işaretledikleri
    için biribirinden bağımsız iki farklı metod olarak çalışırlar

    parent class ta static olarak işaretlenmiş bir metodu child
    class icinde aynı signutare kullanılarak static keyword kullanılmadan OLUŞTURMAZSINIZ
    olusturmak istendiğinde CTE verir

     */


    public void method3(){



    }

public static void method4(){

//parenttaki metodla herşeyi aynı olmasına rağmen override edilemez
    //çünkü static keyword ile oluşturulmuş metodlar override edilemz

}

/*
parent class ta final olarak işaretlenen bir metod
Child class ta override eielemez....
 */


}

