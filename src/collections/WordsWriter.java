package collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Created by Valentina on 18.09.2016.
 */
public class WordsWriter {

    private final String FILE_NAME = "./src/words.txt";
    private final File file = new File(FILE_NAME);


    /**
     * This method writes the words from a file into Set
     * @param set
     * @return Set - Set with words
     */
    public Set writeInSet(Set set) {
        if (file.exists()) {

            try (BufferedReader in = new BufferedReader(new FileReader(file))) {
                String s;
                while ((s = in.readLine()) != null) {
                    set.add(s);

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } else
            System.out.println("Error: FileNotFoundException");
        return set;
    }
    /**
     * This method writes the words from a file into List
     * @param list
     * @return List - Set with words
     */
    public List writeInList(List list) {
        if (file.exists()) {

            try (BufferedReader in = new BufferedReader(new FileReader(file))) {
                String s;
                while ((s = in.readLine()) != null) {
                    list.add(s);

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } else
            System.out.println("Error: FileNotFoundException");
        return list;
    }



}
