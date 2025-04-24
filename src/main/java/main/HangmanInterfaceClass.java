package main;

import java.util.*;

public class HangmanInterfaceClass implements HangmanInterface {
    private char[] wordInArray;
    private Set<String> wrongLetters;
    private final Scanner input = new Scanner(System.in);
    @Override
    public boolean askToPlay() {
        System.out.println("Do you want to play the hangman game? (Y/N)");
        return Character.toLowerCase(input.nextLine().charAt(0)) == 'y';
    }

    @Override
    public void drawInterface(int mistakes) {
        drawHangman(mistakes);
        drawInfo(mistakes);
    }

    @Override
    public String askLetter() {
        System.out.print("Suggest a letter for the hidden word: ");
        return String.valueOf(input.nextLine().charAt(0));
    }

    @Override
    public void endGame(boolean isPlayerWin) {
        System.out.println(isPlayerWin ? "You are win" : "You are lost");
        System.out.println("Game is over");
    }

    @Override
    public void exitGame() {
        System.out.println("Exiting");
    }

    private void drawHangman(int mistakes) {
        switch (mistakes) {
            case 0:
                System.out.println(
                        " ________|\n" +
                        " |       |\n" +
                        "         |\n" +
                        "         |\n" +
                        "         |\n" +
                        "         |\n" +
                        "         |\n" +
                        "==========");
                break;
            case 1:
                System.out.println(
                        "  _______|\n" +
                        " |       |\n" +
                        " @       |\n" +
                        "         |\n" +
                        "         |\n" +
                        "         |\n" +
                        "         |\n" +
                        "==========");
                break;
            case 2:
                System.out.println(
                        "  _______|\n" +
                        " |       |\n" +
                        " @       |\n" +
                        " |       |\n" +
                        " |       |\n" +
                        "         |\n" +
                        "         |\n" +
                        "==========");
                break;
            case 3:
                System.out.println(
                        "  _______|\n" +
                        " |       |\n" +
                        " @       |\n" +
                        "/|       |\n" +
                        " |       |\n" +
                        "         |\n" +
                        "         |\n" +
                        "==========");
                break;
            case 4:
                System.out.println(
                        "  _______|\n" +
                        " |       |\n" +
                        " @       |\n" +
                        "/|\\      |\n" +
                        " |       |\n" +
                        "         |\n" +
                        "         |\n" +
                        "==========");
                break;
            case 5:
                System.out.println(
                        "  _______|\n" +
                        " |       |\n" +
                        " @       |\n" +
                        "/|\\      |\n" +
                        " |       |\n" +
                        "/        |\n" +
                        "         |\n" +
                        "==========");
                break;
            case 6:
                System.out.println(
                        "  _______|\n" +
                        " |       |\n" +
                        " @       |\n" +
                        "/|\\      |\n" +
                        " |       |\n" +
                        "/ \\      |\n" +
                        "         |\n" +
                        "==========");
                break;
        }
        System.out.println("\n");
    }

    private void drawInfo(int mistakes) {
        System.out.print("Word: ");
        for (char t : wordInArray) {
            System.out.print(t);
        }
        System.out.print("\nMistakes: " + mistakes);
        System.out.print("\nWrong letter: ");
        for (String t : wrongLetters) {
            System.out.print(t + ' ');
        }
        System.out.println();

    }

    void setWordInArray(char[] wordInArray) {
        this.wordInArray = wordInArray;
    }

    void setWrongLetters(Set<String> wrongLetters) {
        this.wrongLetters = wrongLetters;
    }

    public void alreadySuggestedLetterWarning() {
        System.out.println("You already suggest this letter");
    }
}

/*

  _______|
 |       |
 @       |
/|\      |
 |       |
/ \      |
         |
==========

*/









