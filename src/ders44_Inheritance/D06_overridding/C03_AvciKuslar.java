package ders44_Inheritance.D06_overridding;

public class C03_AvciKuslar extends C02_Kuslar {

    public void hareket(){System.out.println(  "ucarlar"   );}
    public void beslenme(){System.out.println(  "et yerler"   );}
    public void pence(){System.out.println(  "pencelidirler"   );}
    public void gaga(){System.out.println(  "sivri gagali"   );}

    public static void main(String[] args) {

        C03_AvciKuslar avciKartal=new C03_AvciKuslar();
        avciKartal.hareket();//A ucarlar

        C02_Kuslar kusKartal=new C03_AvciKuslar();
        kusKartal.hareket();//A ucarlar


    }

}
