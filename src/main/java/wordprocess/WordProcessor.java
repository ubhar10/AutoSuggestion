package wordprocess;

import java.util.*;

import java.io.File;
/*
 * This class helps in populating the words from different format files
 */
public abstract class WordProcessor {

    public List<String> getParsedList(String fileName) throws Exception {
        List<String> result = new ArrayList<String>();
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource(fileName).getFile());
            ;
            Parser parser = null;
            parser = createParser(file);
            result = parser.parse();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /*
    An abstract method which should be implemented by different format files.
     */
    public abstract Parser createParser(File file);
}
