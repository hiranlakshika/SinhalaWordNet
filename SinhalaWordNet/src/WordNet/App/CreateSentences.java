package WordNet.App;

import java.io.*;

/**
 * @author hiran
 */
public class CreateSentences extends Thread {

    private File file = new File("/home/hiran/output.txt");
    private FileReader fr;
    private BufferedReader br;
    String[] sentences;

    void createSentence() throws FileNotFoundException, IOException {
        fr = new FileReader(file);
        br = new BufferedReader(fr);
        String data = br.readLine();
        while (data != null) {
            if (data.contains(".")) {
                sentences = data.split("\\.");
            } else {
                sentences = data.split("\\r?\\n");
            }
            data = br.readLine();
        }
        fr.close();
        br.close();
    }

    void print() {
        System.out.println(sentences.length);
        for (String s : sentences
                ) {
            System.out.println(s);
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

    /*void aVoid() {
        String folderPath = "/home/hiran/";
        Path path = Paths.get(folderPath, "output.txt"); //or any text file eg.: txt, bat, etc
        Charset charset = Charset.forName("UTF-8");
        String line;
        try (BufferedReader reader = Files.newBufferedReader(path, charset)) {
            while ((line = reader.readLine()) != null) {
                //separate all csv fields into string array
                if (line.contains(".")) {
                    sentences.add(line.split("\\."));
                } else {
                    sentences.add(line.split("\\r?\\n"));
                }
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    void scannerMethod() throws FileNotFoundException {
        Scanner s = new Scanner(new File("/home/hiran/output.txt"));
        while (s.hasNextLine()) {
            list.add(s.nextLine());
        }
        s.close();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains(".")) {
                sentences.add((list.get(i).split("\\.")));
            } else {
                sentences.add((list.get(i).split("\\r?\\n")));
            }
        }
    }*/

    public static void main(String[] args) {
        CreateSentences createSentences = new CreateSentences();
        createSentences.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        createSentences.print();
    }
}
