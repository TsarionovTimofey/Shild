package Syntax;

public class Err {
    String msg;
    int severity;

    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}