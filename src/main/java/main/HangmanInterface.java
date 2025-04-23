package main;

public interface HangmanInterface {
    boolean askToPlay();
    void drawInterface(int mistakes);
    char askLetter();
    void endGame(boolean isPlayerWin);
    void exitGame();

}
