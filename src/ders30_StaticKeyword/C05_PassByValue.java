package ders30_StaticKeyword;

public class C05_PassByValue {

    // verilen metni buyuk harfe çevripi
    //geri döndüren bir mthod oluşturun


    public static void main(String[] args) {

        String metin="Java";

        System.out.println(buyukYaziDondur(metin));//JAVA

        System.out.println("method call dan sonra metin "+ metin);// Java




    }

    public static String buyukYaziDondur(String metin){

        metin=metin.toUpperCase();

        return metin; //JAVA

    }
}
