package WordNet.App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.jsoup.Jsoup;

/**
 *
 * @author hiran
 */
public class URLReader {
   
    private String jSoup;

    void readURL() throws MalformedURLException, IOException {
        URL oracle = new URL("http://www.lankadeepa.lk/index.php/top_story/461117");
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        oracle.openStream()))) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                jSoup=html2text(inputLine);
                String resultString = jSoup.replaceAll("[a-zA-Z0-9 \\[\\]$&+,\";<©>‘`^{_}.*#@?/=:'|\\\\()%!-]", "");
                System.out.println(resultString);
            }
        }
    }
    

    public static String html2text(String html) {
        return Jsoup.parse(html).text();
    }
}
