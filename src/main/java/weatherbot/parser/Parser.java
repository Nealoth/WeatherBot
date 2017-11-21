package weatherbot.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;

public class Parser {
    public static Document getDocument(URL url) throws IOException {
        return Jsoup.parse(url, 3000);
    }

    public static Document getDocument(URL url, int timeout) throws IOException {
        return Jsoup.parse(url, timeout);
    }
}
