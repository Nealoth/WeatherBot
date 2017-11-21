package weatherbot.sources;

import weatherbot.models.WeatherView;

import java.io.IOException;

public interface Source {

    String getUrl();

    String getDate();

    WeatherView getView() throws IOException;
}
