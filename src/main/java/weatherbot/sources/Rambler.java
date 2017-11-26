package weatherbot.sources;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import weatherbot.models.WeatherView;
import weatherbot.parser.Parser;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class Rambler implements Source {

	private static final String url = "https://weather.rambler.ru/v-moskve/";

	public String getUrl() {
		return url;
	}

	public String getDate() {
		return null;
	}

	public WeatherView getView() throws IOException {
		String date = new SimpleDateFormat("dd-MMMM", Locale.ENGLISH)
				.format(new Date())
				.toLowerCase();

		Document document = Parser.getDocument(new URL(url + date));

//		System.out.println(document);

		Elements weatherTable  = document.select("div.weather-detailed");

//		System.out.println(weatherTable);

		return null;
	}
}
