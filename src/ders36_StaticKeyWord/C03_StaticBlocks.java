package ders36_StaticKeyWord;

public class C03_StaticBlocks {

/*
 static blocklar class calişmaya baslarken herseyden
 (hatta main methoddan bile önce çalışırlar

 kullanım amacı class calişmaya baslamadan önce yapılması
 gereken ayarlamalar varsa onları yapmaktır

 */



  C03_StaticBlocks(){

      System.out.println("Constructor calisit");
  }

    public static void main(String[] args) {

        System.out.println("main method calisti");

C03_StaticBlocks obj=new C03_StaticBlocks();
//tatic block1 calisti
//static blok2 calisti
//main method calisti
//Constructor calisit


    }


    public static void method1(){

        System.out.println("method calisti");

    }

        static {
        System.out.println("static block1 calisti");
    }


    static {

        System.out.println("static blok2 calisti"); //önce statik blok1 sonra static blok2 ve sonra da main method çalışır
    }


    {

        System.out.println("static olmayan calıştı");//constructardan bir adım öndedir static olmayan kod bloğu çalışır...
    }

}
