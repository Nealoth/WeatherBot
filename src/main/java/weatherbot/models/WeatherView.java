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

		StringBuilder formatted = new StringBuilder();

		formatted.append(sourceTitle).append("\n")
				.append("Утро: \n").append(morning.format()).append("\n")
				.append("День: \n").append(afternoon.format()).append("\n")
				.append("Вечер: \n").append(evening.format()).append("\n")
				.append("Ночь: \n").append(night.format()).append("\n");

		return formatted.toString();
	}
}
