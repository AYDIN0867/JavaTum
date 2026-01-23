package TEKRAR.Konu34_StaticKeyWord;

public class C04_StaticVariables {

    static int sayi=20;
    int yas=40;


    public C04_StaticVariables(){

    }

    public void C04_StaticVariables(){

        sayi++;
        yas++;
    }

    public static void main(String[] args) {

        C04_StaticVariables obj1=new C04_StaticVariables();
        C04_StaticVariables obj2=new C04_StaticVariables();



        System.out.println(obj2.sayi+","+ obj2.yas);

/*

int sayi = 20;

System.out.println(sayi++); // 20 yazdırır, sonra 21 olur
System.out.println(++sayi); // önce 22 olur, 22 yazdırır



 */
        //20,40




    }

}

