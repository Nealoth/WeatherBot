package weatherbot.providers;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import weatherbot.models.WeatherData;
import weatherbot.models.WeatherView;
import weatherbot.parser.HtmlParser;

import java.io.IOException;
import java.net.URL;

class YandexProvider implements Provider {

	private static final String URL = "https://yandex.ru/pogoda/moscow/details";

	private String defaultTemperatureElementPath = "td[class=weather-table__body-cell weather-table__body-cell_type_daypart weather-table__body-cell_wrapper] div[class=weather-table__temp]";
	private String reserveTemperatureElementPath = "td[class=weather-table__body-cell weather-table__body-cell_type_daypart weather-table__body-cell_wrapper] div[class=temp weather-table__temp]";
	private String defaultPressureElementPath    = "td[class=weather-table__body-cell weather-table__body-cell_type_air-pressure]";
	private String defaultHumidityElementPath    = "td[class=weather-table__body-cell weather-table__body-cell_type_humidity]";
	private String defaultWindElementPath        = "td[class=weather-table__body-cell weather-table__body-cell_type_wind weather-table__body-cell_wrapper] span[class=weather-table__wind]";


	public String getUrl() {
		return URL;
	}

	public String getDate() {
		return null;
	}

	private WeatherData buildDataView(Element parentElement) {
		String temperature = HtmlParser.getFirstOrDefault(parentElement, defaultTemperatureElementPath, reserveTemperatureElementPath);

		String pressure = HtmlParser.getFirstOrDefault(parentElement, defaultPressureElementPath);

		String humidity = HtmlParser.getFirstOrDefault(parentElement, defaultHumidityElementPath);

		String wind = HtmlParser.getFirstOrDefault(parentElement, defaultWindElementPath);

		return new WeatherData(temperature, pressure, humidity, wind);
	}

	public WeatherView getView() throws IOException {
		Elements todayWeatherTableRows = HtmlParser.getDocument(new URL(URL))
				.select("tbody[class=weather-table__body]")
				.first()
				.select("tr[class=weather-table__row]");

		Element morningWeather   = todayWeatherTableRows.get(0);
		Element afternoonWeather = todayWeatherTableRows.get(1);
		Element eveningWeather   = todayWeatherTableRows.get(2);
		Element nightWeather     = todayWeatherTableRows.get(3);

		WeatherData morningWeatherData   = buildDataView(morningWeather);
		WeatherData eveningWeatherData   = buildDataView(eveningWeather);
		WeatherData afternoonWeatherData = buildDataView(afternoonWeather);
		WeatherData nightWeatherData     = buildDataView(nightWeather);

		return new WeatherView("YandexProvider",
		                       morningWeatherData,
		                       afternoonWeatherData,
		                       eveningWeatherData,
		                       nightWeatherData);
	}

}
