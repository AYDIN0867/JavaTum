package TEKRAR.Konu.Konu31_Constructor;

public class C05_FabrikaRunner {

    public static void main(String[] args) {

        //C04_Fabrika class'indan bir obje oluşturulup kullanalım

        C04_Fabrika isci1=new C04_Fabrika();
        isci1.perIsim="Ali";
        isci1.perAdres="Balgat";
        isci1.perTel="543454545";

        System.out.println(isci1.perIsim);
        System.out.println(isci1.perTel);
        System.out.println(isci1.perAdres);






    }










}
