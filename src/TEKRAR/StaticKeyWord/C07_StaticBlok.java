package TEKRAR.StaticKeyWord;

public class C07_StaticBlok {


C07_StaticBlok(){

    System.out.println("Constructor Calisti");
}


    public static void main(String[] args) {

        System.out.println("main metod calisit...");

        C07_StaticBlok obj=new C07_StaticBlok();
    }

   public static void metod1(){

       System.out.println("metod calisti...");
   }

   static {

       System.out.println("statik blok calişti...");
   }

//statik bloglara class çalışmadan önce atama yapılamsı gereken
    //variable varsa yada database bağlantısı yapacaksak class ı
    //çalışması için  ön ayarlama gerektiğinde yapılır...

 static {

     System.out.println("statik block2 calisti...");
 }




}


