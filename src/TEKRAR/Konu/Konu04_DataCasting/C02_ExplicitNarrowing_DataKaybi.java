package TEKRAR.Konu.Konu04_DataCasting;

public class C02_ExplicitNarrowing_DataKaybi {
    public static void main(String[] args) {

//asagidaki sayilari int bir variable'a atayip yazdirin...

  double db1=34.01;
  double db2=45.99;
  float fl1=23.7F;


  int sayInt=(int)db1;
  int sayi=(int)db2;//burada explicit narrowing yaptık...

        System.out.println("34.01 in integere Cast edilen degeri : "+ sayInt); //34
        System.out.println("45.99 in integere Cast edilen degeri : "+ sayi); //45

        //asagidaki sayilari byte data turunde bir variable 'a atayip yazdirin...

        int sayi1=29;
        byte byt1=(byte)sayi1;
        System.out.println("29 in byte Cast edilen degeri : "+ byt1); //29
        short sayi2=130;
        byt1=(byte)sayi2;
        System.out.println("130 un byte Cast edilen degeri : "+ byt1); //-116


        long sayi3=140;
        byt1=(byte) sayi3;
        System.out.println("140 ın byte Cast edilen degeri : "+ byt1); //-126



        float sayi4=258.5F;
        byt1=(byte) sayi4;
        System.out.println("258.5 ın byte Cast edilen degeri : "+ byt1); //256=0 sonuc 2


        double sayi5=530;
        byt1=(byte)sayi5;
        System.out.println("530 un byte Cast edilen degeri : "+ byt1); //512=0 sonuc 18









    }
}
