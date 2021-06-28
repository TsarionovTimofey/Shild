package Syntax;

public class ErrorMsg {
    static final int OUTERR = 0;
    static final int INERR = 1;
    static final int DISKERR = 2;
    static final int INDEXERR = 3;
    static final String msgs[] = {
            "Output error",
            "Input error",
            "No disk space available",
            "Index going out of range"
    };

    static String getErrorMsg(int i) {
        if (i >= 0 & i < msgs.length)
            return msgs[i];
        return "Non-existent error code";
    }
}
