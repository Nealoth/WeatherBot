package weatherbot.sources;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import weatherbot.models.WeatherView;
import weatherbot.parser.Parser;

import java.io.IOException;
import java.net.URL;

class Yandex implements Source {

	private static final String url = "https://yandex.ru/pogoda/moscow/details";

	private WeatherView view;

	public String getUrl() {
		return url;
	}

	public String getDate() {
		return null;
	}

	public WeatherView getView() throws IOException {
		Elements todayWeatherTable = Parser.getDocument(new URL(url))
				.select("tbody[class=weather-table__body]")
				.first()
				.select("tr[class=weather-table__row]");

		Element morningWeather   = todayWeatherTable.get(0);
		Element afternoonWeather = todayWeatherTable.get(1);
		Element eveningWeather   = todayWeatherTable.get(2);
		Element nightWeather     = todayWeatherTable.get(3);

		String morningTemperature = morningWeather
				.select("td[class=weather-table__body-cell weather-table__body-cell_type_daypart weather-table__body-cell_wrapper] div[class=weather-table__temp]")
				.first().text();

		String morningPressure = morningWeather
				.select("td[class=weather-table__body-cell weather-table__body-cell_type_air-pressure]").first().text();

		String morningHumidity = morningWeather
				.select("td[class=weather-table__body-cell weather-table__body-cell_type_humidity]").first().text();

		String morningWind = morningWeather
				.select("td[class=weather-table__body-cell weather-table__body-cell_type_wind weather-table__body-cell_wrapper] span[class=weather-table__wind]")
				.first()
				.text();

		String afternoonTemperature = afternoonWeather
				.select("td[class=weather-table__body-cell weather-table__body-cell_type_daypart weather-table__body-cell_wrapper] div[class=temp weather-table__temp]")
				.first().text();

		String afternoonPressure = afternoonWeather
				.select("td[class=weather-table__body-cell weather-table__body-cell_type_air-pressure]").first().text();

		String afternoonHumidity = afternoonWeather
				.select("td[class=weather-table__body-cell weather-table__body-cell_type_humidity]").first().text();

		String afternoonWind = afternoonWeather
				.select("td[class=weather-table__body-cell weather-table__body-cell_type_wind weather-table__body-cell_wrapper] span[class=weather-table__wind]")
				.first()
				.text();

		String eveningTemperature = eveningWeather
				.select("td[class=weather-table__body-cell weather-table__body-cell_type_daypart weather-table__body-cell_wrapper] div[class=temp weather-table__temp]")
				.first().text();

		String eveningPressure = eveningWeather
				.select("td[class=weather-table__body-cell weather-table__body-cell_type_air-pressure]").first().text();

		String eveningHumidity = eveningWeather
				.select("td[class=weather-table__body-cell weather-table__body-cell_type_humidity]").first().text();

		String eveningWind = eveningWeather
				.select("td[class=weather-table__body-cell weather-table__body-cell_type_wind weather-table__body-cell_wrapper] span[class=weather-table__wind]")
				.first()
				.text();

		String nightTemperature = nightWeather
				.select("td[class=weather-table__body-cell weather-table__body-cell_type_daypart weather-table__body-cell_wrapper] div[class=weather-table__temp]")
				.first().text();

		String nightPressure = nightWeather
				.select("td[class=weather-table__body-cell weather-table__body-cell_type_air-pressure]").first().text();

		String nightHumidity = nightWeather
				.select("td[class=weather-table__body-cell weather-table__body-cell_type_humidity]").first().text();

		String nightWind = nightWeather
				.select("td[class=weather-table__body-cell weather-table__body-cell_type_wind weather-table__body-cell_wrapper] span[class=weather-table__wind]")
				.first()
				.text();

		return new WeatherView("Yandex",
		                       morningTemperature,
		                       morningPressure,
		                       morningHumidity,
		                       morningWind,
		                       afternoonTemperature,
		                       afternoonPressure,
		                       afternoonHumidity,
		                       afternoonWind,
		                       eveningTemperature,
		                       eveningPressure,
		                       eveningHumidity,
		                       eveningWind,
		                       nightTemperature,
		                       nightPressure,
		                       nightHumidity,
		                       nightWind);
	}


}
