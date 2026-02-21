package TEKRAR.Konu.Konu24_Scope;

public class C04_InstanceVariableObjeIleKullan {
    String srtI;
    static  String strS="Ali";
    int sayiI=10;
    static int sayiS;
    char chrI;
    static char chrS='#';
    boolean blI=true;
    static boolean blS;




    public static void main(String[] args) {

      //static alanda instance variable kullnılamaz...
      //kullnamak istediğinizdde onje oluştuturulacak..

      C04_InstanceVariableObjeIleKullan obj=new C04_InstanceVariableObjeIleKullan();
        System.out.println(obj.srtI);
        System.out.println(obj.chrI);

        obj.sayiI=45;
        System.out.println(obj.sayiI);





    }

    public static void metod1(){


    }

    public  void metod2(){


    }
}
