import java.util.Iterator;

/**
 * C2 = 0 (9318 mod 2 = 0) Інтерфейс Set.
 * C3 = 2 (9318 mod 3 = 0) Масив із початковою кількістю елементів 15 та збільшенням кількості елементів на 30%.
 *
 * Завдання: Створити клас, що описує типізовану колекцію (типом колекції є узагальнений клас з лабораторної роботи №6),
 * що реалізує заданий варіантом інтерфейс (Set) та має задану внутрішню структуру (Масив із початковою кількістю
 * елементів 15 та збільшенням кількості елементів на 30%).
 * Реалізувати всі методи інтерфейсу, а також створити не менше ніж 3 конструктори (1 – порожній, 2 – в який передається
 * 1 об’єкт узагальненого класу, 3 – в який передається стандартна колекція об’єктів). Всі початкові дані задаються
 * у виконавчому методі. Код  повинен відповідати стандартам JCC та бути детально задокументований.
 *
 * Програма містить 4 класи:
 *  - Клас Coffee (узагальнений клас з лабораторної №6);
 *  - Клас MyCoffeeSet (implements Set<Coffee>);
 *  - Клас Main (із виконавчим методом);
 *
 *  У виконавчому методі ми створюємо об’єкти класу Coffee, які будуть елементами нашої колекції.
 *  За допомогою методів реалізованих у нашій колекції ми додаємо, видаляємо і т.д зі створеної множини елементи.
 *
 * @author Куцурайс Георгій.
 * @version 1.0 31 May 2020.
 */

public class Main{
	public static void main(String[] args) {
		int count = 1;
		MyCoffeeSet set = new MyCoffeeSet();
		set.add(new Coffee("Lavazza","Мелена","Банка",130f,250));
		set.add(new Coffee("Ferarra","Зерно","Пакет",270f,1000));
		set.add(new Coffee("Jacobs","Розчинна","Банка",100f,95));
		set.add(new Coffee("Nescafe","Розчинна","Пакет",50f,120));
		set.add(new Coffee("Jockey","Мелена","Пакет",60,250));
		set.add(new Coffee("Jardin","Зерно","Пакет",250f,81));
		set.add(new Coffee("Ambassador","Зерно","Пакет",1000f,270));
		set.add(new Coffee("Ristretto","Мелена","Пакет",250f,105));
		set.add(new Coffee("Ambassador Blue Label","Розчинна","Банка",190f,190));
		set.add(new Coffee("TOTTI","Зерно","Пакет",1000f,199));
		set.add(new Coffee("Ambassador Espresso","Мелена","Пакет",225f,70));
		set.add(new Coffee("Manhattan","Зерно","Пакет",250f,119));
		set.add(new Coffee("Trevi Espresso","Зерно","Пакет",1000f,279));
		set.add(new Coffee("Brazilеro","Розчинна","Пакет",500f,198));
		set.add(new Coffee("Turati","Зерно","Пакет",1000f,465));


		System.out.println("\n________________Початкова колекція________________\n");
		for (Coffee aSet : set) {
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(aSet);
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));
		System.out.println("\nРозмір початкової колекції: " + set.size());


		//*****************************************ADD******************************************************************
		System.out.println("\n________________Додаємо елементи________________\n");
		set.add(new Coffee("Ristretto","Мелена","Пакет",250f,105));
		set.add(new Coffee("FigaroCoffee","Мелена","Банка",80f,300));
		set.add(new Coffee("Lofbergs","Зерно","Пакет",1150f,100));
		set.add(new Coffee("Starbucks","Мелена","Банка",11200f,2500));
		set.add(new Coffee("DunkinDonuts","Розчинна","Пакет",95f,100));

		Iterator<Coffee> iterator0 = set.iterator();
		count = 1;
		while (iterator0.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iterator0.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));
		System.out.println("\nРозмір після додавання елементів до колекції (деяких елементів повторно): " + set.size() + "\n");


		//*****************************************REMOVE***************************************************************
		System.out.println("________________Видаляємо елементи________________\n"
		);
		System.out.println("Колекція після видалення \"Lavazza\":");
		set.remove(new Coffee("Lavazza","Мелена","Банка",130f,250));

		Iterator<Coffee> iterator2 = set.iterator();
		count = 1;
		while (iterator2.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iterator2.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));
		System.out.println("\nРозмір після видалення \"Lavazza\": " + set.size() + "\n");


		//*****************************************isEmpty**************************************************************
		System.out.println("________________Перевірка на пусту колекцію________________\n");
		System.out.println("Колекція пуста: " + set.isEmpty());


		//*****************************************CONTAIN**************************************************************
		System.out.println("\n________________Перевірка на входження елементу________________\n");
		System.out.println("Елемент \"Nescafe\" в колекції: " + set.contains(new Coffee("Nescafe","Розчинна",
				"Пакет",50f,120)));
		System.out.println("Елемент \"Lavazza\" в колекції: " + set.contains(new Coffee("Lavazza","Мелена",
				"Банка",130f,250)) + "\n");

		//*****************************************toArray**************************************************************
		System.out.println("________________Реалізація методу 'toArray'________________\n");
		Coffee[] arr = set.toArray();
		for (Coffee anArr : arr) {
			System.out.println(new String(new char[58]).replace("\0", "—"));
			System.out.printf("%-2s%-5s", "⎜", anArr);
		}
		System.out.println(new String(new char[58]).replace("\0", "—"));
		System.out.println("\nЕлемент #8:");
		System.out.println(new String(new char[59]).replace("\0", "—"));
		System.out.printf("%-2s%-5s", "⎜", arr[7]);
		System.out.println(new String(new char[58]).replace("\0", "—"));


		//*****************************************containsAll**********************************************************
		System.out.println("\n________________Реалізація методу 'containsAll'________________\n");

		MyCoffeeSet set1 = new MyCoffeeSet();
		set1.add(new Coffee("Paradise","Мелена","Пакет",125f,70));
		set1.add(new Coffee("Elite Health Line","Розчинна","Пакет",190f,28));
		System.out.println("Елементи для перевірки методом \"containsAll\":\n");
		Iterator<Coffee> iteratora = set1.iterator();
		System.out.println("--------------------------------1--------------------------------\n");
		count = 1;
		while (iteratora.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iteratora.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));
		System.out.println("\tВходження: " + set.containsAll(set1) + "\n");
		System.out.println("--------------------------------2--------------------------------");

		MyCoffeeSet set2 = new MyCoffeeSet();
		set2.add(new Coffee("Jacobs","Розчинна","Банка",100f,95));
		set2.add(new Coffee("Nescafe","Розчинна","Пакет",50f,120));
		set2.add(new Coffee("Jockey","Мелена","Пакет",60,250));
		Iterator<Coffee> iteratorb = set2.iterator();
		System.out.println();
		count = 1;
		while (iteratorb.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iteratorb.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));
		System.out.println("\tВходження: " + set.containsAll(set2));
		System.out.println("\n--------------------------------3--------------------------------");

		MyCoffeeSet set3 = new MyCoffeeSet();
		set3.add(new Coffee("Jacobs","Розчинна","Банка",100f,95));
		set3.add(new Coffee("Nescafe","Розчинна","Пакет",50f,120));
		set3.add(new Coffee("Jockey","Мелена","Пакет",60,250));
		Iterator<Coffee> iteratorc = set3.iterator();
		System.out.println();
		count = 1;
		while (iteratorc.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iteratorc.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));
		System.out.println("\tВходження: " + set.containsAll(set2));
		System.out.println();


		//*****************************************addAll***************************************************************
		System.out.println("________________Реалізація методу 'addAll'________________\n");
		MyCoffeeSet set4 = new MyCoffeeSet();
		set4.add(new Coffee("Paradise","Мелена","Пакет",125f,70));
		set4.add(new Coffee("Elite Health Line","Розчинна","Пакет",190f,28));
			System.out.println("Колекція для додавання елементів:");
		Iterator<Coffee> iterator4 = set4.iterator();
		count = 1;
		while (iterator4.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iterator4.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));
		System.out.println("\nКолекція змінилась: " + set.addAll(set4));
		System.out.println("\nКолекція після додавання: ");
		Iterator<Coffee> iterator10 = set.iterator();
		count = 1;
		while (iterator10.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iterator10.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));
		System.out.println("\nРозмір колекції: " + set.size() + "\n");

		//*****************************************removeAll************************************************************
		System.out.println("________________Реалізація методу 'removeAll'________________\n");
		MyCoffeeSet rem = new MyCoffeeSet();
		rem.add(new Coffee("Nescafe","Розчинна","Пакет",50f,120));
		rem.add(new Coffee("Jockey","Мелена","Пакет",60,250));

		System.out.println("Колекція перед видаленням:");
		Iterator<Coffee> iterator12 = set.iterator();
		count = 1;
		while (iterator12.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iterator12.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));

		System.out.println("\nКолекція для видалення:");
		Iterator<Coffee> iteratorf = rem.iterator();
		count = 1;
		while (iteratorf.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iteratorf.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));

		System.out.println("\nКолекція після видалення:");
		set.removeAll(rem);
		Iterator<Coffee> iterator11 = set.iterator();
		count = 1;
		while (iterator11.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iterator11.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));

		System.out.println("\nКолекція змінилась: " + set.removeAll(rem) + "\n");


		//*****************************************retainAll***********************************************************
		System.out.println("________________Реалізація методу 'retainAll'________________\n");
		MyCoffeeSet set5 = new MyCoffeeSet();
		set5.add(new Coffee("Paradise","Мелена","Пакет",125f,70));
		set5.add(new Coffee("Elite Health Line","Розчинна","Пакет",190f,28));

		System.out.println("Колекція перед видаленням:");
		Iterator<Coffee> iterator50 = set.iterator();
		count = 1;
		while (iterator50.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iterator50.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));

		System.out.println("\nКолекція для видалення:");
		Iterator<Coffee> iterator5 = set5.iterator();
		count = 1;
		while (iterator5.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iterator5.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));

		System.out.println("\nКолекція після видалення:");
		Iterator<Coffee> iterator6 = set.iterator();
		set.retainAll(set5);
		count = 1;
		while (iterator6.hasNext()){
			Coffee coffee = iterator6.next();
			if (coffee!= null) {
				System.out.println(new String(new char[31]).replace("\0", "——"));
				System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
				System.out.println(coffee);
				count++;
			}
			else break;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));
		System.out.println("\nКолекція змінилась: " + set.retainAll(set5) + "\n");


		//*****************************************CLEAR****************************************************************
		System.out.println("________________Очищуємо колекцію________________\n");
		set.clear();
		System.out.println("Розмір колекції після очищення: " + set.size());

		//************************************CONSTRUCTORS**************************************************************
		System.out.println("_________________________________________________\n");
		MyCoffeeSet seta = new MyCoffeeSet(new
				Coffee("CostaCoffee","Пакет","Розчинна",40f,15));
		seta.add(new Coffee("DunkinDonuts","Банка","Мелена",1000f,500));


		System.out.println("\tКонструктор #2");
		Iterator<Coffee> iteratorr = seta.iterator();
		count = 1;
		while (iteratorr.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iteratorr.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));


		System.out.println("\n\tКонструктор #3");
		MyCoffeeSet setff = new MyCoffeeSet();
		setff.add(new Coffee("Ferarra","Зерно","Пакет",270f,1000));
		setff.add(new Coffee("Jacobs","Розчинна","Банка",100f,95));
		setff.add(new Coffee("Nescafe","Розчинна","Пакет",50f,120));
		MyCoffeeSet set8 = new MyCoffeeSet(setff);
		Iterator<Coffee> iteratort = set8.iterator();
		count = 1;
		while (iteratort.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iteratort.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));

		System.out.println("_________________________________________________");
	}
}