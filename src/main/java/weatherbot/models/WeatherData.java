package weatherbot.models;

public class WeatherData implements FormattedWeather {
	private String temperature;
	private String pressure;
	private String humidity;
	private String wind;

	public WeatherData(String temperature, String pressure, String humidity, String wind) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		this.wind = wind;
	}

	protected String getTemperature() {
		return temperature;
	}

	protected void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	protected String getPressure() {
		return pressure;
	}

	protected void setPressure(String pressure) {
		this.pressure = pressure;
	}

	protected String getHumidity() {
		return humidity;
	}

	protected void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	protected String getWind() {
		return wind;
	}

	protected void setWind(String wind) {
		this.wind = wind;
	}

	public String format() {
		StringBuilder formatted = new StringBuilder();

		formatted.append("       Температура: ").append(getTemperature()).append("\n");
		formatted.append("       Давление: ").append(getPressure()).append("\n");
		formatted.append("       Влажность: ").append(getHumidity()).append("\n");
		formatted.append("       Ветер: ").append(getWind()).append("\n");

		return formatted.toString();
	}
}
