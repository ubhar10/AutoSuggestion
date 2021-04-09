package autosuggest;

import java.util.List;

public interface AutoSuggest {
    void addWordList(List<String> word);
    List<String> getAutoSuggestWords(String prefix);

}
