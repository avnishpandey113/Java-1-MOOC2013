
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {

        if (!this.guessedLetters.contains(letter)) {
            if (!this.word.contains(letter)) {
                this.numberOfFaults++;
            }
            this.guessedLetters += letter;
        }
    }

    public String hiddenWord() {
        String hiddenVersionOfWord = "";

        int letterIndex = 0;
        while (letterIndex < this.word.length()) {
            char character = this.word.charAt(letterIndex);

            if (this.guessedLetters.contains("" +character)) {
                hiddenVersionOfWord = hiddenVersionOfWord + character;
            } else {
                hiddenVersionOfWord = hiddenVersionOfWord + "_";
            }

            letterIndex++;
        }

        return hiddenVersionOfWord;
    }
}
