package ders03_DataCasting;

public class C05_CharDataTurundeDataCasting {
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


        // ascii table bütün karakterlerin sayısal değerini verir

       // chr=bl;
      //  chr=(char) bl;// true bu olmaz true nin neresini char edeyim çünkü metinsel bir data türü blooen
        chr=(char)byt;
        chr=(char)shrt;
        chr=(char)sayiInt;
        chr=(char)lng;
        chr=(char)flt;
        chr=(char)dbl;//4.5 un 4 değerine bakar
       // chr=(char)str;// str de casting olmaz çünkü metinsel bir data türü string







    }
}
