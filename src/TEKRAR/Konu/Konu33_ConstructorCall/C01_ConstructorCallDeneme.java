package TEKRAR.Konu.Konu33_ConstructorCall;

public class C01_ConstructorCallDeneme {

    C01_ConstructorCallDeneme(){System.out.println("parametresiz constructor calisti...");}

    C01_ConstructorCallDeneme(int sayi){System.out.println("int parametreli constructor calisti...");}

    C01_ConstructorCallDeneme(String str){
        this();
        System.out.println("string parametreli constructor calisti...");

    }



    public static void main(String[] args) {

        //obje olustrurlup ilk deger atamasının yapılması icin MUTLAKA
        // bir constructor calisir...


        /*
        bir class da signutareleri farklı olmak şartıyla birden
        fazla constructor oluşturulabilir

        Aynı şekilde signutareleri farklı olarak AYNI isimde birden fazla
        method bulunabilir....

        Metod isimleri genel kural: kucuk harfle baslar ve class ismi ile ayni olmaz...
ancak class ismi ile ayni olsa da CTE vermez...
         */
        C01_ConstructorCallDeneme obj=new C01_ConstructorCallDeneme();//parametresiz constructor calisti...
        obj.C01_ConstructorCallDeneme(); //parametresiz metod calisti...


        C01_ConstructorCallDeneme obj3=new C01_ConstructorCallDeneme("selim");


    }

    void C01_ConstructorCallDeneme(){System.out.println("parametresiz metod calisti...");
    C01_ConstructorCallDeneme(3);
    }
    void   C01_ConstructorCallDeneme(int sayi){System.out.println("integer parametretli metod calisti...");}

    //Method name 'C01_ConstructorCallDeneme' is the same as its class
    void   C01_ConstructorCallDeneme(String str){System.out.println("String parametretli metod calisti...");}




}

