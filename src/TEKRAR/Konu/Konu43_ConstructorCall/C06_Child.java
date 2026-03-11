package TEKRAR.Konu.Konu43_ConstructorCall;

public class C06_Child extends C05_P {

    C06_Child (){
        super("Ali");
        System.out.println("C parametresiz constructor calisti");


    }

    C06_Child (String s){
        super(5);
        System.out.println("String parametreli constructor calisti");


    }

    C06_Child(int a){

        super();
        System.out.println("C int parametreli constructor calisit");

    }

}

//extend key word ile parent yapıldıgında
//mutlaka constructor calll olmalıdır
//hiç birşey yoksa super () constructor call default olarak vardır
