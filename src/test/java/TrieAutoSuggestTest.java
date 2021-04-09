import autosuggest.TrieAutoSuggest;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TrieAutoSuggestTest {
    private ArrayList<String> testResult = new ArrayList<String>();
  @Test
  public void autoSuggestTest1() {
    TrieAutoSuggest as = new TrieAutoSuggest();
    testResult.add("Hello");
    testResult.add("Hellp");
    as.addWordList(testResult);
    Assert.assertEquals(as.getAutoSuggestWords("Hel").size(), 2);
  }

  @Test
  public void autoSuggestTest2() {
    TrieAutoSuggest as = new TrieAutoSuggest();
    testResult.add("Hello");
    testResult.add("Hellp");
    as.addWordList(testResult);
    Assert.assertArrayEquals(as.getAutoSuggestWords("Hel").toArray(), testResult.toArray());
  }

  @Test
  public void autoSuggestTest3() {
    TrieAutoSuggest as = new TrieAutoSuggest();
    Assert.assertEquals(as.getAutoSuggestWords("Hel").size(), 0);
  }
}
