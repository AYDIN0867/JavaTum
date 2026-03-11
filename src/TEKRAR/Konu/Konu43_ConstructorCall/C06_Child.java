package TEKRAR.Konu.Konu43_ConstructorCall;

public class C06_Child extends C05_P {

    C06_Child (){
        super("Ali");
        System.out.println("C parametresiz constructor calisti");


    }

    C06_Child (String s){
        super(5);
        System.out.println("String parametreli constructor calisti");


    }

    C06_Child(int a){

        super();
        System.out.println("C int parametreli constructor calisit");

    }

    public static void main(String[] args) {

       // C06_Child child1=new C06_Child(10);
        //super(); default olarak parametresiz
//main metoddan başlar
// int 10 parametresini alacak constructor call var mı bakılır
// ki var C06_Child (int a) ya gider
//obje oluşturmadan extend avr mı diye sorar
// ki burda class extend kullandığından ilk satırda mutlaka constructor
//call var mı bakar hiç bi şey yoksa default olarak super() vardır
//bu super de önce  parent class daki parametersiz constructor çalışssın demektir
//parent class da parametersiz class var adı da C05_(){
// "P parametresiz class çalıştı"}
//hemen parent class ındada extend varmı diye bakılır baktık ki
//var ve deriz ki ilk satırda mutlaka parametresiz constructor call
//yani super(); olamlıdır...
//görünürde yok ama varsayılan olarak super();  vardır görünmezdir
//ama vardır
//tekrra bakarız extend var mı yok artık super için bakmaya gerek yoktur
//şimdi objeyi oluştururuz...

        C06_Child child2=new C06_Child();
        //1. olarak main metod çalışır
        //2. olarak obje oluşturulacak
        // paramertesiz constructor çalışssın diyor child2
        //bakıyoruz var mı evet var...
        //işte bu ;
        /*
        C06_Child (){
        super("Ali");
        System.out.println("C parametresiz constructor calisti");

    }

//şimdi bu class extend içeriyormu içeriyor o zaman
//ilk satırda paramerresiz constructor call olmalı ve var
//super("Ali");
//this(); içinde bulundugu class daki parametresiz constructor a götürür
//java nın default olarak koydugu parametresizdir...

         */


    }
}

//extend key word ile parent yapıldıgında
//mutlaka constructor calll olmalıdır
//hiç birşey yoksa super () constructor call default olarak vardır

/*

1-Java extends keyword kullnaılan bir class daki
her constructor'ın ilk satirinda CVonstructor Call
olmasını zorunlu kılmıştır...

2- Kodu yazan kişi ilk satira constructor CAll
KOYMAZSA java ototmotik default olarak
super(); koyar

3- Java'nin koydugu super();
hangi constructor'ın icinde olursa olsun
parametresizdir...

4- Child class'da bir obje olusturdugumuzda
constructor lar super(); mekanizması sayesinde
extends kullanmayan ilk class a otomatik olarak gider

5- extends kullanmayan class'a ulasabildiginde
obje olusturulur... ve her class daki ilk calısan constructor
o class daki instance variableler ve degerlerinin
birer kopyasını alıp objeye yapıstırır...

6-eger constructor variable a atama yaparken
o variable daha önceki parentlarda olusturlmussa
o variable'i yeni olusturmaz, update eder boylece
 child class'a kadar variablelere en GUNCEL atanmış olur

7-Kodu yazanlar super(ilgiliParametreler) yerine
this (ilgili Parametreler) de kullanabilir...
super()==> parent class'daki constructor
this()==> icinde olunan class'daki constructor ları cagirir...














 */