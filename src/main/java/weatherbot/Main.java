package weatherbot;

import org.telegram.telegrambots.ApiContextInitializer;
import weatherbot.bot.Bot;
import weatherbot.providers.ProviderManager;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws Exception {
		ProviderManager.start();
		ApiContextInitializer.init();

		Bot bot = new Bot();

		try {
			bot.register();
			bot.startPolling();
		} catch (IOException e){
			e.printStackTrace();
		}


//		ArrayList<Provider> providers = ProviderManager.getSources();
//
//		for (Provider src : providers) {
//			System.out.println(src.getView().format());
//		}

	}
}
