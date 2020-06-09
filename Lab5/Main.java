/**
 * Завдання: Модифікувати лабораторну роботу №3 наступним чином: для літер, слів, речень, розділових знаків та тексту
 * створити окремі класи. Слово повинно складатися з масиву літер, речення з масиву слів та розділових знаків,
 * текст з масиву речень. Замінити послідовність табуляцій та пробілів одним пробілом.
 *
 * Створити клас, який складається з виконавчого методу, що виконує описану дію з лабораторної роботи №3
 * (з кожного речення заданого тексту видалити підрядок найбільшої довжини, що починається та закінчується заданими
 * літерами), але в якості типів використовує створені класи.
 *
 * Програма містить шість класів:
 *  - Клас Letter;
 *  - Клас Punctuation;
 *  - Клас Word;
 *  - Клас Sentence;
 *  - Клас Text;
 *  - Клас Main (із виконавчим методом).
 *
 * У виконавчому методі ми створюємо об’єкт класу Text, за допомогою конструктора Text(String s),
 * де параметр «s»-наш заданий текст, потім створюємо два об’єкти класу Letter, за допомогою конструктора Letter(char a),
 * параметр «a» задає поле «letter» для кожного об’єкту. Далі за допомогою метода removeOfString(Text t, Letter a, Letter b)
 * виконуємо дію з лабораторно роботи №3. Відредагований текст буде виведено на екран.
 *
 *
 * @author Куцурайс Георгій.
 * @version 1.0 30 May 2020.
 *
 */
public class Main {
    /**
     * Method that removes from the specified string specified substring.
     *
     * @param t associated with an object of class Text.
     * @param a indicates the beginning of the substring.
     * @param b indicates the end of the substring.
     */
    private static void removeOfString(Text t, Letter a, Letter b) {
        boolean k = true;
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < t.getSentence().length; i++) {
            int a1 = t.getSentence()[i].getSent().indexOf(a.getLetter());
            int b1 = t.getSentence()[i].getSent().lastIndexOf(b.getLetter());
            if (a1 != -1 && b1 != -1) {
                s.append(t.getSentence()[i].getSent().substring(0, a1)
                        + t.getSentence()[i].getSent().substring(b1 + 1));
                k = false;
            } else {
                s.append(t.getSentence()[i].getSent());
            }
        }
        if (k) {
            System.out.println("В даному рядку не знайдено заданих символів.");
        } else {
            Text t1 = new Text(s.toString());
            System.out.println("Оригінальний текст:" + "\n" + t.getTxt());
            System.out.println("Видозмінений текст:");
            System.out.println(t1.getTxt());
        }
    }

    public static void main(String[] args) {
        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut " +
                "labore et dolore magna aliqua? Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris " +
                "nisi ut          aliquip ex ea commodo consequat! Duis aute irure dolor in reprehenderit in voluptate velit " +
                "esse cillum dolore eu fugiat nulla pariatur.";
        Text b = new Text(s);
        Letter a = new Letter('m');
        Letter k = new Letter('a');
        removeOfString(b, a, k);
    }

}
