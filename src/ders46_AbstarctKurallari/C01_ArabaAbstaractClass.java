package ders46_AbstarctKurallari;

public abstract class C01_ArabaAbstaractClass {

    //bu class arabalarin barindırması gerekeken zorunlu parçaları
    // ve iisteğe bağlı olarak bulundurmasıni istediğimiz özellikleri belirlesin

    //klima
    //===> zorunlu olmmalı, concrete method
    public void klima(){
        System.out.println("arabalar isterlerse klimali olabilirler");
    }
    //motor
    //eğer araba yapıyorsak motor zorunlu olmalı
    public abstract void motor();

    // sase
    //==> zorunlu
    public abstract void sase();

    //sunroof
    //==> zorulu değil ,consrete method

    public void sunroof(){
        System.out.println("arabalar isterlerse sunroof barindirirlar");
    }


    /*
    child classlar oluşturulduktan sonra
    araba class ına 2 method daha eklemek gerekti

     */

    //gösterge==> zorunlu abstract method
    public abstract void gosterge();

    //deri kaplama koltuk ==>zorunlu değil

    public void deriKoltuk(){

        System.out.println("Arabalar isterlerse deri koltuk kullanablir");
    }


}
