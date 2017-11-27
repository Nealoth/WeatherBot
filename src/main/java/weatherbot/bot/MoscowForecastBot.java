package weatherbot.bot;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import weatherbot.providers.ProviderManager;

import java.io.IOException;

class MoscowForecastBot extends TelegramLongPollingBot {

	private String botKey;

	public MoscowForecastBot(String botKey) {
		this.botKey = botKey;
	}

	public void onUpdateReceived(Update update) {
		if (update.hasMessage() && update.getMessage().hasText()) {
			SendMessage message = null;
			try {
				message = new SendMessage()
						.setChatId(update.getMessage().getChatId())
						.setText(ProviderManager.getSources().get(0).getView().format());
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				execute(message);
			} catch (TelegramApiException e) {
				e.printStackTrace();
			}
		}
	}

	public String getBotUsername() {
		return null;
	}

	public String getBotToken() {
		return this.botKey;
	}
}
