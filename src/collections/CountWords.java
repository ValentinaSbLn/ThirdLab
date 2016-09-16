package collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Valentina on 16.09.2016.
 */

/*
Подсчитайте количество различных слов в файле
*/

public class CountWords {
    private static final String fileName = "./src/words.txt";
    private static File file = new File(fileName);

    public static void main(String[] args) {

//Реализация через HashSet. Поскольку Set не содержит повторяющихся значений, то в fileWords все слова будут различны
        HashSet<String> fileWords = new HashSet<>();

//Реализация через ArrayList
        ArrayList<String> arrayFile = new ArrayList<>();


        if (file.exists()) {

            try (BufferedReader in = new BufferedReader(new FileReader(file));) {
                String s;
                while ((s = in.readLine()) != null) {
                    fileWords.add(s);
                    arrayFile.add(s);
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            int count = fileWords.size();
            System.out.println(count);
        } else
            System.out.println("Error: FileNotFoundException");

        int countWords = 0;
        for (int i = 0; i < arrayFile.size(); i++) {

            for (int j = 0; j < arrayFile.size(); j++) {
                if (i != j) {
                    if (arrayFile.get(i).equals(arrayFile.get(j))) {
                        arrayFile.remove(j);
                    }
                }
            }
            countWords++;
        }
        System.out.println("Count words: " + countWords);
        for (int i = 0; i < arrayFile.size(); i++) {
            System.out.println(arrayFile.get(i));
        }

    }


}


