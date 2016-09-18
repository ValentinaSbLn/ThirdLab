package collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Valentina on 16.09.2016.
 */

/**
 * Выведите  на  экран список различных слов файла, отсортированный по возрастанию их длины
 (компаратор сначала по длине слова, потом по тексту) .
 */


public class SecondTask {
    private static final String FILE_NAME = "./src/words.txt";
    private static File file = new File(FILE_NAME);

    public static void main(String[] args) {

        Set<String> sortWords = new TreeSet<>(new Comparator<String>() {

            @Override
            public int compare(String s, String t1) {
                if (s.length() - t1.length() == 0) {
                    return s.compareTo(t1);
                } else return s.length() - t1.length();
            }
        });

        if (file.exists()) {
            try (BufferedReader in = new BufferedReader(new FileReader(file));) {
                String s;
                while ((s = in.readLine()) != null) {
                    sortWords.add(s);
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else
            System.out.println("Error: FileNotFoundException");

        Iterator<String> iterator = sortWords.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
