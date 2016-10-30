/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WordNet.App;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * @author hiran
 */
public class CreateSentences extends Thread {

    private File file = new File("/home/hiran/sentences.txt");
    private ArrayList<String[]> sentences = new ArrayList<>();
    private FileReader fr;
    private BufferedReader br;

    void createSentence() throws FileNotFoundException, IOException {
        fr = new FileReader(file);
        br = new BufferedReader(fr);
        String data = br.readLine();
        while (data != null) {
//            if (data.contains(".")) {
//                sentences.add(data.split("."));
//            } else {
                sentences.add(data.split("\\r?\\n"));
//            }
            data = br.readLine();
        }
        fr.close();
        br.close();
    }

    void print() {
        System.out.println(sentences.size());
        for (String[] s:sentences) {
            System.out.println(s[1]);
        }
    }

    @Override
    public void run() {
        super.run();
        try {
            createSentence();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void aVoid() {
        String folderPath = "/home/hiran/";
        Path path = Paths.get(folderPath, "sentences.txt"); //or any text file eg.: txt, bat, etc
        Charset charset = Charset.forName("UTF-8");
        String line;
        try (BufferedReader reader = Files.newBufferedReader(path, charset)) {
            while ((line = reader.readLine()) != null) {
                //separate all csv fields into string array
                if (line.contains(".")) {
                    sentences.add(line.split("."));
                } else {
                    sentences.add(line.split("\\r?\\n"));
                }
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
        CreateSentences createSentences = new CreateSentences();
        createSentences.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        createSentences.print();
    }
}
