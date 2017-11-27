package weatherbot.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.net.URL;

public class HtmlParser {
	public static Document getDocument(URL url) throws IOException {
		return Jsoup.parse(url, 3000);
	}

	public static Document getDocument(URL url, int timeout) throws IOException {
		return Jsoup.parse(url, timeout);
	}

	public static String getFirstOrDefault(Element from, String cssQuery) {
		Element wantedElement = from.select(cssQuery).first();

		if (wantedElement != null) {
			return wantedElement.text();
		} else {
			return " - ";
		}
	}

	public static String getFirstOrDefault(Element from, String cssQuery, String reserveCssQuery) {
		Element wantedElement  = from.select(cssQuery).first();
		Element reserveElement = from.select(reserveCssQuery).first();

		if (wantedElement != null) {
			return wantedElement.text();
		} else if (reserveElement != null) {
			return reserveElement.text();
		} else {
			return " - ";
		}
	}
}
