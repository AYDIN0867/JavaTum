package TEKRAR.Konu.Konu39_StringBuilder;

public class C01_StringBuilder {

    public static void main(String[] args) {


        /*
           Class               Mutability         Multı Thread                            hiz
        1- String              Immutable
        2- StringBuilder       Mutable           Multi Thread calismayı desteklemez      Daha hizlidir
        3- StringBuffer        Mutable           Multi Thread calismayı destekler        daha YAvastir


         */

/*
String Builder 3 farklı sekilde olusturulabilir...

 */

        StringBuilder sb1=new StringBuilder();
//java 16 karakter alabilecek  kapasitede ama BOŞ bir sb üretir...

        System.out.println("sb1 :"+sb1);//hiçlik
        System.out.println("sb1 in uzunlugu :"+sb1.length());//0
        System.out.println("sb1 in kapasitesi :"+sb1.capacity());//16
        sb1.append("umut hayatttır");//stringBuillder mutable dir metodlarla değiştirilebilir...
        System.out.println("sb1 :"+sb1);//umut hayattır
        System.out.println("sb1 in uzunlugu :"+sb1.length());//14
        System.out.println("sb1 in kapasitesi :"+sb1.capacity());//16





        StringBuilder sb2=new StringBuilder(7);


        StringBuilder sb3=new StringBuilder("Umut");





    }
}
