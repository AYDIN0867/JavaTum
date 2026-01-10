package TEKRAR.Konu32_ParametreliConstructor;

public class C02_DefaultConstructorToStringKulanımı {
    public static void main(String[] args) {

        /*
        Bir class da default constructor kullanılıyorsa
        olusturulan TUM objeler class'da atanmıs olan ilk degerlerine sahip olur
         */

     //C01_Araba class'indan bir obje olusturup tum özelliklerini yazdirin...

        C01_Araba araba1=new C01_Araba();
        System.out.println(araba1.model);//Corolla
        System.out.println(araba1.marka);//Toyota


    }
}
