package interfaces;

public class MyIFImp implements MyIF {
    @Override
    public int getUserID() {
        return 0;
    }

//    @Override
//    public int getAdminID() {
//        return MyIF.super.getAdminID();
//    }

    @Override
    public int getAdminID() {
        return 42;
    }
}
