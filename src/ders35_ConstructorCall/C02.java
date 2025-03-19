package ders35_ConstructorCall;

public class C02 {

    String isim="Ali";
    int sayi=40;

    C02(){
        System.out.println("parametresiz constructor calisti");
        C02();

    }

    C02(int sayi){

        this();
        System.out.println("int parametreli constructor calisti");
        this.sayi=sayi;

    }

   C02(String isim){
       System.out.println("int parametreli constructor calisti");
       this.C02();
       this.isim=isim;
       sayi=20;

   }

    public static void main(String[] args) {

        C02 obj3=new C02("leyla");
        System.out.println(obj3.isim);
        System.out.println(obj3.sayi);
//int parametreli constructor calisti
//parametresiz method calisti
//leyla
//20



        //   C02 obj2=new C02(3);
 //    System.out.println(obj2.isim);
  //   System.out.println(obj2.sayi);
/*
parametresiz constructor calisti
parametresiz method calisti
int parametreli constructor calisti
Ali
3



 */


      //  C02 obj1=new C02();
        //parametresiz constructor calisti
        //parametresiz method calisti

    }

   void C02(){
        System.out.println("parametresiz method calisti");
    }

}
