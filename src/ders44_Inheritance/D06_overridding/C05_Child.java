package ders44_Inheritance.D06_overridding;

public class C05_Child extends C04_Parent{

  /*
  Child class ta parent classtan bir methodu override etmek istersek
  öncelikli olarak parent class ile aynı SİGNURATE sahip bir method oluştrulabilir.Signutare farklı olursa
  ismin aynı olması override sağlamaz
   */
 public void beslenme(){

 }

    public void solunum(){


    }


    public void method1(int sayi){ //method1 int

    }

    /*

   override method uluşturmak için @Override notasyonu kullanılabilir
   fakat bu notasyonu kullanmak zorunlu değil

   Override notasyonu intellij tarafından otomatik oluşturulur.bu notasyon parent class taki
   override edilen methodu takip eder eğer silinir veya değiştirilirse override işlemi geçersiz olur
   Bu geçersizlik nedeniyle d @override notasyonu sayesinde CTE verir.

   Notasyon kullanılmayan override işleminde parent class taki method takip edilmez
   silinmesi  yada değişmesi durumunda Overridding özelliği biter fakat kod calışmaya devam eder

   Değişme ya da silinme sonucu CTE verdiren body kısmı değil signutare kısmıdır.


     */
    @Override
    public void method2(int sayi) {

    }

   public void method3(String str){


   }

  /*
  static olarak işaretlenen methodlar override edileemez..child classta aynı signutare sahip bir method
   olusur ama bu ikisi override ilişkisi kurmazlar her ne kadar signutareleri aynı olsa da static isaretlendik
   leri için birbrinden bağımsız iki farklı method olarak çalışırlar

   parent class içinde aynı signutareleri kullanılarak İŞARETLENMİŞ BİR METHODU
   static keyword kullanılmadan OLUŞTURAMAZSINIZ oluşturmaya çalışırsanız CTE verir


   */

    public static void method4(){ //herne kadar parent class daki methodla signutareleri aynı olsada staicler
        // override olamazlar


    }

    /*
        parent class ta final olarak işaretlenen bir method Child class ta override edilemezler
     */
  //  public int method5(){
        //method5()' cannot override 'method5()' in 'ders44_Inheritance. D06_overridding.
        // C04_Parent'; overridden method is fina
   //     return 10;
   // }

   /*
   parent class ta private olarak işaretlenmiş bir method child class ta aynı signutare ile oluşturulabilir
   bu oluşturma override sağlamaz

   private class üyeleri class dısından görülümeyeceği için child class method override etmez
   birbirinden farklı iki method olmuş olur
    */



    public void method6(){


    }




    /*
    overriding için önemli olan signutaredir..

    ve access modifier signutare dahil olmas da overrriding de modifier
    önemlidir.child class taki modifier parent classtaki modifierden daha kısıtlayıcı olmaz

    yani parent class taki default method ancak default ,protected veya public olarak override edilebilir.
    sınırlılık sıralaması private/default/protected/public

         */

    void method7(){
      //default olur
        //protected
        //public yani child yani parentt ile aynı yada daha geniş olmalıdır

    }

    public void method8(){
        //attempting to assign weaker access privileges ('package-private'); was 'protected'
        //parent class taki protected olduğundan burdaki de protected yada public olmalı aksi durumda
        //burda olduğu gibi CTE verir burdaki default çünkü...
        // public i kaldırdığında yerine private yada default yaptığında hata verecektir
    }

    /*
    eger override edilen methodun return-type ı non-primitve ise overriding methodun da return type ı
    ya aynısı olacak yada aralarında IS-A relationship ilişkisi olan bir return type secilmelidir..
    (Covariant) örnek String is Object gibi

    Pirimitive data türlerinde  parent-child ilişkisi olmadığı için Override eden ile
     edilen return Type aynı olamlıdır

     */

    public void method9(){
        // public int method9() methoddaki cte yi düzeltmek için int i void yaptım ki parente uysun
      //ttempting to use incompatible return type
      //parent class daki overriiden methodun return type void
      //child class daki method da void olmak zorunda

    }

   // public double method10(){
        //parent class daki overriiden methodun return type primitive int
        //child class daki method da AYNI PRİMİTİVE data türünde olmak zorunda
    //double int yaparsak hata kalkar ve return da eklemeliyiz int olduğunda




    public String method11(){
        //parent class daki overriiden methodun return type non-primitive String
        //child class daki overridding methodun return type
        //String veya String Child classları olabilir

    return "";
    }

   public Integer method12(){
        //Integer Objectin child classidir..
        return 0;
   }


   public Short method13(){

        return 0;
   }


   // public Short method14(){
        //parent class daki return type Integer
        //short Integerin child classı olamdığından bu method oluşturulamaz
       // return 0;
   // }
    /*
    overriding yapıldığında body si birbirinden farklı olan iki methoddan sadece birisi calışır
    her ikisininde çalışmasını  istiyorsam super.methodIsmi(); kullanılır
    bunu yazarak parentteki methodun da çalışmasını sağlayabiliriz

     */

    @Override
    public void method15() {
        super.method15();
    }
}
