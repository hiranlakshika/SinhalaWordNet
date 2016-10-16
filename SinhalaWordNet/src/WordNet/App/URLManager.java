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
 *
 * @author hiran
 */
public class URLManager extends Thread {

    private ArrayList<String> mainUrls = new ArrayList<>();
    private HashSet<String> urls = new HashSet<>();

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

//    ArrayList getUrls() {
//
//        urls.add("http://www.ada.lk/article/186920/%E0%B6%9A%E0%B7%9C%E0%B6%A7%E0%B7%94%E0%B7%80%E0%B7%9A-%E0%B6%B4%E0%B6%AF%E0%B7%92%E0%B6%9A-%E0%B7%80%E0%B7%99%E0%B7%85%E0%B7%99%E0%B6%B3%E0%B7%94%E0%B6%B1%E0%B7%8A-%E0%B6%89%E0%B7%80%E0%B6%AD%E0%B6%A7---%E0%B6%B6%E0%B7%9A%E0%B6%BB%E0%B7%9A-%E0%B7%80%E0%B7%90%E0%B7%80%E0%B6%A7-%E0%B6%87%E0%B7%80%E0%B7%92%E0%B6%AF%E0%B7%92%E0%B6%B1-%E0%B6%B8%E0%B6%82%E0%B6%AD%E0%B7%93%E0%B6%BB%E0%B7%94%E0%B7%80%E0%B6%9A%E0%B7%8A");
//        urls.add("https://si.wikipedia.org/wiki/%E0%B7%81%E0%B7%8A%E2%80%8D%E0%B6%BB%E0%B7%93_%E0%B6%AF%E0%B7%85%E0%B6%AF%E0%B7%8F_%E0%B6%B8%E0%B7%8F%E0%B7%85%E0%B7%92%E0%B6%9C%E0%B7%8F%E0%B7%80");
//        urls.add("https://si.wikipedia.org/wiki/2016_%E0%B6%AD%E0%B7%94%E0%B6%BB%E0%B7%8A%E0%B6%9A%E0%B7%92_%E0%B6%BB%E0%B7%8F%E0%B6%A2%E0%B7%8A%E2%80%8D%E0%B6%BA_%E0%B7%80%E0%B7%92%E0%B6%BB%E0%B7%9D%E0%B6%B0%E0%B7%92_%E0%B6%9A%E0%B7%94%E0%B6%B8%E0%B6%B1%E0%B7%8A%E0%B6%AD%E0%B7%8A%E2%80%8D%E0%B6%BB%E0%B6%AB_%E0%B6%B4%E0%B7%8A%E2%80%8D%E0%B6%BB%E0%B6%BA%E0%B6%AD%E0%B7%8A%E0%B6%B1%E0%B6%BA");
//        urls.add("https://si.wikipedia.org/wiki/%E0%B6%BB%E0%B7%9C%E0%B6%A9%E0%B7%93");
//        urls.add("https://si.wikipedia.org/wiki/%E0%B6%AD%E0%B7%9A_%E0%B6%A0%E0%B6%82_%E0%B6%9C%E0%B6%B8%E0%B7%8A");
//        urls.add("https://si.wikipedia.org/wiki/%E0%B7%80%E0%B7%92%E0%B6%9A%E0%B7%8A%E0%B6%A7%E0%B7%9D%E0%B6%BB%E0%B7%92%E0%B6%BA%E0%B7%8F_%E0%B7%80%E0%B7%9A%E0%B6%BD%E0%B7%8A%E0%B6%BD,_%E0%B7%81%E0%B7%8A%E2%80%8D%E0%B6%BB%E0%B7%93_%E0%B6%BD%E0%B6%82%E0%B6%9A%E0%B7%8F%E0%B7%80");
//        urls.add("http://www.lankadeepa.lk/index.php/top_story/464605");
//        urls.add("http://kelimandala.lankadeepa.lk/article/66753/%E0%B6%85%E0%B6%AD%E0%B7%8A-%E0%B6%9A%E0%B7%8F%E0%B6%BD%E0%B6%9D%E0%B6%AB%E0%B6%B1-%E0%B6%BA%E0%B6%B1%E0%B7%8A%E0%B6%AD%E0%B7%8A%E2%80%8D%E0%B6%BB-%E0%B6%9C%E0%B7%90%E0%B6%B1-%E0%B6%AF%E0%B7%99%E0%B6%9C%E0%B7%92%E0%B6%A9%E0%B7%92%E0%B6%BA%E0%B7%8F%E0%B7%80%E0%B6%9A%E0%B7%8A");
//        urls.add("http://kelimandala.lankadeepa.lk/article/66805/%E0%B7%80%E0%B7%92%E0%B6%AF%E0%B7%8A%E2%80%8D%E0%B6%BA%E0%B7%8F%E0%B6%BB%E0%B7%8A%E0%B6%AE---%E0%B7%80%E0%B7%92%E0%B7%81%E0%B7%8F%E0%B6%9B%E0%B7%8F-%E0%B6%B8%E0%B7%9A%E0%B7%83%E0%B6%B4%E0%B6%B1%E0%B7%8A%E0%B6%AF%E0%B7%94-%E0%B7%81%E0%B7%96%E0%B6%BB%E0%B6%AD%E0%B7%8F-%E0%B6%AF%E0%B7%92%E0%B6%B1%E0%B6%AD%E0%B7%92");
//        urls.add("http://kelimandala.lankadeepa.lk/article/66785/%E2%80%98%E0%B6%91%E0%B7%8A%E0%B6%A9%E0%B7%99%E0%B6%9A%E0%B7%8A%E0%B7%83%E0%B7%8A-2016%E2%80%99-9-%E0%B6%AF%E0%B7%8F");
//        urls.add("http://kelimandala.lankadeepa.lk/article/66719/%E0%B6%B6%E0%B7%9C%E0%B6%9A%E0%B7%8A%E0%B7%83%E0%B7%92%E0%B6%82-%E0%B6%9A%E0%B7%8A%E2%80%8D%E0%B6%BB%E0%B7%93%E0%B6%A9%E0%B6%9A-%E0%B6%B8%E0%B6%BA%E0%B7%92%E0%B6%9A%E0%B7%8A-%E0%B6%AF%E0%B7%92%E0%B7%80%E0%B7%92%E0%B6%BA%E0%B7%99%E0%B6%B1%E0%B7%8A-%E0%B7%83%E0%B6%B8%E0%B7%94%E0%B6%9C%E0%B6%B1%E0%B7%93");
//        urls.add("http://www.lankadeepa.lk/index.php/articles/465126");
//        urls.add("http://www.lankadeepa.lk/index.php/articles/465121");
//        urls.add("http://www.lankadeepa.lk/index.php/articles/465013");
//        urls.add("http://www.lankadeepa.lk/index.php/articles/465005");
//        urls.add("http://www.lankadeepa.lk/index.php/articles/464675");
//        urls.add("http://www.ada.lk/article/187004/%E0%B6%AB%E0%B6%BA-%E0%B6%B6%E0%B6%BB-%E0%B6%B1%E0%B7%9C%E0%B6%AD%E0%B6%9A%E0%B7%8F-%E0%B6%B1%E0%B7%90%E0%B7%80-%E0%B6%86%E0%B6%BB%E0%B6%9A%E0%B7%8A%E0%B7%82%E0%B7%8F-%E0%B6%9A%E0%B6%BB%E0%B6%B1%E0%B7%80%E0%B7%8F");
//        urls.add("http://www.saravita.lk/latest_news/464518/%e0%b6%a2%e0%b7%8f%e0%b6%ad%e0%b7%92%e0%b6%9a-%e0%b6%bb%e0%b7%96%e0%b6%b4%e0%b7%80%e0%b7%8f%e0%b7%84%e0%b7%92%e0%b6%b1%e0%b7%92%e0%b6%ba%e0%b7%9a-%e0%b6%b1%e0%b7%92%e0%b7%80%e0%b7%9a%e0%b6%af%e0%b7%92");
//        urls.add("http://www.saravita.lk/latest_news/464329/%e0%b6%91%e0%b6%9a-%e0%b7%80%e0%b6%9c%e0%b7%9a-%e0%b6%af%e0%b7%99%e0%b6%b1%e0%b7%8a%e0%b6%b1%e0%b7%99%e0%b6%9a%e0%b7%8a-%e0%b6%b8%e0%b7%84%e0%b7%9a%e0%b6%b1%e0%b7%8a%e0%b6%af%e0%b7%8a%e2%80%8d");
//        urls.add("http://www.ada.lk/article/187009/%E0%B6%BB%E0%B7%83%E0%B7%8F%E0%B6%BA%E0%B6%B1-%E0%B7%80%E0%B7%92%E0%B6%AF%E0%B7%8A%E2%80%8D%E0%B6%BA%E0%B7%8F-%E0%B6%B1%E0%B7%9C%E0%B6%B6%E0%B7%99%E0%B6%BD%E0%B7%8A-%E0%B6%AD%E0%B7%8A%E2%80%8D%E0%B6%BA%E0%B7%8F%E0%B6%9C%E0%B6%BA%E0%B6%A7%E0%B6%AD%E0%B7%8A-%E0%B6%AD%E0%B7%92%E0%B6%AF%E0%B7%99%E0%B6%B1%E0%B7%99%E0%B6%9A%E0%B7%8A");
//        urls.add("http://www.ada.lk/article/186760/%E0%B6%B7%E0%B7%9E%E0%B6%AD%E0%B7%92%E0%B6%9A-%E0%B7%80%E0%B7%92%E0%B6%AF%E0%B7%8A%E2%80%8D%E0%B6%BA%E0%B7%8F-%E0%B6%B1%E0%B7%9C%E0%B6%B6%E0%B7%99%E0%B6%BD%E0%B7%8A-%E0%B6%AD%E0%B7%8A%E2%80%8D%E0%B6%BA%E0%B7%8F%E0%B6%9C%E0%B6%BA%E0%B6%A7-%E0%B6%AD%E0%B7%92%E0%B6%AF%E0%B7%99%E0%B6%B1%E0%B7%99%E0%B6%9A%E0%B7%8A");
//        urls.add("http://www.ada.lk/article/186547/%E0%B6%9A%E0%B7%92%E0%B6%B8%E0%B7%8A-%E0%B6%9A%E0%B7%8F%E0%B6%BB%E0%B7%8A%E0%B6%A9%E0%B7%8F%E0%B7%82%E0%B7%92%E0%B6%BA%E0%B6%B1%E0%B7%8A%E0%B7%80-%E0%B6%B4%E0%B7%90%E0%B6%BB%E0%B7%93%E0%B7%83%E0%B7%92%E0%B6%BA%E0%B7%9A%E0%B6%AF%E0%B7%93-%E0%B6%B8%E0%B6%82%E0%B6%9A%E0%B7%9C%E0%B6%BD%E0%B7%8A%E0%B6%BD%E0%B6%9A%E0%B7%8F%E0%B6%BD%E0%B7%8F");
//        urls.add("http://www.ada.lk/article/186765/%E0%B7%83%E0%B7%92%E0%B6%BB%E0%B7%92%E0%B6%BA%E0%B7%8F%E0%B7%80%E0%B6%A7-%E0%B6%BB%E0%B7%94%E0%B7%83%E0%B7%92%E0%B6%BA%E0%B7%8F%E0%B7%80%E0%B7%99%E0%B6%B1%E0%B7%8A-%E0%B6%9C%E0%B7%94%E0%B7%80%E0%B6%B1%E0%B7%8A-%E0%B6%86%E0%B6%BB%E0%B6%9A%E0%B7%8A%E0%B7%82%E0%B6%AB-%E0%B6%B8%E0%B7%92%E0%B7%83%E0%B6%BA%E0%B7%92%E0%B6%BD-%E0%B6%B4%E0%B6%AF%E0%B7%8A%E0%B6%B0%E0%B6%AD%E0%B7%92%E0%B6%BA%E0%B6%9A%E0%B7%8A");
//        urls.add("http://www.ada.lk/article/183771/%E0%B6%B6%E0%B7%92%E0%B6%B1%E0%B6%BB-%E0%B6%B4%E0%B7%94%E0%B6%BB-%E0%B6%B4%E0%B7%83%E0%B7%85%E0%B7%9C%E0%B7%83%E0%B7%8A%E0%B7%80%E0%B6%9A-%E0%B6%B4%E0%B7%9C%E0%B7%84%E0%B7%9C%E0%B6%BA-%E0%B6%AF%E0%B7%92%E0%B6%B1%E0%B6%BA-%E0%B6%85%E0%B6%AF%E0%B6%BA%E0%B7%92");
//        urls.add("http://www.ada.lk/article/181871/%E0%B6%BD%E0%B6%82%E0%B6%9A%E0%B7%8F%E0%B7%80%E0%B7%9A-%E0%B6%B4%E0%B7%85%E0%B6%B8%E0%B7%94-%E0%B6%A0%E0%B7%93%E0%B6%B1-%E0%B7%80%E0%B7%92%E0%B7%84%E0%B7%8F%E0%B6%BB%E0%B6%BA-%E0%B6%9A%E0%B7%94%E0%B6%BB%E0%B7%94%E0%B6%AB%E0%B7%91%E0%B6%9C%E0%B6%BD");
//        urls.add("http://www.ada.lk/article/173418/%E0%B6%AF%E0%B7%85%E0%B6%AF%E0%B7%8F-%E0%B6%B8%E0%B7%8F%E0%B6%BD%E0%B7%92%E0%B6%9C%E0%B7%8F%E0%B7%80%E0%B7%9A-%E0%B6%AD%E0%B7%9A%E0%B7%80%E0%B7%8F%E0%B7%80-%E0%B6%85%E0%B7%83%E0%B7%8A%E0%B6%9C%E0%B7%92%E0%B6%BB%E0%B7%92%E0%B6%BA%E0%B6%A7");
//        return urls;
//    }
    /**
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
