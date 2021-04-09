import autosuggest.AutoSuggest;
import autosuggest.TrieAutoSuggest;
import wordprocess.TextFileProcessor;
import wordprocess.WordProcessor;

import java.util.ArrayList;
import java.util.List;

public class App {
    //Enum for different file types
    enum FileType {
        TXT // for text file
    }

    enum SuggestionStructure
    {
        TRIE // using Trie to store the current words
    }

    public static void main(String[] args) {
        String fileName = "TextCorpus.txt";
        List<String> wordToAdd = new ArrayList<String>();
        WordProcessor createWordProcessor = createNewWordProcessor(fileName, FileType.TXT);
        try {
            // Get all the words from the file
            wordToAdd = createWordProcessor.getParsedList(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*
         * Build the auto suggestion structure
         */

        AutoSuggest as = createAutoSuggestStructure(SuggestionStructure.TRIE);
        for (String word : wordToAdd) // Add all the words to the Trie
            as.addWordToStructure(word);

        System.out.println("Word with prefix He " + as.getAutoSuggestWords("H"));
    }

    /*
    * Get the required file type processor to process the file
    */
    private static WordProcessor createNewWordProcessor(String fileName, FileType fileType) {
        if (fileType == FileType.TXT) // return the required File type Processor
            return new TextFileProcessor();
        return null;
    }

    /*
     * Get the required structure to build auto suggestion feature
     */

    private static AutoSuggest createAutoSuggestStructure(SuggestionStructure requestedStructure)
    {
        if(requestedStructure == SuggestionStructure.TRIE)
            return new TrieAutoSuggest();
        return null;
    }
}
