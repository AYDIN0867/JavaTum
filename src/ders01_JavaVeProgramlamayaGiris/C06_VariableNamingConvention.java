package ders01_JavaVeProgramlamayaGiris;

public class C06_VariableNamingConvention {

    public static void main(String[] args) {

        int yas=40;
        int YAS=40;
        int YaS=40;

        // genel olraak variable isimleri kucuk harfle baslar
       //  ama  buyuk harfle baslansa da java bunu hata olarak algılamaz

        System.out.println(YaS);//40
        System.out.println(yas);//40

        // isim olarak java da tanımlı keywordler kullanılamaz
       // int int=45; hata verir
        // ama

        int int1 =45;// yazılabilir

        int ogrencisinYasi=12;// camel case kullanırız






    }
}
