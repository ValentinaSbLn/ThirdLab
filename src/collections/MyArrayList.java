package collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

/**
 * Created by Valentina on 18.09.2016.
 */
public class MyArrayList implements Iterable {

    private final List<String> arrayList;

    public MyArrayList(ArrayList<String> fileArray) {
        arrayList = fileArray;
    }

    @Override
    public Iterator iterator() {
        return new Itr();
    }

    private class Itr implements Iterator {
        private int cursor;

        public Itr() {
            cursor = arrayList.size();
        }

        @Override
        public boolean hasNext() {
            return cursor != 0;
        }

        @Override
        public String next() {
            // this.checkForComodification();
            int index = cursor - 1;
            if (index < 0) {
                throw new NoSuchElementException();
            } else {
                this.cursor = index;
                return arrayList.get(index);
            }
        }
    }

    public static void main(String[] args) {
        String FILE_NAME = "./src/words.txt";
        File file = new File(FILE_NAME);
        ArrayList<String> fileWords = new ArrayList<>();
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

        MyArrayList myArray = new MyArrayList(fileWords);
        Iterator iterator = myArray.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

