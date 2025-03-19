package ders44_Inheritance.D05_DataTypeKullanimi;

public class C08_AvciKuslarMethod extends C07_KuslarMethod{

    public void hareket(){System.out.println(  "ucarlar"   );}
    public void beslenme(){System.out.println(  "et yerler"   );}
    public void pence(){System.out.println(  "pencelidirler"   );}
    public void gaga(){System.out.println(  "sivri gagali"   );}


    public static void main(String[] args) {



//burada özellikler method olarak oluşturulmuştur
        // ve böylece aramaya Data Türünden baslarız

        //ANCAAAAKKKK bulduktan sonra, CONSTRUCTOR UN olduğu
        // DAHA GÜNCEL BİLGİ VAR MI DİYE KONTROL EDERİZ

        // data class indan aramaya basladığında ozelliği
        //bulamazsa CTE verir guncele bakmaz


        //avci kuslar classindan bir obje olustruun...

        C08_AvciKuslarMethod avciKus1=new C08_AvciKuslarMethod();
        avciKus1.omur();//H yasar ve olurler
        avciKus1.solunum();//K akcigerle nefes alırlar
        avciKus1.cogalma();// K yurtayla cogalırlar
        avciKus1.kanat();//K kanatlıdır
        avciKus1.hareket();//A ucarlar
        avciKus1.beslenme();//A et yerler
        avciKus1.gaga();//A sivri gagalı
        avciKus1.pence();//A pencelidir


        System.out.println("=====================================");
        
        //kuslar Class ından bir obje oluşturalım
        
        C07_KuslarMethod kus2=new C08_AvciKuslarMethod();
        kus2.omur();//H yasar ve olurler
        kus2.solunum();//K akcigerle nefes alırlar
        kus2.cogalma();// K yurtayla cogalırlar
        kus2.kanat();//K kanatlıdır
        kus2.hareket();//A ucarlar
        kus2.beslenme();//A et yerler
        kus2.gaga();//A sivri gagalı
        //kus2.pence();//A pencelidir kuşlar ve hayvanlar clasıında olmadığı için güncelde olsa dahş cte c verir
        //önce aranan bulunacak sonra günceline bakılacak

        System.out.println("==================================");
        
        //data türünü hayvanlar classından secerek bir obje oluşturalım
        
        C06_HayvanlarMethod hayvanKus=new C08_AvciKuslarMethod();

        hayvanKus.omur();//H yasar ve olurler
        hayvanKus.solunum();//K akcigerle nefes alırlar
        hayvanKus.cogalma();// K yurtayla cogalırlar
       // hayvanKus.kanat();//CTE
        hayvanKus.hareket();//A ucarlar
        hayvanKus.beslenme();//A et yerler
       // hayvanKus.gaga();//CTE
        //hayvanKus.pence();//CTE
        
        /*
        
        AYNI CONSTRUCTTOR A SAHİP objeler ya aynı özelliklidir ya da CTE verir
        
        
        
         */
        
        
       //kuşlar classından bir obje oluşturalım
       
       C07_KuslarMethod kus1=new C07_KuslarMethod();

        kus1.omur();//H yasar ve olurler
        kus1.solunum();//K akcigerle nefes alırlar
        kus1.cogalma();// K yurtayla cogalırlar
        kus1.kanat();//K kanatlıdır
        kus1.hareket();//H hareket ederler
        kus1.beslenme();//H beslenirler
        kus1.gaga();//k gagaları vardir
       // kus1.pence();//K VE H DE YOK cte VERİRLER


        System.out.println("================================");

        C06_HayvanlarMethod hayvanKus1=new C07_KuslarMethod();

        hayvanKus1.omur();//H yasar ve olurler
        hayvanKus1.solunum();//K akcigerle nefes alırlar
        hayvanKus1.cogalma();// K yurtayla cogalırlar
        //hayvanKus1.kanat();//H Class inda olmadığı için CTE verir
        hayvanKus1.hareket();//H hareket ederler
        hayvanKus1.beslenme();//H beslenirler
        //hayvanKus1.gaga();//H Class inda olmadığı için CTE verir
        //hayvanKus1.pence();//H Class inda olmadığı için CTE verir

        System.out.println("================================");
        
        C06_HayvanlarMethod hayvan1=new C06_HayvanlarMethod();

        hayvan1.omur();//H yasar ve olurler
        hayvan1.solunum();//H nefes alırlar
        hayvan1.cogalma();// H cogalırlar
       // hayvan1.kanat();//H Class inda olmadığı için CTE verir
        hayvan1.hareket();//H hareket ederler
        hayvan1.beslenme();//H beslenirler
       // hayvan1.gaga();//H Class inda olmadığı için CTE verir
       // hayvan1.pence();//H Class inda olmadığı için CTE verir
        
        
        
        
        
        
        
        
        

    }

    
    

}
