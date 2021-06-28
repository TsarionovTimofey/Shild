package annotations;

@Deprecated
public class MyClass {
    private String message;

    public MyClass(String message) {
        this.message = message;
    }

    @Deprecated
    public String getMessage() {
        return message;
    }
}
