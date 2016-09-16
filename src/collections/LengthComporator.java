package collections;

import java.util.Comparator;

/**
 * Created by Valentina on 16.09.2016.
 */
public class LengthComporator implements Comparator<String> {

    @Override
    public int compare(String s, String t1) {
        if (s.length() - t1.length() == 0) {
            return s.compareTo(t1);
        } else return s.length() - t1.length();
    }

}
