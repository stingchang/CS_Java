package question_201;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    private char value;
    private boolean isWord;
    private Map<Character, Trie> children;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        value = '#';
        isWord = false;
        children = new HashMap<>();
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        if (word.length() == 0) {
            isWord = true;
        } else {
            char c = word.charAt(0);
            String sub = word.substring(1);
            if (!children.containsKey(c)) {
                children.put(c, new Trie());
            }
            children.get(c).insert(sub);
        }
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        if (word.length() == 0) return isWord;

        if (!children.containsKey(word.charAt(0))) return false;

        return children.get(word.charAt(0)).search(word.substring(1));
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        if (prefix.length() == 0) {
            return true;
        }
        if (!children.containsKey(prefix.charAt(0))) return false;
        return children.get(prefix.charAt(0)).startsWith(prefix.substring(1));
    }
}
