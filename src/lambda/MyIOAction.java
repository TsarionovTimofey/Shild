package lambda;

import java.io.IOException;
import java.io.Reader;

public interface MyIOAction {
    boolean ioAction(Reader reader) throws IOException;
}
