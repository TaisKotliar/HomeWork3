package ua.org.oa.TaisKotliar.solutionTwo;

public class WordEntity {
    private String word;
    private int count;

    public WordEntity(String word){
       if (word == null || word.isEmpty()) {
            word = "";
        }
        else {
            this.word = word;
        }

        count = 1;
    }

    public String getWord()
    {
        return word;
    }

    public void incCount(){
        count++;
    }

    public int getCount(){
        return count;
    }

    @Override
    public boolean equals(Object obj) {
       if (obj == null || !(obj instanceof  WordEntity)) return false;

        if (word.equals(((WordEntity) obj).getWord())) return true;
        return false;
    }

    @Override
    public String toString()
    {
        return word + " : " + count;
    }
}
