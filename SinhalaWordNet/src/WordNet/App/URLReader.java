package WordNet.App;

import org.jsoup.Jsoup;


import java.io.*;
import java.net.URL;
import java.util.HashSet;

/**
 * @author hiran
 */
public class URLReader {

    private String jSoup;
    private File file;
    private FileWriter fw;
    private HashSet<String> urlList = new HashSet<>();

    void readURL() throws IOException {
        URLManager uRLManager = new URLManager();
        try {
            uRLManager.start();
            uRLManager.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        file = new File("/home/hiran/sentences.txt");
        fw = new FileWriter(file, true);
        urlList = uRLManager.getUrls();
        for (String urls : urlList) {
            System.out.println("" + urlList.size());
            if (!urls.contains("rainbowpages")) {
                URL oracle = new URL(urls);
                try {
                    Thread.sleep(5000);
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
        }
        fw.flush();
        fw.close();
    }

    void saveUrls() throws IOException {
        URLManager uRLManager = new URLManager();
        try {
            uRLManager.start();
            uRLManager.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        file = new File("/home/hiran/urllist.txt");
        fw = new FileWriter(file, true);
        urlList = uRLManager.getUrls();
        System.out.println(urlList.size());
        for (String urls : urlList) {
            fw.write(urls + "\n");
        }
        fw.flush();
        fw.close();
    }

    /**
     * @param html
     * @return
     */
    public static String html2text(String html) {
        return Jsoup.parse(html).text();
    }

}
