package Syntax;

public class DynDispDemo {
    public static void main(String[] args) {
        Sup superObj = new Sup();
        Sub1 sub1Obj = new Sub1();
        Sub2 sub2Obj = new Sub2();

        Sup supRef;
        supRef = superObj;
        supRef.vho();

        supRef = sub1Obj;
        supRef.vho();

        supRef = sub2Obj;
        supRef.vho();
    }
}
