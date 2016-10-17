package morphology;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hiran on 10/17/16.
 */
public class WordsGenerator {

    public static void generateWord(String word) throws IndexOutOfBoundsException {
        List<String> wordArray= new ArrayList<>(Arrays.asList(word.split("")));
        if (wordArray.get(wordArray.size()-1).toString().equals("ට")) {
            wordArray.remove(wordArray.size()-1);
            wordArray.forEach(System.out::print);
        }
    }

    public static void main(String[] args) {
        try {
            generateWord("අංගනයකට");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
