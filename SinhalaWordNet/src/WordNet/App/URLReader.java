package WordNet.App;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


import java.io.*;
import java.net.URL;
import java.util.HashSet;

/**
 * The type Url reader.
 *
 * @author hiran
 */
public class URLReader {

    /**
     * The J soup.
     */
    private String jSoup;
    /**
     * The File.
     */
    private File file;
    /**
     * The Fw.
     */
    private FileWriter fw;
    /**
     * The Url list.
     */
    private HashSet<String> urlList = new HashSet<>();

    /**
     * Read url.
     *
     * @throws IOException the io exception
     */
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
        int count = 0;
        System.out.println("" + urlList.size());
        for (String urls : urlList) {
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
                    String resultString = jSoup.replaceAll("[a-zA-Z0-9\\[\\]$&+,\";<©>‘`^{_}*↑෴#@?/=:'|\\\\()%!-]", "");
                    if (resultString.length() > 30) {
                        System.out.println("Lines " + count++);
                        System.out.println(resultString);
                        fw.write(resultString + "\n");
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        fw.flush();
        fw.close();
    }

    /**
     * Read url with jsoup.
     *
     * @throws IOException the io exception
     */
    void readUrlWithJsoup() throws IOException {
        URLManager uRLManager = new URLManager();
        int count = 0;
        try {
            uRLManager.start();
            uRLManager.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        file = new File("/home/hiran/sentences.txt");
        fw = new FileWriter(file, true);
        urlList = uRLManager.getUrls();
        System.out.println("" + urlList.size());
        for (String urls : urlList) {
            Document doc = Jsoup.connect(urls).get();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
            try (BufferedReader bufReader = new BufferedReader(new StringReader(doc.toString()))) {
                String textOutput;
                while ((textOutput = bufReader.readLine()) != null) {
                    jSoup = html2text(textOutput);
                    String resultString = jSoup.replaceAll("[a-zA-Z0-9\\[\\]$&+,\";<©>‘`^{_}*↑#@?/=:'|\\\\()%!-]", "");
                    if (resultString.length() > 30) {
                        System.out.println("Lines " + count++);
                        System.out.println(resultString);
                        fw.write(resultString + "\n");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        fw.flush();
        fw.close();
    }

    /**
     * Save urls.
     *
     * @throws IOException the io exception
     */
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
     * Html 2 text string.
     *
     * @param html the html
     * @return string string
     */
    private static String html2text(String html) {
        return Jsoup.parse(html).text();
    }

}
