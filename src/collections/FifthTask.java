package collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Valentina on 18.09.2016.
 */
/*
Реализуйте свой Iterator для обхода списка в обратном порядке
 */
public class FifthTask {
    private static final String FILE_NAME = "./src/words.txt";
    private static File file = new File(FILE_NAME);

    public static void main(String[] args) {

        MyArrayListWithItr myArray = new MyArrayListWithItr();
        if (file.exists()) {
            try (BufferedReader in = new BufferedReader(new FileReader(file))) {
                String s;
                while ((s = in.readLine()) != null) {
                    myArray.add(s);
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else
            System.out.println("Error: FileNotFoundException");

        Iterator<String> iterator = myArray.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
