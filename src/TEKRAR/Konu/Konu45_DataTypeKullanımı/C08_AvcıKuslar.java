package TEKRAR.Konu.Konu45_DataTypeKullanımı;

import ders44_Inheritance.D05_DataTypeKullanimi.C06_HayvanlarMethod;
import ders44_Inheritance.D05_DataTypeKullanimi.C08_AvciKuslarMethod;

public class C08_AvcıKuslar extends C07_Kuslar {

    public void hareket(){System.out.println("ucarlar");}

    public void beslenme (){System.out.println("ucarlar");}

    public void pence (){System.out.println("pencelidirler");}

    public void gaga  (){System.out.println("sivri gagalı");}

    public static void main(String[] args) {



        /*

        eger özellikler METOD olarak oluşturlmuş ise
        yine aramaya data Turu olan Class'dan baslarız

        ANCAK bulduktan sonra,
        Constructor oldugu Class'a kadar,
        DAHA GUNCE  bilgi var mı diye kontrol ede3riz...


        data class ından aramaya basladıgından
        özelliği bulamazsa CTE verir zaten daha günceli olup olmadıgını
        metod un yanınna gelen yukarı aşağı oklar gösterir


         */

        //Avci kuslar class ından bir obje olusturun

        C08_AvcıKuslar avciKartal=new C08_AvcıKuslar();
        avciKartal.omur();//H yasar ve olurler
        avciKartal.solunum();//K akcigerle nefes alırlar
        avciKartal.cogalma();//K yumurtayla cogalırlar
        avciKartal.kanat();//K kanatlıdırlar
        avciKartal.hareket();//A ucarlar
        avciKartal.beslenme();//A et yerler
        avciKartal.gaga();//divri gagalı
        avciKartal.pence();// A pencelidirler

        System.out.println("=========================");

       C07_Kuslar kusKartal=new C08_AvcıKuslar();

        kusKartal.omur();//H yasar ve olurler
        kusKartal.solunum();//K akcigerle nefes alırlar
        kusKartal.cogalma();//K yumurtayla cogalırlar
        kusKartal.kanat();//K kanatlıdırlar
        kusKartal.hareket();//A ucarlar
        kusKartal.beslenme();//A et yerler
        kusKartal.gaga();//sivri gagalı
      //  kusKartal.pence();// önce bulacak sonra günceline bakacak metodlarda
      //bulamadığı için CTE verdi


        System.out.println("=========================");

        C06_HayvanlarMetod hayvanKartal=new C08_AvcıKuslar();

        hayvanKartal.omur();//H yasar ve olurler
        hayvanKartal.solunum();//K akcigerle nefes alırlar
        hayvanKartal.cogalma();//K yumurtayla cogalırlar
        //hayvanKartal.kanat();//K hayvanlar class ında yok hiç bulamazsa günceline bakamaz
        hayvanKartal.hareket();//A ucarlar
        hayvanKartal.beslenme();//A et yerler
        //hayvanKartal.gaga();//hayvanlar class ındakihayvan kartal icin gaga metodu yok
        //hayvanKartal.pence();

//eger CTE vermiyorsa hepsi aynı guncel bilgiye sahiptirler...



 /*
 OZELLIKLER VARIABLE OLARAK OLUŞTURULMUŞSA DATA TURU TEK BELIRLEYICIDIR
 AYNI DATA TURUNE SAHIP OBJELER AYNI OZELLIKLERI GOSTERIR
 OZELLIKLER METOD OLARAK OLUSUTURULMUSSA SADEE DATA TURUDNEGIL CONSTRUCTOR DA
 ETKILIDIR
 ONEMLİ NOT: AYNI CONSTRUCTOR A SAHIP OBJELER
 YA AYNI OZELLIKLERI GOSTERIRLER YA DA CTE VERIRLER

  */

//KUSLAR class ından bir obje olusturalım...

C07_Kuslar kus1=new C07_Kuslar();

        kus1.omur();//H yasar ve olurler
        kus1.solunum();//K akcigerle nefes alırlar
        kus1.cogalma();//K yumurtayla cogalırlar
        kus1.kanat();//K kanatlıdırlar
        kus1.hareket();//H hareket ederler
        kus1.beslenme();//H beslenirler
        kus1.gaga();//gagalıdırlar
        //kus1.pence();// olmadıgı ıcın CTE verir

//gunceli aranırken consrtructor a kadar gider daha
// günceli olmaz oda default super ile parent class a giderler

        C06_HayvanlarMetod hayvanKus=new C07_Kuslar();

        hayvanKus.omur();//H yasar ve olurler
        hayvanKus.solunum();//K akcigerle nefes alırlar
        hayvanKus.cogalma();//K yumurtayla cogalırlar
       // hayvanKus.kanat();//yok CTE verir
        hayvanKus.hareket();//H hareket ederler
        hayvanKus.beslenme();//H beslenirler
     //   hayvanKus.gaga();//gagalıdırlar
     //   hayvanKus.pence();// olmadıgı ıcın CTE verir


    }





}
