package ders48_Interface;

public class N01_ChildOfInterface implements M01_ParentInterface{





    public static void main(String[] args) {


        M01_ParentInterface.method7();
        N01_ChildOfInterface obj=new N01_ChildOfInterface();
        obj.method6();




    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public String method4() {
        return "";
    }

    @Override
    public int method5() {
        return 0;
    }
}
