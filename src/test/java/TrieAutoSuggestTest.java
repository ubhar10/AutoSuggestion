import autosuggest.TrieAutoSuggest;
import org.junit.Assert;
import org.junit.Test;

public class TrieAutoSuggestTest {
  @Test
  public void autoSuggestTest1() {
    TrieAutoSuggest as = new TrieAutoSuggest();
    as.addWordToStructure("Hello");
    as.addWordToStructure("Hellp");
    Assert.assertEquals(as.getAutoSuggestWords("Hel").size(), 2);
  }

  @Test
  public void autoSuggestTest2() {
    TrieAutoSuggest as = new TrieAutoSuggest();
    as.addWordToStructure("Hello");
    as.addWordToStructure("Hellp");
    String[] testResult = {"Hello", "Hellp"};
    Assert.assertArrayEquals(as.getAutoSuggestWords("Hel").toArray(), testResult);
  }

  @Test
  public void autoSuggestTest3() {
    TrieAutoSuggest as = new TrieAutoSuggest();
    Assert.assertEquals(as.getAutoSuggestWords("Hel").size(), 0);
  }
}
