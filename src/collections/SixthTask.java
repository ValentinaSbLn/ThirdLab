package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Valentina on 18.09.2016.
 */
/*Выведите на экран строки, номера которых задаются пользователем в произвольном порядке
*/
public class SixthTask {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        WordsWriter writeWords = new WordsWriter();

        arrayList = writeWords.writeInList(arrayList);

        System.out.println("Выберите номер строки (нумерация начинается с \"1\".\nДля выхода введите 0");
        int i = -1;

        Scanner in = new Scanner(System.in);
        do {
            String input = in.nextLine();
            try {
                i = Integer.parseInt(input);
                if (i > 0 && i <= arrayList.size())
                    System.out.println(arrayList.get(i - 1));
                else if (i < 0)
                    System.out.println("Вы ввели неверный номер строки");
                else if (i > arrayList.size())
                    System.out.println("Такой строки не существует");
            } catch (Exception ex) {
                System.out.println("Вы ввели неверное число. Попробуйте снова");
            }
        } while (i != 0);
    }
}
