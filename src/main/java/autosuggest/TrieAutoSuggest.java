package autosuggest;

import java.util.*;

public class TrieAutoSuggest implements AutoSuggest {

    private TrieNode root; // root node

    public TrieAutoSuggest() {
        root = new TrieNode();
    }

    /*
     * Add the words to the Trie Data Structure. Every new word would be traversed from root and then added to corresponding Node.
     */
    public void addWordToStructure(String word) {
        TrieNode currentNode = root; // Take the root and traverse.
        for (char letterInWord : word.toCharArray()) {
            if (currentNode.getChildNode().containsKey(letterInWord))
                currentNode = currentNode.getChildNode().get(letterInWord);
            else // If the path is already not covered, create the new path
            {
                TrieNode newNode = new TrieNode(letterInWord);
                currentNode.getChildNode().put(letterInWord, newNode);
                currentNode = newNode;
            }
        }
        currentNode.setEndOfWord(true);
    }

    /*
     * Take the prefix input from the user and traverse it to reach the node from all the words are traversed.
     */
    public List<String> getAutoSuggestWords(String prefix) {
        TrieNode currentNode = root;
        for (char letterInWord : prefix.toCharArray()) {
            if (!currentNode.getChildNode().containsKey(Character.toUpperCase(letterInWord))
                    && !currentNode
                    .getChildNode()
                    .containsKey(
                            Character.toLowerCase(
                                    letterInWord))) // if any of the letter from the prefix is not present will
            // return the empty list.
            {
                return Collections.emptyList();
            }
            currentNode = currentNode.getChildNode().get(letterInWord);
        }
        return autoSuggestRec(currentNode, prefix);
    }

    /*
     *  Recursive call to add all the words with the prefix input
     */
    private List<String> autoSuggestRec(TrieNode node, String currentPrefix) {
        List<String> suggestedWordList = new ArrayList<String>();
        for (Map.Entry<Character, TrieNode> map : node.getChildNode().entrySet()) {
            if (map.getValue().isEndOfWord())
                suggestedWordList.add(currentPrefix + map.getValue().getLetter());
            suggestedWordList.addAll(
                    autoSuggestRec(map.getValue(), currentPrefix + map.getValue().getLetter()));
        }
        Collections.sort(suggestedWordList);
        return suggestedWordList; // List of words with input prefix
    }
}
