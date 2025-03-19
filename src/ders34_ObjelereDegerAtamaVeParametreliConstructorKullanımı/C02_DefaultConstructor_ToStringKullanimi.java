package ders34_ObjelereDegerAtamaVeParametreliConstructorKullanımı;

public class C02_DefaultConstructor_ToStringKullanimi {

    public static void main(String[] args) {

        /*
        bir class da default constructor kullaniliyorsa olusturulan TUM objeler
        class da atanmis olan ilk degerlerine sahip olur

         */

     // C01 _Araba classindan bir obje oluşturup tum özelliklerini yazdırın

     C01_Araba araba1=new C01_Araba();

        System.out.println(araba1.marka);//toyata
        System.out.println(araba1.model);//Corolla
        System.out.println(araba1.renk);//Kirmizi
        System.out.println(araba1.yil);//2012
        System.out.println(araba1.fiyat);//3000


     // oluşturduğunuz objeye kendi istediğiniz degerleri atayın ve tum ozellikleri tekrar yazdırın

        araba1.marka="opel";
        araba1.model="corsa";
        araba1.renk="mavi";
        araba1.yil=2005;
        araba1.fiyat=2000;
     //şimdi kendi değerlerimizi verdik ve artık ilk classa gitmez verdiğimiz degerleri alır

        System.out.println(araba1.marka);//toyata idi ama şimdi opel yazar
        System.out.println(araba1.model);//Corolla idi ama şimdi corsa yazar
        System.out.println(araba1.renk);//Kirmizi idi ama şimdi mavi yazar
        System.out.println(araba1.yil);//2012 idi ama şimdi 2005 yazar
        System.out.println(araba1.fiyat);//3000 idi ama şimdi 2000 yazar
//java da bir işlemin tekrar tekrar yapılması istenemz ve   oop
// conseptinin amacı budur bir kere yap javaya ögret ve java bunu hep yapsın


    }

}
