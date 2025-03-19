package ders47_Abstraction;

public abstract class C04_KuralciArabaClass {

    /*

    bu class arabaların arabaların mutlaka bulundurması gereken özellikelri ve
    opsiyonel olarak bulundurabilirecekleri özellikelri belirlesin

    zorunlu olmayan özellikler için parent class da simdiye
     kadar kullandığımız methddlar kullanılabilir

     zorunlu özellikleri belirlemek için

     1- öncelikle clasın kural koyuxucu olduğu nu abstract ile deklare etmeliyiz
     2- zorunlu methodları da abstract  keyword ile belirlemeliyiz
     3-

     */

    public abstract void fren();  //zorunlu
        //Abstract method in non-abstract clas


    public abstract void motor();//zorunlu
    //Abstract method in non-abstract clas

    public abstract void aku();//zorunlu
//Abstract method in non-abstract clas


    public void sunroof(){//zorunlu değil

        System.out.println("arabların sunroofu olabilir");


    }

    public void klima(){//zorunlu değil

        System.out.println("arabların klima olabilir");

    }

}
