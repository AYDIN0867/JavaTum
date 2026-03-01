package TEKRAR.Konu.Konu41_Encapsulation;

public class C06_Runner {

    public static void main(String[] args) {

        /*

        Bir variableyi public yapmak ile
        private yapıp getter ve setter i birlikte olusturmak
        arasında işlevsel olarak fark kalmaz...

yapılan işleme VURGU yapıldıgından bazi developerler
public yapmak yerine bu yontemi tercih ederler...

         */


   C05_GetterSetterBirlikteKullanma obj=new C05_GetterSetterBirlikteKullanma();

        System.out.println(obj.sayiPublic);
        obj.sayiPublic=40;
        System.out.println(obj.sayiPublic);


        System.out.println("====================");

        System.out.println(obj.getSayiPrivate());
        obj.setSayiPrivate(200);
        System.out.println(obj.getSayiPrivate());

    //kodlama da bazı yerlerde getrildiği
        //bazı yerlerde atama yapıldığına vurgu için getter setter kullanılır
//bir variableye erişim yetkisini read ve write olarak ayırmak icin kullanılır
// data direk erişimi private acces modififer ile kapsule alırız..

//ımmutable class hiç setter koymazsak class ımmutable olur...
//bir class encapsulate ile getter ile yaaprsak ımmutable olur
//return yapanlar getter dır atama yapanlar setter dır

    }
}
