package TEKRAR.Konu.Konu45_DataTypeKullanımı;

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








    }





}
