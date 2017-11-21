package weatherbot.models;

public class WeatherView {
	private String sourceTitle;

	private String MorningTemperature;
	private String MorningPressure;
	private String MorningHumidity;
	private String MorningWind;

	private String AfternoonTemperature;
	private String AfternoonPressure;
	private String AfternoonHumidity;
	private String AfternoonWind;

	private String EveningTemperature;
	private String EveningPressure;
	private String EveningHumidity;
	private String EveningWind;

	private String NightTemperature;
	private String NightPressure;
	private String NightHumidity;
	private String NightWind;

	public WeatherView() {
	}

	public WeatherView(String title, String morningTemperature, String morningPressure, String morningHumidity, String morningWind, String afternoonTemperature, String afternoonPressure, String afternoonHumidity, String afternoonWind, String eveningTemperature, String eveningPressure, String eveningHumidity, String eveningWind, String nightTemperature, String nightPressure, String nightHumidity, String nightWind) {
		sourceTitle = title;
		MorningTemperature = morningTemperature;
		MorningPressure = morningPressure;
		MorningHumidity = morningHumidity;
		MorningWind = morningWind;
		AfternoonTemperature = afternoonTemperature;
		AfternoonPressure = afternoonPressure;
		AfternoonHumidity = afternoonHumidity;
		AfternoonWind = afternoonWind;
		EveningTemperature = eveningTemperature;
		EveningPressure = eveningPressure;
		EveningHumidity = eveningHumidity;
		EveningWind = eveningWind;
		NightTemperature = nightTemperature;
		NightPressure = nightPressure;
		NightHumidity = nightHumidity;
		NightWind = nightWind;
	}

	public String format() {
		String formattedView =
				sourceTitle.toUpperCase() + "\n" +
						"Утро: \n" +
						"     Температура: " + MorningTemperature + "\n" +
						"     Давление: " + MorningPressure + "\n" +
						"     Влажность: " + MorningHumidity + "\n" +
						"     Ветер: " + MorningWind + "\n" +
						"День: \n" +
						"     Температура: " + AfternoonTemperature + "\n" +
						"     Давление: " + AfternoonPressure + "\n" +
						"     Влажность: " + AfternoonHumidity + "\n" +
						"     Ветер: " + AfternoonWind + "\n" +
						"Вечер: \n" +
						"     Температура: " + EveningTemperature + "\n" +
						"     Давление: " + EveningPressure + "\n" +
						"     Влажность: " + EveningHumidity + "\n" +
						"     Ветер: " + EveningWind + "\n" +
						"Ночь: \n" +
						"     Температура: " + NightTemperature + "\n" +
						"     Давление: " + NightPressure + "\n" +
						"     Влажность: " + NightHumidity + "\n" +
						"     Ветер: " + NightWind + "\n";

		return formattedView;
	}

	public String getMorningTemperature() {
		return MorningTemperature;
	}

	public void setMorningTemperature(String morningTemperature) {
		MorningTemperature = morningTemperature;
	}

	public String getMorningPressure() {
		return MorningPressure;
	}

	public void setMorningPressure(String morningPressure) {
		MorningPressure = morningPressure;
	}

	public String getMorningHumidity() {
		return MorningHumidity;
	}

	public void setMorningHumidity(String morningHumidity) {
		MorningHumidity = morningHumidity;
	}

	public String getMorningWind() {
		return MorningWind;
	}

	public void setMorningWind(String morningWind) {
		MorningWind = morningWind;
	}

	public String getAfternoonTemperature() {
		return AfternoonTemperature;
	}

	public void setAfternoonTemperature(String afternoonTemperature) {
		AfternoonTemperature = afternoonTemperature;
	}

	public String getAfternoonPressure() {
		return AfternoonPressure;
	}

	public void setAfternoonPressure(String afternoonPressure) {
		AfternoonPressure = afternoonPressure;
	}

	public String getAfternoonHumidity() {
		return AfternoonHumidity;
	}

	public void setAfternoonHumidity(String afternoonHumidity) {
		AfternoonHumidity = afternoonHumidity;
	}

	public String getAfternoonWind() {
		return AfternoonWind;
	}

	public void setAfternoonWind(String afternoonWind) {
		AfternoonWind = afternoonWind;
	}

	public String getEveningTemperature() {
		return EveningTemperature;
	}

	public void setEveningTemperature(String eveningTemperature) {
		EveningTemperature = eveningTemperature;
	}

	public String getEveningPressure() {
		return EveningPressure;
	}

	public void setEveningPressure(String eveningPressure) {
		EveningPressure = eveningPressure;
	}

	public String getEveningHumidity() {
		return EveningHumidity;
	}

	public void setEveningHumidity(String eveningHumidity) {
		EveningHumidity = eveningHumidity;
	}

	public String getEveningWind() {
		return EveningWind;
	}

	public void setEveningWind(String eveningWind) {
		EveningWind = eveningWind;
	}

	public String getNightTemperature() {
		return NightTemperature;
	}

	public void setNightTemperature(String nightTemperature) {
		NightTemperature = nightTemperature;
	}

	public String getNightPressure() {
		return NightPressure;
	}

	public void setNightPressure(String nightPressure) {
		NightPressure = nightPressure;
	}

	public String getNightHumidity() {
		return NightHumidity;
	}

	public void setNightHumidity(String nightHumidity) {
		NightHumidity = nightHumidity;
	}

	public String getNightWind() {
		return NightWind;
	}

	public void setNightWind(String nightWind) {
		NightWind = nightWind;
	}
}
