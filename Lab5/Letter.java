/** Class Letter creates object of letter.
 *  Class has getter, setter, constructor.
 *
 * @author Куцурайс Георгій.
 * @version 1.0 30 May 2020.
 */

public class Letter {
    /**
     * symbol of letter
     */
    private char letter;

    /**
     * @param a - this variable is assigned to the field "letter".
     */
    Letter(char a) {
        letter = a;
    }

    /**
     * @return value of fields "letter".
     */
    char getLetter() {
        return letter;
    }

    /**
     * @param letter is assigned to the field "letter".
     */
    public void setLetter(char letter) {
        this.letter = letter;
    }

}

