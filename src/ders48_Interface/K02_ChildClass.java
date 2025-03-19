package ders48_Interface;

public  class K02_ChildClass extends K01_ParentAbstractClass implements I03_ParentInterface1,I04_ParentInterface2 {



    public void boyut(){
        /*
       3 parent'da da abstract void boyut method u var
       3 ü de abstract oldugundan
       child class consrete boyut method u olusturdugunda
       3 parent in da boyut() beklentisini karşılamış olur

         */

    }

    public String isim(){

        /*
        her nekadar Abstract class da isim method u concrete olsa da abstract class
        interface'lerin childi değil interfacelerden sonra gelen ilk concrete class
        parent interfacelerdeki abstract kalmis methodlari concrete'lestirmislerdir


         */

        return null;
    }

    public double gramaj(){
        /*
        Eger farklı 2 parent interface'de ayni isim ama farklı return type sahip methodlar
        varsa iki parentin dediğini aynı anda yapma sansımız olmaz
        bu durumda ya interface müdahale edip değistirmek gerekir (tavsiye edilmez)
        ya da iki interface den birini implement etmekten vazgeceriz...
         */

        return 0;
    }

    public static void main(String[] args) {

        System.out.println(I03_ParentInterface1.sayi1);

    }





}
