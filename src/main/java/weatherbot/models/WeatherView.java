package weatherbot.models;

public class WeatherView implements FormattedWeather {
	private String sourceTitle;

	public WeatherData morning;
	public WeatherData afternoon;
	public WeatherData evening;
	public WeatherData night;

	public WeatherView(String sourceTitle, WeatherData morning, WeatherData afternoon, WeatherData evening, WeatherData night) {
		this.sourceTitle = sourceTitle;
		this.morning = morning;
		this.afternoon = afternoon;
		this.evening = evening;
		this.night = night;
	}

	public String format() {
		return sourceTitle + "\n\n" +
				"Утро: \n" + morning.format() + "\n" +
				"День: \n" + afternoon.format() + "\n" +
				"Вечер: \n" + evening.format() + "\n" +
				"Ночь: \n" + night.format() + "\n";

	}
}
