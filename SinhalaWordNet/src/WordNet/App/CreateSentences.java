/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WordNet.App;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author hiran
 */
public class CreateSentences {

    private File file = new File("/home/hiran/sentences.txt");
    private ArrayList<String[]> sentences = new ArrayList<>();
    private FileReader fr;
    private BufferedReader br;

    void createSentence() throws FileNotFoundException, IOException {
        fr = new FileReader(file);
        br = new BufferedReader(fr);
        String data = br.readLine();
        while (data != null) {
            sentences.add(data.split("."));
            data = br.readLine();
        }

        for (String[] s : sentences) {
            
                System.out.println("" + s[1]);
           
        }
        fr.close();
        br.close();
    }
}
