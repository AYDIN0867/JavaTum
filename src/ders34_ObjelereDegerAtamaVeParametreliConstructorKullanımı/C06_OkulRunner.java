package ders34_ObjelereDegerAtamaVeParametreliConstructorKullanımı;

public class C06_OkulRunner {

    public static void main(String[] args) {

        //C05_Okul classindan bir obje oluşturup, objeyi kullanalım

        C05_Okul ogr1=new C05_Okul();

        System.out.println(ogr1);
        //C05_Okul{ogrIsim='isim atanmadı', ogrAdres='Adres atanmadı', ogrTel='tel atanmadı', ogrSube='sube atanmadı'}

        // oluşturduğunuz objeye kendi istediğiniz degerleri atayın

      ogr1.ogrIsim="Ali";
      ogr1.ogrAdres="kızılay";
      ogr1.ogrTel="5438415032";
      ogr1.ogrSube="5-C";

        System.out.println(ogr1);
//C05_Okul{ogrIsim='Ali', ogrAdres='kızılay', ogrTel='5438415032', ogrSube='5-C'}

        C05_Okul ogr2=new C05_Okul("veli cem","balgat","5432541412");

        System.out.println(ogr2);//C05_Okul{ogrIsim='veli cem', ogrAdres='balgat', ogrTel='5432541412', ogrSube='sube atanmadı'}



//tum bilgileri parametre olarak gönderebileceğimiz bir constructor oluşturun
        //oluşturdugunuz yeni constructor ile bir obje oluşturun ve tum özellikleri yazdırın


        C05_Okul ogreci4=new C05_Okul("melih ayn","kızılay","23456654","9-D");

        System.out.println(ogreci4);
        //C05_Okul{ogrIsim='melih ayn', ogrAdres='kızılay',
        // ogrTel='23456654', ogrSube='9-D'}

    }


}
