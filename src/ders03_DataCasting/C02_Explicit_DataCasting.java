package ders03_DataCasting;

public class C02_Explicit_DataCasting {

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


        // peki bir variableye kendisinden daha deniş data türü ndeki bir değer atanabilir mi?
        // bu işlemi java otomatik yapmaz
        //sorumluluğu bizim almamızı ister// SAYI TÜRÜNDEKİLER EXPLİCİT YAPILA BİLİR AMA BOOLEAN VE STRİNG OLMAZ


        byt=(byte)shrt;//23   burada sorumluluğu alarak yaptığımız
        // data casting işlrmine explicit narrowing denir
        byt=(byte) sayiInt;//30
        byt=(byte)lng;//40
        byt=(byte) flt;
        byt=(byte) lng;

        // boolean veya String data türündeki bir variable'a
        //baska data türündeki değerleri ATAYAMAYIZ




    }
}
