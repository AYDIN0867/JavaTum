package ders03_DataCasting;

public class C03_ExplicitNarrowing_Datakaybi {

    public static void main(String[] args) {


     // aşağıdaki sayilari bir int variableye atayip yazdiralim

        double db1=34.01;
        double db2=45.99;
        float fl1=23.7f;


        int sayi=(int)db1;
        System.out.println("34 .01 in int a cast edilmiş hali: " +sayi);//34 // ondalıklı bir satı
        // int e explicit narrowing yapılırsa ondalıklı kısım atılır

        sayi=(int)db2;
        System.out.println("45.99 un int a cast edilmiş hali: " +sayi);//45

sayi=(int)fl1;
        System.out.println("23 .7 in int a cast edilmiş hali: " +sayi);



// asagidaki sayilari byte data türünde bir variable'a atayıp yazdırın

        int sayi1=29;
       byte byt1=(byte)sayi1;
        System.out.println("29 un byte a cast edilmiş hali :" +byt1);//29



       short sayi2=130;
        byte byt2=(byte)sayi2;
        System.out.println("130 un byte a cast edilmiş hali :" +byt2);// byte  ın
        // değeri -128 ile 127 arasındadır sonuc -126 yazdırır



        long sayi3=140;
        byte byt3=(byte)sayi3;
        System.out.println("140 ın byte a cast edilmiş hali :" +byt3);// byte  ın
        // değeri -128 ile 127 arasındadır sonuc -116 yazdırır


        float sayi4=258.5F;

        byte byt4=(byte)sayi4;
        System.out.println("258.5f un byte a cast edilmiş hali :" +byt4);// byte  ın
        // değeri -128 ile 127 arasındadır sonuc 256 da sıfırlanır ve 2  yazdırır

        double sayi5 =530;

        byte byt5=(byte)sayi5;
        System.out.println("530 un byte a cast edilmiş hali :" +byt5);//18


    }
}
