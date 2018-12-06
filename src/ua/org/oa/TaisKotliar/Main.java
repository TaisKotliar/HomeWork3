package ua.org.oa.TaisKotliar;

import ua.org.oa.TaisKotliar.solutionOne.SolutionOne;
import ua.org.oa.TaisKotliar.solutionTwo.SolutionTwo;

public class Main {

    static String testString = "Two other dwarven clans exist on Azeroth. The Wildhammer dwarves of Aerie Peak, " +
            "though not playable in World of Warcraft, are friendly to Alliance characters, and they maintain " +
            "the Alliance-aligned Wildhammer Stronghold in Outland and Aerie Peak in the Hinterlands. " +
            "They are largely similar in appearance to their Ironforge cousins, though their focus is on gryphon riding, " +
            "rather than the grounded pursuits of the Bronzebeard dwarves. The Dark Iron dwarves are a malevolent clan," +
            " hostile to both the Alliance and the Horde. These dark grey-skinned dwarves reside primarily in " +
            "Blackrock Mountain and are slaves to Ragnaros, the Elemental Lord of fire. In recent years, however, " +
            "some Dark Iron dwarves, under leadership of Moira Thaurissan, have allied themselves with the other dwarves " +
            "and thus the Alliance. ";

    static SolutionOne sOne = new SolutionOne();
    static SolutionTwo sTwo = new SolutionTwo();
    public static void main(String[] args) {
        sOne.countWords(testString);
        sTwo.countWords(testString);

        printWordSolutionOne("lord", sOne);
        printWordSolutionTwo("lord", sTwo);
    }

    public static void printWordSolutionOne(String word, SolutionOne solution) {
        System.out.println("Solution one: word '" + word + "' appears " +
                  solution.getWordCount(word) + " times");
    }

    public static void printWordSolutionTwo(String word, SolutionTwo solution) {
        System.out.println("Solution two: word '" + word + "' appears " +
                  solution.getWordCount(word) + " times");
    }
}

