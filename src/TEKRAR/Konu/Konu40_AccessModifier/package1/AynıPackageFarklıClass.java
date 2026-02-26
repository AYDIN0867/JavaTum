package TEKRAR.Konu.Konu40_AccessModifier.package1;

public class AynıPackageFarklıClass {

static private int sayPrivate;
static String strDefaultAccMod;
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



    public static void main(String[] args) {

    }


}
