package Syntax;

public class ErrorInfo {
    String msgs[] = {
            "Output error",
            "Input error",
            "No disk space available",
            "Index going out of range"
    };
    int howbad[] = {3,3,2,4};

    Err getErrorInfo(int i) {
        if (i >= 0 & i < msgs.length)
            return new Err(msgs[i], howbad[i]);
        return new Err ("Non-existent error code",0);
    }
}
