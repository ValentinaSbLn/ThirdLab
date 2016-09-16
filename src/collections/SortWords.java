package collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Valentina on 16.09.2016.
 */
public class SortWords {
    private static final String fileName = "./src/words.txt";
    private static File file = new File(fileName);

    public static void main(String[] args) {
        TreeSet<String > sortWords=new TreeSet<>(new LengthComporator());
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

        Iterator<String> i = sortWords.iterator();

        while(i.hasNext()) {
            String ts = i.next();
            System.out.println(ts);
        }



    }
}
