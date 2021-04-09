package autosuggest;

import java.util.List;

public interface AutoSuggest {
    public void addWordList(List<String> word);
    public List<String> getAutoSuggestWords(String prefix);

}
