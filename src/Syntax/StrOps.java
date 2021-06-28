package Syntax;

public class StrOps {
    public static void main(String[] args) {
        String str1 = "Java - lead of the internet";
        String str2 = new String(str1);
        String str3 = "Java strings are effective";
        int result, idx;
        char ch;
        System.out.println("Length str1: " + str1.length());

        for (int i = 0; i < str1.length(); i++)
            System.out.print(str1.charAt(i));
        System.out.println();

        if (str1.equals(str2)) System.out.println("str1 is equal to str2");
        else System.out.println("str1 is not equal str2");

        if (str1.equals(str3)) System.out.println("str1 is equal to str3");
        else System.out.println("str1 is not equal str3");

        result = str1.compareTo(str3);
        if (result == 0)
            System.out.println("str1 equal str3");
        else if (result < 0)
            System.out.println("str1 less str3 ");
        else
            System.out.println("str1 more str3");

        str2 = "One Two Three One";
        idx = str2.indexOf("One");
        System.out.println("Index of the first occurrence One: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Index of the last occurrence One: " + idx);
    }
}
