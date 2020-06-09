import java.util.Arrays;
/**
 * C13 = 10 (9318 mod 13 = 10)
 *
 * Завдання: Завантажити фургон певного обсягу вантажем на певну суму з різних сортів кави, що можуть перебувати у
 * різних фізичних станах (зерно, мелена, розчинна в банках і пакетиках). Ураховувати обсяг кава разом з упаковкою.
 * Провести сортування товарів на основі співвідношення ціни й ваги. Знайти товар у фургоні, що відповідає заданому
 * діапазону якості кави.
 *
 * Створено клас кави, що складається  з 4 полів: стан кави, запокованість, вага та ціна, і 7 нащадків цього класу:
 * Starbucks, CostaCoffee, DunkinDonuts, Nescafe, FigaroCoffee, Lofbergs, Lavazza.
 * Провдиться оцінка якості кави, як співвідношення ціни до маси. Результати виконання виводяться на екран у
 * відсортованому вигляді.
 *
 * @author Куцурайс Георгій.
 * @version 1.0 30 May 2020.
 *
 */

public class Main {

    private static double func(double d) {
        d=d*100;
        int i = (int)Math.round(d);
        d=(double)i/100;
        return d;
    }
    public static void main(String[] args) {

        Coffee[] array = new Coffee[] {
                new Starbucks("Мелена","Банка",11200,2500),
                new CostaCoffee("Зерно","Пакет",270,1000),
                new DunkinDonuts("Розчинна","Банка",100,95),
                new Nescafe("Розчинна","Пакет",50,120),
                new FigaroCoffee("Зерно", "Банка", 300, 80),
                new Lofbergs("Мелена", "Пакет", 100, 1150),
                new Lavazza("Мелена","Пакет",60,250)
        };
        int sum=0;
        System.out.print(" Загальна маса усіх марок кави - ");
        for (Coffee anArray : array) {
            sum = sum + anArray.GetWeight();
        }
        System.out.println(sum+" гр");

        double[] quality = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            quality[i] = array[i].GetPrice()/array[i].GetWeight();
        }

        Arrays.sort(quality);

        System.out.println(new String(new char[40]).replace("\0", "—"));
        System.out.printf("%-17s%-50s%-1s\n", "⎜", "Якість (співвідношення ціни до маси)","⎜");
        System.out.println(new String(new char[40]).replace("\0", "—"));
        System.out.printf("%-3s%-3s%-6s%-14s%-6s%-10s%-3s%-13s%-3s%-8s%s\n", "⎜", "#","⎜","Назва кави","⎜", "Стан","⎜", "Запакований","⎜", "Якість","⎜");
        System.out.println(new String(new char[40]).replace("\0", "—"));
        for (int i=quality.length-1;i>=0;i--) {
            for (Coffee anArray : array) {
                if (quality[i] == anArray.GetPrice() / anArray.GetWeight()) {
                    System.out.print("⎜  "+(quality.length - i) + "  ");
                    anArray.GetPackCon();
                    System.out.println(func(quality[i]) + "   ⎜");
                }
            }
            System.out.println(new String(new char[40]).replace("\0", "—"));
        }


    }
}

