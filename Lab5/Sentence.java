import java.util.ArrayList;

/** Class Sentence creates object and divides it into array of words and punctuations.
 *  Class has setters and constructor.
 *
 * @author Куцурайс Георгій.
 * @version 1.0 30 May 2020.
 */

public class Sentence {
    /**
     * Meaning of the sentence.
     */
    private String sent;
    /**
     * An array of objects of class Word, of which the sentence.
     */
    private Word[] words;
    /**
     * The list of objects of class Punctuation that contains punctuation of the
     * sentence.
     */
    private ArrayList<Punctuation> p;

    /**
     * @param a - this variable is assigned to the field "sent".
     * @param s - this variable is assigned to the field "p".
     */
    Sentence(String a, char s) {
        setSent(a + s);
        ArrayList<Punctuation> p1 = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ',' || a.charAt(i) == ';' || a.charAt(i) == ':'
                    || a.charAt(i) == '-') {
                p1.add(new Punctuation(a.charAt(i), i));
            }
        }
        p1.add(new Punctuation(s, a.length()));
        p = p1;
        String sent1[] = a.split("[,-:;]\\s|\\s[,-:;]|[,-:;]|\\s");
        int k = 0;
        for (String aSent1 : sent1)
            if (aSent1.isEmpty()) {
                k++;
            }
        this.words = new Word[sent1.length - k];
        for (int i = 0, j = 0; i < sent1.length; i++) {
            if (!sent1[i].isEmpty()) {
                words[j] = new Word(sent1[i]);
                j++;
            }
        }
    }

    /**
     * @return value of field "sent".
     */
    String getSent() {
        return sent;
    }

    /**
     * @param sent is assigned to the field "sent".
     */
    private void setSent(String sent) {
        this.sent = sent;
    }

    /**
     * @return field "words".
     */
    public Word[] getWords() {
        return words.clone();
    }

    /**
     * @param word is assigned to the field "words".
     */
    public void setWord(Word[] word) {
        this.words = word.clone();
    }

    /**
     * @return field "p".
     */
    public ArrayList<Punctuation> getP() {
        return new ArrayList<>(p);
    }

    /**
     * @param p is assigned to the field "p";
     */
    public void setP(ArrayList<Punctuation> p) {
        this.p = new ArrayList<>(p);
    }

}

