package wordprocess;

import java.io.File;

public class TextFileProcessor extends WordProcessor {
    @Override
    public Parser createParser(File file) {
        return new TextFile(file);
    }
}
