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
        System.out.println(avciKartal1.solunum);


        C04_Kuslar kusKartal1=new C05_AvcıKuslar();
        C03_Hayvanlar hayvanKartal1=new C05_AvcıKuslar();


    }




}
