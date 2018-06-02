package holding;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import net.mindview.util.TextFile;

/**
 * Date: 2018-05-05
 *
 * @author chenxi
 */
public class Vowels {

    public static void main(String[] args) {

        Set<String> words = new TreeSet<String>(
                new TextFile("/Users/tn-ma-l00000590/Documents/repositories/home/javacode/mp-java-tij4/src/main/java/holding/UniqueWords.java", "\\W+")
        );

        System.out.println(words);

        Set<Character> vowels = new TreeSet<Character>();
        Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        int allVowels = 0;

        for (String s : words) {
            int count = 0;
            for (Character c : s.toCharArray()) {
                if (vowels.contains(c)) {
                    count++;
                    allVowels++;
                }
            }
            System.out.println(s + " ,count:" + count);
        }
        System.out.println("total:" + allVowels);
    }
}
