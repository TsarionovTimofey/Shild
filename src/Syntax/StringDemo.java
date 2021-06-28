package Syntax;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = new String("In Java strings are objects");
        String str2 = "Нou can create them in different ways";
        String str3 = new String(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
