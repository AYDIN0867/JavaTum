package ders33_Constructor;

public class C05_Fabrika_Runner {

    public static void main(String[] args) {

     // C04_Fabrika class'indan bir obje oluşturup kullanalım

        C04_Fabrika isci1=new C04_Fabrika(); //kendi classında new C04_Fabrika () adında bir kod
        // bloğu olmadığı için biz buna default constructor deriz..burda amaç java bizim her classdan obje oluşturabilmemiz i
        //için her classa default constructor koyar ve görünmez adı ustunde parametresizdir ve bodysinde kod olmaz
        //bbiz constructor oluşturduğumuzda defaultu siler

        isci1.perIsim="ali";
        isci1.perAdres="Balgat";
        isci1.perTel="5438410532";

        System.out.println(isci1.perIsim);//ali
        System.out.println(isci1.perAdres);//balgat


    }
}
