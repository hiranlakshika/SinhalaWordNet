package WordNet.App;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import org.jsoup.Jsoup;

/**
 *
 * @author hiran
 */
public class URLReader {

    private String jSoup;
    private File file = new File("/home/hiran/sentences.txt");
    private FileWriter fw;
    private ArrayList<String> urlList = new ArrayList<>();

    void readURL() throws MalformedURLException, IOException {
        fw = new FileWriter(file, true);
        URLManager uRLManager = new URLManager();
        urlList = uRLManager.getUrls();
        for (int i = 0; i < urlList.size(); i++) {
            URL oracle = new URL(urlList.get(i));
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            oracle.openStream()))) {
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    jSoup = html2text(inputLine);
                    String resultString = jSoup.replaceAll("[a-zA-Z0-9\\[\\]$&+,\";<©>‘`^{_}*↑#@?/=:'|\\\\()%!-]", "");
                    if (resultString.length() > 30) {
                        if (resultString.contains(".")) {
                            resultString += "\n";
                            System.out.println(resultString);
                            fw.write(resultString + "\n");
                        }

                    }
                }
            }

        }
        fw.flush();
        fw.close();
    }

    /**
     *
     * @param html
     * @return
     */
    public static String html2text(String html) {
        return Jsoup.parse(html).text();
    }
}
