package collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class MyArrayListWithItr implements Iterable {


    private List<String> arrayList;

    public MyArrayListWithItr() {

        arrayList = new ArrayList<>();
    }

    public void add(String s) {
        arrayList.add(s);
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
        public void remove() {
            arrayList.remove(cursor);
        }

        @Override
        public String next() {
            int index = cursor - 1;
            if (index < 0) {
                throw new NoSuchElementException();
            } else {
                this.cursor = index;
                return arrayList.get(index);
            }

        }
    }
}


