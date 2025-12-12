package TEKRAR.Konu24_Scope;

public class C03_ClassLevelVariables {
    //class level variableler class içinde ama kod bloklarının dışında oluşturulur...
    //her class variable static ise heryerde kullanılır static olmayanlara instance denir...
    // class levelde oluşturulan varaiable nin direkt kullanılmasını static keyword une baglidir...
// instance variablle'ler static olmadıklarından secim hakkı metod a gecer eger metod static ise benim sınırlarımın icine static olmayanlar giremez
    //eger metod da static değilse instance variabşelar direkt metod içinde kullanılabilir tabi class seviyesinde oluşturulmuş ise...
    String srtI;
    static  String strS="Ali";
    int sayiI=10;
    static int sayiS;
    char chrI;
    static char chrS='#';
    boolean blI=true;
    static boolean blS;

    public static void main(String[] args) {
//locak variableler static OLAMAZ...

        System.out.println(strS);
        System.out.println(sayiS);
        sayiS=45;
        System.out.println(sayiS);
        System.out.println(chrS);
        System.out.println(blS);
       // System.out.println(strI);


    }

public void metod2(){

    System.out.println(strS);
    System.out.println(sayiS);

    sayiI=12;


}


}
//class seviyesinde deklare edilen variablelere ister static olsun ister instancer olsun değer atama zorunlu değil...java hata vermez...
//java belirlenmiş degerleri atar (default) string için null sayısal(integer) primitive icin o primitive bolean icin false char icin hiçliktir
