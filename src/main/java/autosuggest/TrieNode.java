package autosuggest;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    /*
    variables required to store the value in a Trie Data Structure.
    */
    private char letter;
    private Map<Character, TrieNode> childNode;
    boolean isEndOfWord;

    public TrieNode() {
        this.letter = ' ';
        this.childNode = new HashMap<Character, TrieNode>();
        this.isEndOfWord = false;
    }

    /*
    Initialize the Node with the input character.
     */
    public TrieNode(char letter) {
        this();
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public Map<Character, TrieNode> getChildNode() {
        return this.childNode;
    }

    public void setChildNode(Map<Character, TrieNode> childNode) {
        this.childNode = childNode;
    }

    public boolean isEndOfWord() {
        return this.isEndOfWord;
    }

    public void setEndOfWord(boolean endOfWord) {
        isEndOfWord = endOfWord;
    }

    @Override
    public String toString() {
        return Character.toString(letter);
    }
}
