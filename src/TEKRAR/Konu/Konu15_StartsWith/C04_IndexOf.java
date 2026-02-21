package TEKRAR.Konu.Konu15_StartsWith;

public class C04_IndexOf {
    public static void main(String[] args) {

        String str = "çok calismam lazım, çok";

        // str "calis" iceriyor mu
        System.out.println(str.contains("calis")); //true

        //str "calis" ile mi basliyor?
        System.out.println(str.startsWith("calis"));//false

        // str "calis" ile mi bitiyor?
        System.out.println(str.endsWith("calis"));//false

        //PEKIIII bu "calis" cumlenin neresinde?
        System.out.println(str.indexOf("calis"));//4

        // str da kullanılan ilk a nin indexi
        System.out.println(str.indexOf("a"));//5

        // str da kullaılan ilk "cok" un index i
        System.out.println(str.indexOf("çok"));//0

        // str da ilk a nın indeksi nin 5 oldugu biliniyorsa
        // ikinci  a nın indeksi nedir

        System.out.println(str.indexOf("a", 6));//10

        // str da kullanılan "cok" un index inin 0 oldugu biliniyorsa
        // str da kullanılan ikinci cok un index i nedir?

        System.out.println(str.indexOf("çok", 1));//20

//yoksa -1 doner......




    }
}
