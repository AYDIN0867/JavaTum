package TEKRAR.Konu.Konu43_ConstructorCall;

public class C03_Corsa extends C02_Opel{

    String model="Corsa";
    String kasa="Corsa kasasi";
    String motor="vvdi";
    String lastik="15 inc Pirelli";

    String uretimYeri="Almanya";
    String aku="volta aku";

    public static void main(String[] args) {

        C03_Corsa corsa1=new C03_Corsa();
        System.out.println(corsa1.aku);//volta aku
        System.out.println(corsa1.model);//Co


        // child class dan olusuturulan bir obje
        // sadece kendi class'ındaki ozelliklere değil
        // parent classlardaki özelliklere de sahip olurlar

        System.out.println(corsa1.marka);//Opel
        System.out.println(corsa1.guvenlik);//dgs1001




    }




}
