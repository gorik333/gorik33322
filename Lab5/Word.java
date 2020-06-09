/** Class Word creates object and divides it into array of letters.
 * Class has setter.
 *
 * @author Куцурайс Георгій.
 * @version 1.0 30 May 2020.
 */
public class Word {
    /**
     * Field "word" which houses the meaning of the word.
     */
    private String word;
    /**
     * An array of objects of class Letter, of which the word.
     */
    private Letter[] letters;

    /**
     * @param a this variable is assigned to the field "word".
     */
    Word(String a) {
        setWord(a);
        this.letters = new Letter[a.length()];
        for (int i = 0; i < a.length(); i++) {
            letters[i] = new Letter(a.charAt(i));
        }
    }

    /**
     * @return value of field "word".
     */
    public String getWord() {
        return word;
    }

    /**
     * @param word is assigned to the field "word".
     */
    private void setWord(String word) {
        this.word = word;
    }

    /**
     * @return field "letters".
     */
    public Letter[] getLetters() {
        return letters.clone();
    }

    /**
     * @param letter is assigned to the field "letters".
     */
    public void setLetters(Letter[] letter) {
        this.letters = letter.clone();
    }

}
