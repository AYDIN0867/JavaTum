package TEKRAR.Konu32_ParametreliConstructor;

public class C06_OkulRunner_ParametreliConstructor {

    public static void main(String[] args) {

        // C05'okul class ından bir obje olusturup tum özellikleri yazalım


        C05_Okul ogrenci1=new C05_Okul();

        System.out.println(ogrenci1);
//C05_Okul{ogrIsim='isim atanmamis', ogrAdres='adres atanmamis', ogrTel='tel atanmamis', ogrSube='sube atanmamis'}

ogrenci1.ogrIsim="Ali Can";
ogrenci1.ogrAdres="Cankaya";
ogrenci1.ogrTel="05323243434";
ogrenci1.ogrSube="5-C";

        System.out.println(ogrenci1);

//C05_Okul{ogrIsim='Ali Can', ogrAdres='Cankaya', ogrTel='05323243434', ogrSube='5-C'}


//argument olarak  isim, adres, ve telefon ile obje olustruan bir constructor
//olusturdugumuz yeni constructor ile obje olusturun ve tum özellikleri yazdırın...

C05_Okul ogrenci2=new C05_Okul("Veli Cem","Balgat","054345465656");


        System.out.println(ogrenci2);
//C05_Okul{ogrIsim='Veli Cem', ogrAdres='Balgat', ogrTel='054345465656', ogrSube='sube atanmamis'}

        C05_Okul ogr3=new C05_Okul("Ayse Han","Yildiz","0878898");
        System.out.println(ogr3);
//C05_Okul{ogrIsim='Ayse Han', ogrAdres='Yildiz', ogrTel='0878898', ogrSube='sube atanmamis'}

    }





}
