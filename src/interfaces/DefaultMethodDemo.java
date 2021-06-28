package interfaces;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        System.out.println("user id " + obj.getUserID());
        System.out.println("admin id " + obj.getAdminID());
    }
}
