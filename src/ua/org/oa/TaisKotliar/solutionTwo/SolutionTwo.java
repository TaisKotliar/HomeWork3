package ua.org.oa.TaisKotliar.solutionTwo;

public class SolutionTwo {
    private final int DEFAULT_SIZE = 1000;

    private int index = 0;
    private WordEntity[] wordsCollection = new WordEntity[DEFAULT_SIZE];

    public int getWordCount(String word) {
        word = word.toLowerCase();
        for (int i = 0; i < index; i++)
        {
            if (wordsCollection[i].getWord().equals(word)) return wordsCollection[i].getCount();
        }
        return 0;
    }

    private void addWord(WordEntity word)
    {
        if (word == null) return;

        for (int i = 0; i < index; i++)
        {
            if(wordsCollection[i].equals(word)){
                wordsCollection[i].incCount();
                return;
            }
        }
        wordsCollection[index++] = word;
    }

    public void printWords()
    {
        for (int i = 0; i < index; i++)
        {
            System.out.println(wordsCollection[i]);
        }
    }

    public void countWords(String text) {
        wordsCollection = new WordEntity[DEFAULT_SIZE];

        text = text.trim();
        text = text.toLowerCase();
        char[] myArray = text.toCharArray();
        char[] marks = {' ', ',', '.', '-','!', '?', ';', ':', '(', ')','&'};
        StringBuilder oneWord = new StringBuilder();
        boolean isMark;

        for (int i = 0; i < myArray.length; i++) {
            isMark = false;
            for (int j = 0; j < marks.length; j++) {
                if (myArray[i] == marks[j]) {
                    if (oneWord.length() != 0) {

                        addWord(new WordEntity(oneWord.toString()));
                        oneWord = new StringBuilder();
                    }
                    isMark = true;
                }
            }
            if (!isMark) oneWord.append(myArray[i]);
        }
    }
}
