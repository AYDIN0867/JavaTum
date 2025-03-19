package ders44_Inheritance.D05_DataTypeKullanimi;

import java.util.ArrayList;

public class C05_AvciKuslar extends C04_Kuslar {

    public String hareket="ucarlar";
    public String beslenme="et yerler";
    public String pence="pencelidir";
    public String gaga="sivri gagali ";

    public static void main(String[] args) {

     String str="Vatan candir"; //string bizim için class ama str için dataTürüdür
        ArrayList<String> isimler=new ArrayList<>();

        /*
        String Java'nin oluşturduğu bir Class dir
        ve Aynı zamanda o class dan oluşturulan objeler
        için data türüdür.

        ayni sey java daki tum classlar için gecerlidir

        C05_AvciKuslar bizim için "oluşturduğumuz bir class"dir
        ama ayni zamanda avciKus objesi icin dataTurudur

        C03_Hayvanlar bizim icin "olusturdugumuz bir class" dir
        ama ayni zamanda avciKusHayvani objesi için dataTurudur



         */

        //AvciKuslar Class indan bir obje olusturun

        /*
        bir objenin hangi class'dan oluşturulduğunu
        constructor belirler

        AMMA istersek data türünü olarak parent class secilebilir

        EGER  özellikler variable olarak oluşturulmuşsa  DATA TURU belirleyicidir...


         */




        C05_AvciKuslar avciKartal=new C05_AvciKuslar();



        //avciKartal objesi kullandığı constructor olan C05_AvciKuslar Classnin bir objesidir.
        //avciKartal objesinin data türü eşitliğin sol tarafında yazılan Classdir.yani C05_AvciKuslar dir.
        // java da bir obje data türü olarak PARENT Classlarıda kullanbilir..

        System.out.println(avciKartal.omur);//H yasar ve olurler
        System.out.println(avciKartal.solunum);//K akcigerle nefes alirlar
        System.out.println(avciKartal.cogalma);//K yumurtayla cogalirlar
        System.out.println(avciKartal.kanat);//K kanatlidirlar
        System.out.println(avciKartal.hareket);//A ucarlar
        System.out.println(avciKartal.beslenme);//A et yerler
        System.out.println(avciKartal.gaga);//A sivri gagali
        System.out.println(avciKartal.pence);//A pencelidir

        System.out.println("======================================");


        C04_Kuslar  kusKartal=new C05_AvciKuslar(); //dataTürü kuslar class i olduğundan aramaya d ordan baslar

        System.out.println(kusKartal.omur);//H yasar ve olürler
        System.out.println(kusKartal.solunum);//K  akcigerle nefes alirlar
        System.out.println(kusKartal.cogalma);//K yumurtayla cogalirlar
        System.out.println(kusKartal.kanat);//K kanatlidirlar
        System.out.println(kusKartal.hareket);//H hareket ederler
        System.out.println(kusKartal.beslenme);//H beslenirler bütün kuşlar iel ortak özelliğe bakar çünkü kuskartal variable olarak oluşturlmuştur
        System.out.println(kusKartal.gaga);//K gagaları vardır
      //  System.out.println(kusKartal.pence);// K Ve H clasında olmadığı için CTE verir





        System.out.println("======================================");

        C03_Hayvanlar hayvanKartal=new C05_AvciKuslar();


        System.out.println(hayvanKartal.omur);//H yasar ve olürler
        System.out.println(hayvanKartal.solunum);//H  nefes Alırlar
        System.out.println(hayvanKartal.cogalma);//H cogalirlar
       // System.out.println(hayvanKartal.kanat);//Data türü hayvanlar olduğu için oradan aramaya başaldık ve orda kanat olmadığı için CTE verdi
        System.out.println(hayvanKartal.hareket);//H hareket ederler
        System.out.println(hayvanKartal.beslenme);//H beslenirler bütün kuşlar iel ortak özelliğe bakar çünkü hayvanKartal variable olarak oluşturlmuştur
       // System.out.println(hayvanKartal.gaga);//K gagaları vardır
       // System.out.println(hayvanKartal.pence);// K Ve H clasında olmadığı için CTE verir

//VARIABLE olarak oluşturulan objeler de DATA türü belirleyicidir....
        
        
        // kuslar class 2indan bir obje oluşturalım
        C04_Kuslar kus1=new C04_Kuslar();


        System.out.println(kus1.omur);//H yasar ve olürler
        System.out.println(kus1.solunum);//K  akcigerle nefes alirlar
        System.out.println(kus1.cogalma);//K yumurtayla cogalirlar
        System.out.println(kus1.kanat);//K kanatlidirlar
        System.out.println(kus1.hareket);//H hareket ederler
        System.out.println(kus1.beslenme);//H beslenirler bütün kuşlar iel ortak özelliğe bakar çünkü kus1 variable olarak oluşturlmuştur
        System.out.println(kus1.gaga);//K gagaları vardır
        //System.out.println(kus1.pence);// K Ve H clasında olmadığı için CTE verir
        
        
        
        
        
        
        
        
        
        

        C03_Hayvanlar hayvanKus=new C04_Kuslar();

        System.out.println(hayvanKus.omur);//H yasar ve olürler
        System.out.println(hayvanKus.solunum);//H  nefes Alırlar
        System.out.println(hayvanKus.cogalma);//H cogalirlar
       // System.out.println(hayvanKus.kanat);//Data türü hayvanlar olduğu için oradan aramaya başaldık ve orda kanat olmadığı için CTE verdi
        System.out.println(hayvanKus.hareket);//H hareket ederler
        System.out.println(hayvanKus.beslenme);//H beslenirler bütün kuşlar iel ortak özelliğe bakar çünkü hayvanKus variable olarak oluşturlmuştur
       //  System.out.println(hayvanKus.gaga);//K gagaları vardır
       // System.out.println(hayvanKus.pence);// K Ve H clasında olmadığı için CTE verir



//hayvanlar class indan bir obje oluşturalım
        
        C03_Hayvanlar hayvan1=new C03_Hayvanlar();



       // C04_Kuslar hayvan2=new C03_Hayvanlar();
        // data türü olarak Constructorun olduğu class ın kendisi veya parenteleri secilebilir

        System.out.println(hayvan1.omur);//H yasar ve olürler
        System.out.println(hayvan1.solunum);//H  nefes Alırlar
        System.out.println(hayvan1.cogalma);//H cogalirlar
      //  System.out.println(hayvan1.kanat);//Data türü hayvanlar olduğu için oradan aramaya başaldık ve orda kanat olmadığı için CTE verdi
        System.out.println(hayvan1.hareket);//H hareket ederler
        System.out.println(hayvan1.beslenme);//H beslenirler bütün kuşlar iel ortak özelliğe bakar çünkü hayvan1 variable olarak oluşturlmuştur
       // System.out.println(hayvan1.gaga);//K gagaları vardır
      //  System.out.println(hayvan1.pence);// K Ve H clasında olmadığı için CTE verir
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        


    }








}
