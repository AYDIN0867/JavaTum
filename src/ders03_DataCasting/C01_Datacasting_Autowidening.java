package ders03_DataCasting;

public class C01_Datacasting_Autowidening {
    public static void main(String[] args) {


        boolean bl=true;
        char chr='a';
        byte byt=24;
        short shrt=24;
        int sayiInt=30;
        long lng=40;
        float flt=3.5F;
        double dbl=4.5;
        String str="Merhamet İyidir";

        int sayi2=sayiInt;
        // int data türündeki bir değeri
        // yine int data türündeki bir variable'a atama yaparsak
        // bu data casting olmaz ,Atama olur

        // bir variableyi baska data türündeki bir deger ATANABILIR MI?

//        bl=chr;//'a'
//        bl=byt;//24
//        bl=shrt//23;
//        bl=sayiInt//30
        // bl=str;//"merhamet iyidir"

        // bir variableyi baska data türündeki bir deger ATANABILIR MI?
         // evet atanabilir eğer kapsamı büyük olan küçüğü içine alabilir

        // byte a hiçbiri sığma
        // shrt a byte siğar
        // int a byte ve short sığar
        //long a byte short int girer
        // data casting mümkündür kova örneği ve buna auto widening denir
















    }
}
