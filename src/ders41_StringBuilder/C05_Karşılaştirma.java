package ders41_StringBuilder;

public class C05_Karşılaştirma {

    public static void main(String[] args) {

    String str="Ali";
    StringBuilder sb1=new StringBuilder("Ali");
    StringBuilder sb2=new StringBuilder("Ali");

    //ayni metne sahip olan str,sb1 ve sb2 yi karşılaştıralım


    //1-== ile karşılaştıralım
    /*



     */

       // System.out.println(str==sb1);//Operator '==' cannot be applied to 'java. lang. String', 'java. lang. StringBuilder'
       // java da nonprimitive data türlerinin == ile karşılaştırılmasına izin vermez


        System.out.println(sb1==sb2); //her zaman false döner


     //2- equals ile karşılaştıralım

        System.out.println(str.equals(sb1));//   Result of 'str. equals(sb1)' is always 'false'
        System.out.println(sb1.equals(sb2));//Suspicious call to 'equals()' on 'StringBuilder' object


     //3- compareTo() ile karşılaştırdığımızda

     StringBuilder sb3=new StringBuilder("Java");
     StringBuilder sb4=new StringBuilder("Tava");
     StringBuilder sb5=new StringBuilder("java");
     StringBuilder sb6=new StringBuilder("Hava");
     StringBuilder sb7=new StringBuilder("Tema");
     StringBuilder sb8=new StringBuilder("Java");


        System.out.println(sb3.compareTo(sb4));//java<==tava -10;
        System.out.println(sb3.compareTo(sb5));//Java<==java -32;
        System.out.println(sb3.compareTo(sb6));//Java<==Hava -10;
        System.out.println(sb6.compareTo(sb7));//Java<==Hava -1;
        System.out.println(sb3.compareTo(sb8));//Java<==Hava 0 ;
        // sadece 0 olduğunda metinlerin eşitliğini ifade eder..
        // son satrıdaki metinler eşittir diyor sonuca 0 yazdırarark


    }
}
