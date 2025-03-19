package ders29_ConstructorTekrar;

public class C03_Runner {

    public static void main(String[] args) {

        C02_Doktor doktor1=new C02_Doktor();

        System.out.println(doktor1.isim);//

        doktor1.isim="Kemal";
        doktor1.soyisim="yılmaz";
        doktor1.adres="çankaya";

        System.out.println(doktor1.adres);//çankaya


        C02_Doktor doktor2=new C02_Doktor(); //C02_Doktor () bu  bir constructordır






    }
}
