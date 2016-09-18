package collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;

/**
 * Created by Valentina on 18.09.2016.
 */
/*
Подсчитайте количество различных слов в файле
 */
public class FirstTask {
    private static final String FILE_NAME = "./src/words.txt";
    private static File file = new File(FILE_NAME);

    public static void main(String[] args) {

        HashSet<String> fileWords = new HashSet<>();

        if (file.exists()) {

            try (BufferedReader in = new BufferedReader(new FileReader(file));) {
                String s;
                while ((s = in.readLine()) != null) {
                    fileWords.add(s);
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            int count = fileWords.size();
            System.out.println(count);
        } else
            System.out.println("Error: FileNotFoundException");
    }
}
