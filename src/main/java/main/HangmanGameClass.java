package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HangmanGameClass implements HangmanGame {
    private HangmanInterfaceClass hangmanInterface;
    private String hiddenWord;
    private boolean isPlayerWin;
    private char[] wordInArray;
    private Set<String> wrongLetters;
    private Set<String> rightLetters;
    int countRightLetters;

    public HangmanGameClass() {
        this.hangmanInterface = new HangmanInterfaceClass();
    }

    @Override
    public void initiateGame() {
        boolean personWantToPlay = hangmanInterface.askToPlay();
        if (personWantToPlay) {
            prepareGame();
        }
        else {
            exitGame();
        }

    }

    @Override
    public void playGame() {
        String suggestedLetter = hangmanInterface.askLetter();

        while (isLetterAlreadyBeingUsed(suggestedLetter)) {
            hangmanInterface.alreadySuggestedLetterWarning();
            suggestedLetter = hangmanInterface.askLetter();
        }
        if (hiddenWord.contains(suggestedLetter.toUpperCase())) {
            rightLetters.add(suggestedLetter.toUpperCase());
            int cnt = 0;
            for (int i = 0; i < hiddenWord.length(); i++) {
                if (hiddenWord.charAt(i) == suggestedLetter.toUpperCase().charAt(0)) {
                    wordInArray[i] = suggestedLetter.toUpperCase().charAt(0);
                    cnt++;
                }
            }
            hangmanInterface.setWordInArray(wordInArray);
            setCountRightLetters(getCountRightLetters() + cnt);
        }
        else {
            wrongLetters.add(suggestedLetter);
            hangmanInterface.setWrongLetters(wrongLetters);
        }

        hangmanInterface.drawInterface(getMistakes());

        if (!isGameOver()) {
            playGame();
        }
    }

    @Override
    public void exitGame() {
        hangmanInterface.exitGame();
    }

    @Override
    public void endGame(boolean isPlayerWin) {
        hangmanInterface.endGame(isPlayerWin);
        initiateGame();
    }

    private void prepareGame() {
        setHiddenWord(Dictionary.getWord());
        setPlayerWin(false);
        wordInArray = new char[this.hiddenWord.length()];
        Arrays.fill(this.wordInArray, '*');
        wrongLetters = new HashSet<>();
        rightLetters = new HashSet<>();
        setCountRightLetters(0);

        hangmanInterface.setWordInArray(wordInArray);
        hangmanInterface.setWrongLetters(wrongLetters);

        playGame();
    }
    public void setHiddenWord(String hiddenWord) {
        this.hiddenWord = hiddenWord;
    }

    public void setPlayerWin(boolean PlayerWin) {
        this.isPlayerWin = PlayerWin;
    }

    private void setCountRightLetters(int cnt) {
        this.countRightLetters = cnt;
    }
    private int getCountRightLetters() {
        return this.countRightLetters;
    }

    private int getMistakes() {
        return this.wrongLetters.size();
    }

    private boolean isLetterAlreadyBeingUsed(String letter) {
        return (this.rightLetters.contains(letter) || this.wrongLetters.contains(letter));
    }

    private boolean isGameOver() {
        if (getMistakes() == 6) {
            endGame(this.isPlayerWin);
            return true;
        }
        if (getCountRightLetters() == this.hiddenWord.length()) {
            setPlayerWin(true);
            endGame(this.isPlayerWin);
            return true;
        }
        return false;
    }
}
