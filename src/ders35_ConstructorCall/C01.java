package ders35_ConstructorCall;

public class C01 {

    /*
    Bir class da signutare lari farkli olmak sartıyla birden fazla constructor olabilir

    Ayni sekilde signutareleri farklı olmak sartıyla AYNI isimde birden fazla method bulunabilir

    Method isimleri icin genel kural: kucuk harfle baslar ve class ismi ile ayni olmaz ancak class
    ismi ile ayni olsa da java CTE vermez


     */

 C01(){

     System.out.println("parametresiz constructor calisti");
 }

 C01(int sayi){

     C01("Ali");// method calldur

     System.out.println("int parametreli constructor calisti");
 }

 C01(String str){

     this();
     System.out.println("string parametreli constructor calisti");
 }

    public static void main(String[] args) {


     C01 obj2=new C01("selim");

    // C01 obj2=new C01(4);

     //bir constructoriçinden başka bir constructor çağırmak istediğimizde
        //constructor ismini değil this () parantez yazarız


    // C01 obj=new C01();//parametresiz constructor calisti

       // obj.C01();//parametresiz method calisti



        }

  void   C01(){System.out.println("parametresiz METHOD calisti");
      C01(3);//int parametreli METHOD calisti
 }// method name C01 is the same as its class name

  void   C01(int sayi){System.out.println("int parametreli METHOD calisti");}//// method name C01 is the same as its class name


void  C01(String str){System.out.println( "String parametreli METHOD çalıştı" );
}








}
