/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    void readURL() throws MalformedURLException, IOException{
        URL oracle = new URL("https://hirash.wordpress.com/");
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        oracle.openStream()))) {
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
        }
    }
    public static String html2text(String html) {
    return Jsoup.parse(html).text();
}
}
