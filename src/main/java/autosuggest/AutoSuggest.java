package autosuggest;

import java.util.List;

public interface AutoSuggest {
    public void addWordToStructure(String word);
    public List<String> getAutoSuggestWords(String prefix);

}
