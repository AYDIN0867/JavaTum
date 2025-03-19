package ders30_StaticKeyword;

public class C02_OGRETMENRUNNER {


    public static void main(String[] args) {

        C01_Ogretmen ogretmen1=new C01_Ogretmen();


        System.out.println(ogretmen1.okul);
        //Static member 'ders30_StaticKeyword.
        // C01_Ogretmen. okul' accessed via instance reference

        System.out.println(C01_Ogretmen.okul);//Yildiz koleji
        //static variableye static obje ile ulaşılır

        ogretmen1.Isim="Fadime";
        ogretmen1.soyIsıim="Tuna";
        ogretmen1.adres="ulus";

        C01_Ogretmen ogretmen2=new C01_Ogretmen();

        System.out.println(ogretmen2.okul);
        //Static member 'ders30_StaticKeyword.
        // C01_Ogretmen. okul' accessed via instance reference

        ogretmen2.Isim="ayşenur";
        ogretmen2.soyIsıim="saraçoğlu";
        ogretmen2.adres="kizilay";
        ogretmen2.okulAdresi="Kizilay";

        ogretmen2.okul="Saraç koleji";
        ogretmen2.okulAdresi="kizilay"; //variableler static
        // olduğı için değiştirilebilir

        System.out.println(ogretmen1.Isim);//fadime
        System.out.println(ogretmen1.okul);// Sarac Koleji
        System.out.println(ogretmen1.okulAdresi);//kizilay


        C01_Ogretmen ogretmen3=new C01_Ogretmen();
        ogretmen3.Isim="nihan";
        ogretmen3.soyIsıim="yilmaz";
        ogretmen3.adres="çankaya";
        ogretmen3.okul="yilmaz koleji";
        ogretmen3.okulAdresi="çankaya";


        System.out.println(ogretmen1.Isim);//fadime
        System.out.println(ogretmen1.okul);// yilmaz koleji
        System.out.println(ogretmen1.okulAdresi);//çankaya



    }

}
