package morphology;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hiran on 10/24/16.
 */
public class WordTypeChecker {

    public static String checkWordType(String word) throws IndexOutOfBoundsException {
        List<String> wordArray = new ArrayList<>(Arrays.asList(word.split("")));
        if (wordArray.size() > 1) {
            if ((wordArray.get(wordArray.size() - 3).toString() + wordArray.get(wordArray.size() - 2).toString() + wordArray.get(wordArray.size() - 1).toString()).equals("නවා")) {
                word = "verb";
            } else {
                word = "noun";
            }
        }
        return word;
    }

    public static void main(String[] args) {
        System.out.println(checkWordType("ගෙනෙනවා"));
    }
}
