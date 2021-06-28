package lambda;

public class LambdaArgumentDemo {
    static String changeString(StringFunction stringFunction, String string) {
        return stringFunction.function(string);
    }

    public static void main(String[] args) {
        String inString = "Lambda extend java";
        String outString;
        System.out.println("Input string: " + inString);
        StringFunction reverse = (string) -> {
            String result = "";
            for (int i = string.length() - 1; i >= 0; i--) result += string.charAt(i);
            return result;
        };
        outString = changeString(reverse, inString);
        System.out.println("Reverse string are: " + outString);

        outString = changeString((string) -> string.replace
                (' ', '-'), inString);
        System.out.println("String with changes: " + outString);

        outString = changeString((string) -> {
            String result = "";
            char ch;
            for (int i = 0; i < string.length(); i++) {
                ch = string.charAt(i);
                if (Character.isUpperCase(ch)) result += Character.toLowerCase(ch);
                else result += Character.toUpperCase(ch);
            }
            return result;
        }, inString);
        System.out.println("String with reverse case " + outString);

    }

}
