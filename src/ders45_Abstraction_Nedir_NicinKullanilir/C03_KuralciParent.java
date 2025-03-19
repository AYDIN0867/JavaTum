package ders45_Abstraction_Nedir_NicinKullanilir;

public abstract class C03_KuralciParent {

    /*
    java da parent class olması planlanan bir class olusturuldugunda
    Parent class kendisini parent edinecek child classlarin mutlaka override
    etmesini istediği methodlari BELİRLEYEBİLİR

     */
    /*
    1- Oncelikle KURAL KOYABİLMEK İÇİN kural koyan bir class olduğumuzu DEKLARE etmeliyiz
    2- Bu deklarasyonu yapmak için class'i ABSTRACT olarak tanimlariz

         */

    /*

    2- child classlarin MUTLAKA override etmesini istediğiniz methodlari abstarct method olarak oluştururuz
    örneğin bu class da olan methdod 1 vemethod2 yi child classlar override etsin diyorsak bu methodları abstract method olarak
    oluşturacağız
     */
    //abstrcat methods cannot have a body
    public abstract void method1();//bu bir abstaract methoddur ama concrete gibi curly braces yoktur çünkü body olmaz
   // public abstract void method1 () i bir not cümlesi olarak şöyle okuruz;
   //C03 class'ini parent edinen her class Mutlaka method2(){} ve method1(){} override etmelidir

   public abstract int method2();

   /*

   3- child classlarin istediği gibi kullanmasınıa izin verdiğimiz methodları concrete yani somut olarak oluştururuz
   abstract yazmıyorsa method concrete dir...

   ornegin: Child classlarin inheritance cercevesinde kullanabilecekleri
   yani isterlerse direk parent classda kullanacakları,isterlerse ed over ride edip kendilerine uyarlayabilecekleri
   method3 ve nethod4 olusturalım
    */

    public void method3(){};
    public int method4(){

        return 0;
    };

    /*

    concrete methodlar child classlarda istenirse override edilir
    istenirse de override edilmeden direkt parent class dan kullanılır..
     */


}
