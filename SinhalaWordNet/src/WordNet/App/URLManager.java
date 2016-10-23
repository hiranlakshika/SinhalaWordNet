package WordNet.App;

import Util.Patterns;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * The type Url manager.
 *
 * @author hiran
 */
public class URLManager extends Thread {

    private ArrayList<String> mainUrls = new ArrayList<>();
    private HashSet<String> urls = new HashSet<>();

    /**
     * Crawl.
     *
     * @param url the url
     * @throws IOException the io exception
     */
    public void crawl(String url) throws IOException {

        Document doc = Jsoup.connect(url).get();
        Elements links = doc.select("a");

        for (Element link : links) {
            String foundUrl = link.attr("abs:href").toLowerCase();

            if (Patterns.WEB_URL.matcher(foundUrl).matches()) {
                System.out.println(foundUrl);
                urls.add(foundUrl);
            }
        }
    }

    /**
     * Gets urls.
     *
     * @return the urls
     */
    public HashSet<String> getUrls() {

        return urls;
    }

    private void addMainUrls() {
        mainUrls.add("http://www.ada.lk");
        mainUrls.add("http://www.lankadeepa.lk");
        mainUrls.add("http://nethnews.lk");
        mainUrls.add("http://www.gossipking.lk");
        mainUrls.add("http://www.divaina.com");
        mainUrls.add("https://www.dinamina.lk");
        mainUrls.add("http://www.lakbima.lk");
        mainUrls.add("https://si.wikipedia.org/wiki/%E0%B6%B8%E0%B7%94%E0%B6%BD%E0%B7%8A_%E0%B6%B4%E0%B7%92%E0%B6%A7%E0%B7%94%E0%B7%80");
        mainUrls.add("http://sinhala.adaderana.lk");
        mainUrls.add("https://lankacnews.com");
        mainUrls.add("http://www.bbc.com/sinhala");
        mainUrls.add("http://www.sinhala.srilankamirror.com");
        mainUrls.add("http://news.tharunaya.us");
        mainUrls.add("http://www.rivira.lk/online");
        mainUrls.add("http://www.silumina.lk");
        mainUrls.add("http://www.mawbima.lk");
        mainUrls.add("http://ravaya.lk");
        mainUrls.add("http://sodurusitha.blogspot.com");
        mainUrls.add("https://wicharaka.blogspot.com");
        mainUrls.add("https://kolambagamaya.blogspot.com");
        mainUrls.add("http://magebima.blogspot.com");
        mainUrls.add("http://mindsetup16.blogspot.com");
        mainUrls.add("http://adahasawakashaya.blogspot.com");
        mainUrls.add("http://www.infosrilankanews.com");
        mainUrls.add("http://hisahasa.blogspot.com");
        mainUrls.add("http://www.lankatruth.com/site");
        mainUrls.add("http://tharurasi.blogspot.com");
        mainUrls.add("https://chitrangi7.blogspot.com");
        mainUrls.add("https://sugv.wordpress.com");
        mainUrls.add("http://lankanian.blogspot.com");

    }

    @Override
    public void run() {
        addMainUrls();
        for (int i = 0; i < mainUrls.size(); i++) {
            try {
                crawl(mainUrls.get(i));
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }

}
