package holding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Generator {
    int key = 0;

    public String next() {
        switch(key) {
            default:
            case 0:
                key++;
                return "Abc";
            case 2:
                key++;
                return "Bcd";
            case 3:
                key++;
                return "Cde";
            case 1:
                key++;
                return "Def";
            case 4:
                key = 0;
                return "Efg";
        }
    }

    public void fill(String[] s) {
        for (int i = 0; i < s.length; i++) {
            s[i] = next();
        }
    }

    public Collection<String> shift(Collection<String> c, int n) {
        for (int i = 0; i < n; i++) {
            c.add(next());
        }

        return c;
    }

    public static void main(String[] args) {
        Generator generator = new Generator();
        String[] s = new String[5];
        generator.fill(s);
        for (String str : s) {
            System.out.println(str + " ");
        }

        System.out.println(generator.shift(new ArrayList<String>(), 5));
        System.out.println(generator.shift(new LinkedList<String>(), 5));
        System.out.println(generator.shift(new HashSet<String>(), 5));
        System.out.println(generator.shift(new LinkedHashSet<String>(), 5));
        System.out.println(generator.shift(new TreeSet<String>(), 5));
    }
}
