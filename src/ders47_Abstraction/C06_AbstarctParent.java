package ders47_Abstraction;

public abstract class C06_AbstarctParent {

    /*
    abstract classlar özel classlardır...biz kodlarımızın calışması için mutlak
    mana da abstract class olmalı ndiyeceğimiz bir durum yok ancak eğer child classların mutlaka bulundurması gereken
    methodları belirlemek istiyorsak abstraction kullanmak zorundayız

    abstract classların amacı child classların bulundurmak zorunda olduğu özellikleri yani methodları belirlemektir
     //abstract bir class dan obje oluşturulurulamaz

     abstract classlardan değil child classlardan obje oluşturulabilir

     */



   //child classların mutlaka bulundurması gereken
    // method1 method2 ve method3 methodlarını oluşturun

 public abstract void method1();
 public abstract void method2();
 public abstract void method3();
 //child classların isterse olşrurabileceği method4 ve method5 oluşturn

 public void method4(){
     System.out.println("parent method4 calişti");
 }
 public void method5(){
     System.out.println("parent method5 calişti");
 }

    public static void main(String[] args) {

     //abstract bir class dan obje oluşturulur mu

        //C06_AbstarctParent obj1=new  C06_AbstarctParent();
        //C06_AbstarctParent' is abstract; cannot be instantiated



    }




}
