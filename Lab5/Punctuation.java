/** Class Punctuation creates object of punctuation symbol.
 *
 * @author Куцурайс Георгій.
 * @version 1.0 30 May 2020.
 */

public class Punctuation {
    /**
     * symbol of punctuation
     */
    private char symbol;
    /**
     * position of punctuation of sentence.
     */
    private int position;

    /**
     * @param a - this variable is assigned to the field "symbol".
     * @param p - this variable is assigned to the field "position".
     */
    Punctuation(char a, int p) {
        setSymbol(a);
        setPosition(p);
    }

    /**
     * @return value of field "symbol".
     */
    public char getSymbol() {
        return symbol;
    }

    /**
     * @param symbol is assigned to the field "symbol".
     */
    private void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    /**
     * @return field "position".
     */
    public int getPosition() {
        return position;
    }

    /**
     * @param position is assigned to the field "position".
     */
    private void setPosition(int position) {
        this.position = position;
    }
}
