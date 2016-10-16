package WordNet.App;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import org.jsoup.Jsoup;

/**
 *
 * @author hiran
 */
public class URLReader {

    private String jSoup;
    private File file = new File("/home/hiran/sentences.txt");
    private FileWriter fw;
    private HashSet<String> urlList = new HashSet<>();

    void readURL() throws MalformedURLException, IOException {
        fw = new FileWriter(file, true);
        URLManager uRLManager = new URLManager();
        try {
            //uRLManager.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //urlList = uRLManager.getUrls();
        String[] urls = urlList.toArray(new String[urlList.size()]);
        for (String item : urls) {
            System.out.println("" + urls.length);
            URL oracle = new URL(item);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(oracle.openStream()))) {
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    jSoup = html2text(inputLine);
                    String resultString = jSoup.replaceAll("[a-zA-Z0-9\\[\\]$&+,\";<©>‘`^{_}*↑#@?/=:'|\\\\()%!-]", "");
                    if (resultString.length() > 30) {
                        System.out.println(resultString);
                        fw.write(resultString + "\n");
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
