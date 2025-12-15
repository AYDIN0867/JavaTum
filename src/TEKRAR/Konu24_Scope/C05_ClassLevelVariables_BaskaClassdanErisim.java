package TEKRAR.Konu24_Scope;

public class C05_ClassLevelVariables_BaskaClassdanErisim {
    public static void main(String[] args) {

       /*
       Bir class dan başka class daki METODLARA ve CLASS LEVEL variablelere ulaşabiliriz...
       HER nekadar ulaşılma mümükünse de doğrudan ulaşım yoktur dogru yöntemi bilmeliyiz...

        */

   //kural 1 baska classdan variable veya metodu direk kullnamayız...
   //static class üyeleri classIsmi.classuyeismi seklinde kullnaıla bilir

        System.out.println(C04_InstanceVariableObjeIleKullan.blS);

   // static olmayan metodlar ve instance variableler  ise obje üzerinden
   //kullanılabilirler...

   C04_InstanceVariableObjeIleKullan obj=new C04_InstanceVariableObjeIleKullan();

   obj.metod2();


    }
}
