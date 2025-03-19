package ders41_StringBuilder;

public class C01_StringBuilder {

    public static void main(String[] args) {

       StringBuilder sb1=new StringBuilder();
       //java 16 karakter alabilecek kapasitede ama boş bir sb1 uretir.

        System.out.println("sb1 :"+sb1);//boş bir satır
        System.out.println("sb1 in uzunluğu :"+sb1.length());//0
        System.out.println("sb1 in kapasitesi :"+sb1.capacity());//16
        sb1.append("naamz candir");
        System.out.println("sb1 :"+sb1);//naamz candir
        System.out.println("sb1 in uzunluğu :"+sb1.length());//12
        System.out.println("sb1 in kapasitesi :"+sb1.capacity());//16

        StringBuilder sb2=new StringBuilder(7);
        // java 7 karakter alabilecek kapasitede ama boş bir sb2 uretir

        System.out.println("sb2 :"+sb2);
        System.out.println("sb2 in uzunluğu :"+sb2.length());//0
        System.out.println("sb2 in kapasitesi :"+sb2.capacity());//7

        sb2.append("cem");
        System.out.println("sb2 : "+sb2);
        System.out.println("sb2 in uzunluğu :"+sb2.length());//3
        System.out.println("sb2 in kapasitesi :"+sb2.capacity());//7

        sb2.append(" Bakır");
        System.out.println("sb2 : "+sb2);// cem Bakır
        System.out.println("sb2 in uzunluğu :"+sb2.length());//9
        System.out.println("sb2 in kapasitesi :"+sb2.capacity());//16 (eski kapasite 7x2+2=16)



        StringBuilder sb3=new StringBuilder("Java");

        // java 16+4 (length ==> 20 karakter kapasiteli, içinde "java" bulunan bir sb oluşturur

        System.out.println("sb3 : "+sb3);//java
        System.out.println("sb3 in uzunluğu :"+sb3.length());//4
        System.out.println("sb3 in kapasitesi :"+sb3.capacity());//20


        sb3.append(" ogrenen pisman olmaz.");
        System.out.println("sb3 : "+sb3);//java ogrenen pisman olmaz
        System.out.println("sb3 in uzunluğu :"+sb3.length());//26
        System.out.println("sb3 in kapasitesi :"+sb3.capacity());//42


        // eger size ve length i esitlemek isterseniz, trimToSize() kullanabilirsiniz.


        sb3.trimToSize();
        System.out.println("sb3 : "+sb3);//java ogrenen pisman olmaz
        System.out.println("sb3 in uzunluğu :"+sb3.length());//26
        System.out.println("sb3 in kapasitesi :"+sb3.capacity());//26

/*
tc no:121414114175845

her ne kadar sayilardan oluşşsa da matemematiksel işlemlerde kullanılmayacağı içim String veya StringBuilder olarak tutabiliriz


 */








    }
}
