package TEKRAR.Konu.Konu45_DataTypeKullanımı;

import java.util.ArrayList;

public class C05_AvcıKuslar extends C04_Kuslar {

    public String hareket="ucarlar";
    public String besleme="et yerler";
    public String pence="penceleri vardır";
    public String gaga="sivri gagali";

    public static void main(String[] args) {

        String str= "Java candir"; //String str icin data turudur
        //ama genel anlamda bizim için class dır
        ArrayList<String> isimler=new ArrayList<>();

    /*

    String Java nın olusturdugu bir classdır ve AYNI ZAMANDA
    o class dan olusturulan objeler ıcın DATA turudur...
    aynı sey Java daki tum classla ıcın gecerlidir

    C05_AvciKuslar bizim icin "olusturdugumuz bir class"dır
    ama ayni zamanda avci objesi için data turudur

    C04_Kuslar "olsturdugumuz bir class"dır
    ama aynı zamanda avcı objesi icin data turudur...

    eger özellikler variable olarak olusturmussa
    DATA TURU tek belirleyicidir...

     */

    C05_AvcıKuslar avciKartal1=new C05_AvcıKuslar();

//avciKartal objesi kullnadıgı constructor C05_AvciKuslar
//CLASS ının bir objesidir...
//avcikartal objesinin data turu C05_AvciKuslar class ıdır..yanı esitliğinsol tarafındaki classdır
//javad a bir obje data turu olarak parent classları da kullanbilir
//


        System.out.println(avciKartal1.omur); //yasar ve olurler
        System.out.println(avciKartal1.solunum);//K akcigerle nefes alırlar
        System.out.println(avciKartal1.cogalma);//K yumurtayla cogalırlar
        System.out.println(avciKartal1.kanat);//Kkanatlidirlar
        System.out.println(avciKartal1.hareket);//A ucarlar
        System.out.println(avciKartal1.besleme);//A et yerler

        System.out.println(avciKartal1.gaga);//A  sivri gagali
        System.out.println(avciKartal1.pence);//A penceleri vardır

        System.out.println("===========================================");

        C04_Kuslar kusKartal1=new C05_AvcıKuslar();

        System.out.println(kusKartal1.omur); //Hayvanlar ...
        System.out.println(kusKartal1.solunum);//Kuslar..
        System.out.println(kusKartal1.cogalma);//K
        System.out.println(kusKartal1.kanat);//K
        System.out.println(kusKartal1.hareket);//H
        System.out.println(kusKartal1.besleme);//H
        System.out.println(kusKartal1.gaga);//K
       // System.out.println(kusKartal1.pence);//
        //C04_Kuslar classından yukarıya doğru yani parent classına
        //doğru baktıgımızda pence variablesi olmadıgı için CTE alırız


        System.out.println("=========================================");

        C03_Hayvanlar hayvanKartal1=new C05_AvcıKuslar();
//hayvanKartal objesi C05_AvcıKuslar class
// ından oluşturmuştur ama data turu C03_Hayvanlar class ı dır
//kodlama C03_Hayvanlardan baslar
        System.out.println(hayvanKartal1.omur); //Hayvanlar ...
        System.out.println(hayvanKartal1.solunum);//H..
        System.out.println(hayvanKartal1.cogalma);//H
        //System.out.println(hayvanKartal1.kanat);// olmadıgı için CTE cevir
        System.out.println(hayvanKartal1.hareket);//H
        System.out.println(hayvanKartal1.besleme);//H
        //System.out.println(hayvanKartal1.gaga);//olmadıgı için CTE
        //System.out.println(kusKartal1.pence);//olmadıgı için CTE

        //kuslar class ından bir obje olusturun...
        C04_Kuslar kus1=new C04_Kuslar();
        //kus1 objesinin data turu C04_Kuslardır ve bu belirleyicidir

        System.out.println(kus1.omur); //Hayvanlar ...
        System.out.println(kus1.solunum);//Kuslar..
        System.out.println(kus1.cogalma);//K
        System.out.println(kus1.kanat);//K
        System.out.println(kus1.hareket);//H
        System.out.println(kus1.besleme);//H
        System.out.println(kus1.gaga);//K
        // System.out.println(kusKartal1.pence);//


        //eger özellikler variable ile belirlenmişşse
//yani metod ile belirlenmemiş ise data turu belirleyicidir
//yani hayvanKus objesinde data turu C03_hayvanKus dur
        C03_Hayvanlar hayvanKus=new C04_Kuslar();

        System.out.println(hayvanKus.omur); //Hayvanlar ...
        System.out.println(hayvanKus.solunum);//H..
        System.out.println(hayvanKus.cogalma);//H
        //System.out.println(hayvanKus.kanat);// olmadıgı için CTE cevir
        System.out.println(hayvanKus.hareket);//H
        System.out.println(hayvanKus.besleme);//H
        //System.out.println(hayvanKartal1.gaga);//olmadıgı için CTE
        //System.out.println(kusKartal1.pence);//olmadıgı için

      //Hayvanlar class ından bir obje olusturun....

        C03_Hayvanlar hayvan1=new C03_Hayvanlar();
        //data turu C03_Hayvanlar class ı ise C03_Hayvanlar
        System.out.println(hayvan1.omur); //Hayvanlar yasar ve olurler
        System.out.println(hayvan1.solunum);//H..nefes alırlar
        System.out.println(hayvan1.cogalma);//H.. cogalırlar
        //System.out.println(hayvan1.kanat);// olmadıgı için CTE cevir
        System.out.println(hayvan1.hareket);//H
        System.out.println(hayvan1.besleme);//H
        //System.out.println(hayvanKartal1.gaga);//olmadıgı için CTE
        //System.out.println(kusKartal1.pence);//olmadıgı için

        //C04_Kuslar hayvan2=new C03_Hayvanlar();
       //data turu olarak constructrırn oldugu class ın kendisi veya
       //parentları secilebilir...











    }



}
