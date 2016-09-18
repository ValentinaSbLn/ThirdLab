package collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

/**
 * Created by Valentina on 18.09.2016.
 */
public class FourthTask {
    private static final String FILE_NAME = "./src/words.txt";
    private static File file = new File(FILE_NAME);
/*
Выведите на экран все строки файла в обратном порядке.
 */
    public static void main(String[] args) {

        List<String> fileWords = new LinkedList<>();

        if (file.exists()) {

            try (BufferedReader in = new BufferedReader(new FileReader(file));) {
                String s;
                while ((s = in.readLine()) != null) {
                    fileWords.add(s);
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


        } else
            System.out.println("Error: FileNotFoundException");
        ListIterator iterator=fileWords.listIterator(fileWords.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
