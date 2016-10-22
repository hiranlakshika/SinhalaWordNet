package morphology;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hiran on 10/17/16.
 */
public class WordsGenerator {

    /**
     * Generate word.
     *
     * @param word the word
     * @throws IndexOutOfBoundsException the index out of bounds exception
     */
    public static void generateWord(String word) throws IndexOutOfBoundsException {
        List<String> wordArray = new ArrayList<>(Arrays.asList(word.split("")));
        if (wordArray.size() > 2 && wordArray.get(wordArray.size() - 1).toString().equals("ට")) {
            wordArray.remove(wordArray.size() - 1);
            wordArray.forEach(System.out::print);
        } else if ((wordArray.get(wordArray.size() - 2).toString() + wordArray.get(wordArray.size() - 1).toString()).equals("කට")) {
            wordArray.remove(wordArray.size() - 1);
            wordArray.remove(wordArray.size() - 1);
            wordArray.forEach(System.out::print);
        } else if (wordArray.size() > 3 && (wordArray.get(wordArray.size() - 3).toString() + wordArray.get(wordArray.size() - 2).toString() + wordArray.get(wordArray.size() - 1).toString()).equals("යන්")) {
            wordArray.remove(wordArray.size() - 1);
            wordArray.remove(wordArray.size() - 1);
            wordArray.forEach(System.out::print);
        } else if ((wordArray.get(wordArray.size() - 2).toString() + wordArray.get(wordArray.size() - 1).toString()).equals("ගේ")) {
            wordArray.remove(wordArray.size() - 1);
            wordArray.remove(wordArray.size() - 1);
            wordArray.forEach(System.out::print);
        } else if ((wordArray.get(wordArray.size() - 2).toString() + wordArray.get(wordArray.size() - 1).toString()).equals("යේ")) {
            wordArray.remove(wordArray.size() - 1);
            wordArray.forEach(System.out::print);
        } else if (wordArray.size() > 4 && (wordArray.get(wordArray.size() - 4).toString() + wordArray.get(wordArray.size() - 3).toString() + wordArray.get(wordArray.size() - 2).toString() + wordArray.get(wordArray.size() - 1).toString()).equals("යේදී")) {
            wordArray.remove(wordArray.size() - 1);
            wordArray.remove(wordArray.size() - 1);
            wordArray.remove(wordArray.size() - 1);
            wordArray.forEach(System.out::print);
        } else if (wordArray.size() > 4 && (wordArray.get(wordArray.size() - 4).toString() + wordArray.get(wordArray.size() - 3).toString() + wordArray.get(wordArray.size() - 2).toString() + wordArray.get(wordArray.size() - 1).toString()).equals("න්හි")) {
            wordArray.remove(wordArray.size() - 1);
            wordArray.remove(wordArray.size() - 1);
            wordArray.remove(wordArray.size() - 1);
            wordArray.remove(wordArray.size() - 1);
            wordArray.forEach(System.out::print);
        } else if (wordArray.size() > 6 && (wordArray.get(wordArray.size() - 6).toString() + wordArray.get(wordArray.size() - 5).toString() + wordArray.get(wordArray.size() - 4).toString() +
                wordArray.get(wordArray.size() - 3).toString() + wordArray.get(wordArray.size() - 2).toString() + wordArray.get(wordArray.size() - 1).toString()).equals("න්හිදී")) {
            wordArray.remove(wordArray.size() - 1);
            wordArray.remove(wordArray.size() - 1);
            wordArray.remove(wordArray.size() - 1);
            wordArray.remove(wordArray.size() - 1);
            wordArray.remove(wordArray.size() - 1);
            wordArray.remove(wordArray.size() - 1);
            wordArray.forEach(System.out::print);
        } else if (wordArray.size() > 4 && (wordArray.get(wordArray.size() - 4).toString() + wordArray.get(wordArray.size() - 3).toString() + wordArray.get(wordArray.size() - 2).toString() + wordArray.get(wordArray.size() - 1).toString()).equals("වලදී")) {
            wordArray.remove(wordArray.size() - 1);
            wordArray.remove(wordArray.size() - 1);
            wordArray.remove(wordArray.size() - 1);
            wordArray.forEach(System.out::print);
        } else if (wordArray.size() > 3 && (wordArray.get(wordArray.size() - 2).toString() + wordArray.get(wordArray.size() - 1).toString()).equals("වල")) {
            wordArray.remove(wordArray.size() - 1);
            wordArray.remove(wordArray.size() - 1);
            wordArray.forEach(System.out::print);
        } else if (wordArray.size() > 5 && (wordArray.get(wordArray.size() - 4).toString() + wordArray.get(wordArray.size() - 3).toString() + wordArray.get(wordArray.size() - 2).toString() + wordArray.get(wordArray.size() - 1).toString()).equals("කුත්")) {
            if (wordArray.get(wordArray.size() - 5).toString().equals("ෙ")) {
                wordArray.remove(wordArray.size() - 1);
                wordArray.remove(wordArray.size() - 1);
                wordArray.remove(wordArray.size() - 1);
                wordArray.remove(wordArray.size() - 1);
                wordArray.remove(wordArray.size() - 1);
                wordArray.forEach(System.out::print);
            } else {
                wordArray.remove(wordArray.size() - 1);
                wordArray.remove(wordArray.size() - 1);
                wordArray.remove(wordArray.size() - 1);
                wordArray.remove(wordArray.size() - 1);
                wordArray.forEach(System.out::print);
            }

        } else if (wordArray.size() > 3 && (wordArray.get(wordArray.size() - 2).toString() + wordArray.get(wordArray.size() - 1).toString()).equals("ත්")) {
            if (wordArray.get(wordArray.size() - 3).toString().equals("ෙ")) {
                wordArray.remove(wordArray.size() - 1);
                wordArray.remove(wordArray.size() - 1);
                wordArray.remove(wordArray.size() - 1);
                wordArray.forEach(System.out::print);
            } else {
                wordArray.remove(wordArray.size() - 1);
                wordArray.remove(wordArray.size() - 1);
                wordArray.forEach(System.out::print);
            }
        } else if (wordArray.size() > 5 && (wordArray.get(wordArray.size() - 3).toString() + wordArray.get(wordArray.size() - 2).toString() + wordArray.get(wordArray.size() - 1).toString()).equals("වලට")) {
            wordArray.remove(wordArray.size() - 1);
            wordArray.remove(wordArray.size() - 1);
            wordArray.remove(wordArray.size() - 1);
            wordArray.forEach(System.out::print);
        } else if (wordArray.size() > 5 && (wordArray.get(wordArray.size() - 2).toString() + wordArray.get(wordArray.size() - 1).toString()).equals("ක්")) {
            if (wordArray.get(wordArray.size() - 3).toString().equals("ෙ")) {
                wordArray.remove(wordArray.size() - 1);
                wordArray.remove(wordArray.size() - 1);
                wordArray.remove(wordArray.size() - 1);
                wordArray.forEach(System.out::print);
            } else {
                wordArray.remove(wordArray.size() - 1);
                wordArray.remove(wordArray.size() - 1);
                wordArray.forEach(System.out::print);
            }
        } else {
            wordArray.forEach(System.out::print);
            String s = StringUtils.join(wordArray,"");
            System.out.println("\n"+s);
        }
    }

    /**
     * Input word to simplify.
     *
     * @param input the input
     * @throws IndexOutOfBoundsException the index out of bounds exception
     */
    public void inputWordToSimplify(String input) throws IndexOutOfBoundsException {
        input = input.replaceAll("[ ]", "");
        generateWord(input);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        try {
            String input = "මටමටම";
            input = input.replaceAll("[ ]", "");
            generateWord(input);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
