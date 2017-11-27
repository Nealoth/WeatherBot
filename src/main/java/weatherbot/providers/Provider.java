package weatherbot.providers;

import weatherbot.models.WeatherView;

import java.io.IOException;

public interface Provider {

    String getUrl();

    String getDate();

    WeatherView getView() throws IOException;
}
