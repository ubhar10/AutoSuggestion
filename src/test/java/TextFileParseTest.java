import wordprocess.TextFile;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class TextFileParseTest {
  @Test
  public void parseTest() {
    String fileName = "TextCorpus.txt";
    ClassLoader classLoader = getClass().getClassLoader();
    File file = new File(classLoader.getResource(fileName).getFile());
    ;
    TextFile textFileParse = new TextFile(file);
    String[] result = {"Hello", "Hi", "This", "What"};

    Assert.assertArrayEquals(textFileParse.parse().toArray(), result);
  }
}
