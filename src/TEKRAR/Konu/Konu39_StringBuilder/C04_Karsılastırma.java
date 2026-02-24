package TEKRAR.Konu.Konu39_StringBuilder;

public class C04_Karsılastırma {
    public static void main(String[] args) {

    String str="Aşi";
    StringBuilder sb=new StringBuilder("Ali");
    StringBuilder sb1=new StringBuilder("Ali");

    //aynı metne sahip olan str, sb ve sb1 i karşılaştıralım...

       // System.out.println(str==sb);//Operator '==' cannot be applied to 'java.lang.String', 'java.lang.StringBuilder'
/*
java non-primitive data turlerinın farklı data turelrinin  ==ile   karşılaştırılamsına izin vermez
StringBuilderler metin aynı olsa da eşit eşitte false doner
 */

//2- equals () metodu ile karşılaştırma...

        System.out.println(str.equals(sb));//false
        //Result of 'str.equals(sb)' is always 'false'
        //'equals' between objects of inconvertible types 'String' and 'StringBuilder'

        System.out.println(sb.equals(sb1));//false
//Suspicious call to 'equals()' on 'StringBuilder' object

        System.out.println(sb.equals(sb));//true sadece kendisi ile karşılaştırmada ture diğerlerinde false verir


    }
}
