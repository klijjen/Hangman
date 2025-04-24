package main;

public interface HangmanInterface {
    boolean askToPlay();
    void drawInterface(int mistakes);
    String askLetter();
    void endGame(boolean isPlayerWin);
    void exitGame();

}
