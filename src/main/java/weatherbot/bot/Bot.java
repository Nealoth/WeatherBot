package weatherbot.bot;

import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import weatherbot.Config;

import java.io.IOException;

public class Bot {

	private Config config;
	private String botKey;
	private final static TelegramBotsApi botsApi = new TelegramBotsApi();

	public Bot() {
		config = new Config().getInstance();
	}

	public void register() throws IOException {
		if (config.getProperties().get("botKey") != null) {
			botKey = config.getProperties().get("botKey").toString();
		} else {
			System.out.println("Field 'botKey' not found in config file");
			throw new IOException();
		}
	}

	public void startPolling() {
		try {
			botsApi.registerBot(new MoscowForecastBot(botKey));
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}
}
