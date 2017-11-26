package weatherbot;

import org.telegram.telegrambots.ApiContextInitializer;
import weatherbot.bot.Bot;
import weatherbot.sources.SourcesManager;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws Exception {
		SourcesManager.start();
		ApiContextInitializer.init();

		Bot bot = new Bot();

		try {
			bot.register();
			bot.startPolling();
		} catch (IOException e){
			e.printStackTrace();
		}


//		ArrayList<Source> sources = SourcesManager.getSources();
//
//		for (Source src : sources) {
//			System.out.println(src.getView().format());
//		}

	}
}
