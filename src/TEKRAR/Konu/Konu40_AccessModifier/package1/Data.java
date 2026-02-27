package TEKRAR.Konu.Konu40_AccessModifier.package1;

public class Data {

static private int sayPrivate;
static String strDefaultAccMod;//Default Acces Modifier Var
static protected char chrProtected;
static public double dblPublic;

private  static void metodPrivate(){
    System.out.println("Private Metod Calıştı...");
}

static void methodDefaultAccMod(){
    System.out.println("Default access modifier sahip method calisti...");

}

protected static void methodProtected(){
    System.out.println("Protected metod calıştı");
}


public static void methodPublic(){
    System.out.println("public metod çalıştı");

}

    public static void main(String[] args) {

        System.out.println(sayPrivate);
        metodPrivate();

        System.out.println(strDefaultAccMod);
        methodDefaultAccMod();

        System.out.println(chrProtected);
        methodProtected();

        System.out.println(dblPublic);
        methodPublic();



    }


}
