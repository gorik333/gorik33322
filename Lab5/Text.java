/** Class Text creates object and divides it into array of sentences.
 * Class has setter, constructor and method, which delete extra spaces.
 *
 * @author Куцурайс Георгій.
 * @version 1.0 30 May 2020.
 */

public class Text {
    /**
     * meaning of the text.
     */
    private String txt;
    /**
     * An array of objects of class Sentence, of which the text.
     */
    private Sentence[] sentence;

    /**
     * @param s this variable is assigned to the field "txt".
     */
    Text(String s) {
        String s1 = s.replaceAll("\\s+", " ");
        setTxt(s1);
        ;
        String sent1[] = s1.split("\\.|!|\\?");
        this.sentence = new Sentence[sent1.length];
        int z = 0;
        for (int i = 0; i < sent1.length; i++) {
            z = z + sent1[i].length();
            sentence[i] = new Sentence(sent1[i], s1.charAt(z + i));
        }
    }

    /**
     * @return value of field "txt".
     */
    String getTxt() {
        return txt;
    }

    /**
     * @param txt is assigned to the field "txt".
     */
    private void setTxt(String txt) {
        this.txt = txt;
    }

    /**
     * @return field "sentence".
     */
    Sentence[] getSentence() {
        return sentence.clone();
    }

    /**
     * @param sentence is assigned to the field "sentence".
     */
    public void setSentence(Sentence[] sentence) {
        this.sentence = sentence.clone();
    }

}
