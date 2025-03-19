package ders43_encapsulation;

public class C06_RunnerGetterSetterBirlikte {

    public static void main(String[] args) {

     C05_GetterSetterBirlikteKullanma obj=new C05_GetterSetterBirlikteKullanma();

        System.out.println(obj.sayiPublic);
        obj.sayiPublic=40;
        System.out.println(obj.sayiPublic);//40

        System.out.println("==============================");

       // obj.sayiPrivate=200; bunun için setter kullanacağız
       // System.out.println(obj.sayiPrivate);//bunun için getter kullanacağız
        //private olduğu için gettter veys setter kullanmadan yapamayız

        System.out.println(obj.getSayiPrivate());//100
        obj.setSayiPrivate(200);// yeni değer atadık
        System.out.println(obj.getSayiPrivate());//200


        //bir variableyi public yapmak ile privateyi
        // getter ve setter yapmak arasında işlevsellik anlamında bir fark yoktur
        //degerin getirildiğine veya atandığına
        // vurgu yapmak için pirivate yapıp getterr ver setter yapılur

    }
}
