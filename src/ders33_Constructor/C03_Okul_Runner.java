package ders33_Constructor;

public class C03_Okul_Runner {


    public static void main(String[] args) {

        //C02_Okul classindan bir obje oluşturup, objeyi kullanalım

        C02_Okul ogrenci1=new C02_Okul();

        System.out.println(ogrenci1.ogrIsim);//atanmamiş

        ogrenci1.ogrIsim="Ali";
        ogrenci1.ogrAdres="çankaya";
        ogrenci1.ogrTel="05322144552";


        System.out.println(ogrenci1.ogrIsim);//Ali
        System.out.println(ogrenci1.ogrAdres);//çankaya
        System.out.println(ogrenci1.ogrTel);//05322144552


        //C02 Okul classindan bir obje deklare edip deger atamasi yapmayalım
        // ve objeyi kullanmaya çalışalım

        C02_Okul ogrenci2;//Variable 'ogrenci2' might not have been initialized

       // System.out.println(ogrenci2.ogrIsim); constructor çalıştırılmadıkça
        // CO2_okul classindan objeyi oluşturup deger atnması yapılamaz
        //ogrenci2 ye deger atanmadığı için kullanmamıza java izin vermez

        C02_Okul ogrenci3=null;
        System.out.println(ogrenci3.ogrIsim);
        //Dereference of 'ogrenci3' will produce 'NullPointerException'
        // null deger değildir her ne kadar hata vermezse de nullpointerexception
        // hatasını run ettiğimizde görürürz


        // CO2_Okul class'indan deklare etmeden bie obje oluşturup kullanalım

        System.out.println(new C02_Okul().ogrIsim);//isim atanmamıs yazdırır

        new C02_Okul().ogrIsim="mehmet"; //constructor çalıştırıldığı
        // için obje oluşur ancak sadece ve sadece o satır için..obje deklare edilip
        //constructor calışırsa obje sorunsuz kullanılır
        //obje deklare edilip constructor çalışmazsa obje oluşturulmuş olmaz
        //dolayısıyla objenin hiçbir özelliği KULLANILMAZ

        // obje deklare edilmeden constructor çalışırsa objenin bir ismi olmaz
        //sasdece oluşturulduğu satırda kullanılır sonraki satırda obje çöp olu


    }
}
