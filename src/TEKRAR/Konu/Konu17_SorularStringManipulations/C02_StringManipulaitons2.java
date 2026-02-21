package TEKRAR.Konu.Konu17_SorularStringManipulations;

public class C02_StringManipulaitons2 {
    public static void main(String[] args) {


        // Kullanicidan belirli bir formatta verdiği String fiyatlari toplayip yazdirin...

        // input1 : "15.30 €", input2: "11.45 € "
        // output : 26.75 €
        // Not: sondaki para birimi degisken olamalidir...



        String fiyatStr1= "15.30 €";
        String fiyatStr2= "11.45 €";

        int ilkSpaceIndex=fiyatStr1.indexOf(" ");//5
        String paraBirimi=fiyatStr1.substring(ilkSpaceIndex);

        fiyatStr1=fiyatStr1.replaceAll("\\D","");
        fiyatStr2=fiyatStr2.replaceAll("\\D","");



        double fiyat1=Double.parseDouble(fiyatStr1)/100;
        double fiyat2=Double.parseDouble(fiyatStr2)/100;

        System.out.println("fiyatların toplamı : "+(fiyat1+fiyat2)+paraBirimi);


    }
}
