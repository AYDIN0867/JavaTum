package ders44_Inheritance.D03_ConstructorCall;

public class C06_Child extends C05_P {

  C06_Child(){
      super("Ali");
      System.out.println("Child parametresiz constructor calisti");
  }

  C06_Child(String s){
      super(5);
      System.out.println("child String parametreli constructor calisti ");

  }

  C06_Child (int a){

      //super();

      System.out.println("Child int parametreli constructor calisti");

  }

    public static void main(String[] args) {

     // C06_Child child1=new C06_Child(10);
      /*
      gp parametresiz constructor calisti
      Parametresiz constructor calisti
      Child int parametreli constructor calisti

       */


      //C06_Child child2=new C06_Child();
/*
gp parametresiz constructor calisti
Parametresiz constructor calisti
P String parametreli constructor calisti
Child parametresiz constructor calisti


 */


       // C06_Child child3=new C06_Child("Ali");
/*
        GP int parametreli constructor calisti
        gp string parametreli constructor calisti
        P int parametreli constructor calisti
        child String parametreli constructor calisti


 */


       /*
       1- java extends keyword kullanan bir class daki her constructor in
       ilk satırında Constructor call olmasını ZORUNLU kılmıştır

       2- Kodu yazan kisi ilk satira
       constructor Call koymazsa
       java otomatik olarak super(); koyar

       3- javanin koyduğu super ();
       hangi constructor in içinde olursa olsun parametresizdir

       4- child class da bir obje oluşturduğumuzda
       constructorlarda super (); mekanizması sayesinde
       extends kullanmayan ilk class a kadar otomatik olarak gider

       5-extends kullanmayan class a ulaşıldığında obje
       oluşturulur,ve her classdaki ilk calışan constructor
       o class daki instance variablelar ve degerlerinin
       birer kopyasını alıp objeye yapıstırır

       6- eger constructor variable a atama yaparken
       o variable daha onceki parentlarda oluşturulmuşsa
       o variable i yeni oluşturmaz update yapar

       böylece child class a kadar variable lara
       en güncel değer atanmış olur

       7- kodu yazanlar super (ilgiliparametreler) yerine
       this (ilgiliParametreler) de kullanılabilir.
       super() ==> parent class daki  constructor
       this()===> icinde olunan class daki constructorlari cagirir





        */




    }

}
