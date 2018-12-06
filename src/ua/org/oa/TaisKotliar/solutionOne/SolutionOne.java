package ua.org.oa.TaisKotliar.solutionOne;

import java.util.HashMap;
import java.util.Map;

public class SolutionOne {

    private Map<String, Integer> wordCounter = new HashMap<>();

    public int getWordCount(String word) {
        word = word.toLowerCase();
        return wordCounter.containsKey(word) ? wordCounter.get(word) : 0;
    }

    public void printWords() {
        Object[] keys = wordCounter.keySet().toArray();
        for (int i = 0; i < keys.length; i++) {
            System.out.println(keys[i] + " : " + wordCounter.get(keys[i]));
        }
    }

    public void countWords(String text) {
        wordCounter.clear();

        text = text.trim();
        text = text.toLowerCase();
        String[] words = text.split("[ ,.!:&-;?()]+");
        for (int i = 0; i < words.length; i++) {
            if (wordCounter.containsKey(words[i])) {
                int counter = wordCounter.get(words[i]);
                counter++;
                wordCounter.put(words[i], counter);
            } else {
                wordCounter.put(words[i], 1);
            }
        }
    }

}
