package collections;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;
/**
 * Created by Valentina on 18.09.2016.
 */
/*
Подсчитайте и выведите на экран сколько раз каждое слово встречается в файле.
 */
public class ThirdTask {

    private static final String FILE_NAME = "./src/words.txt";
    private static File file = new File(FILE_NAME);

    public static void main(String[] args) {

        Map<String, Integer> mapWords = new HashMap<>();
        if (file.exists()) {
            try (BufferedReader in = new BufferedReader(new FileReader(file));) {
                String s;
                while ((s = in.readLine()) != null) {
                    mapWords.put(s, (mapWords.containsKey(s)) ? mapWords.get(s) + 1 : 1);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else
            System.out.println("Error: FileNotFoundException");
        for (String s : mapWords.keySet())
            System.out.println(s + ": " + mapWords.get(s));
    }
}
