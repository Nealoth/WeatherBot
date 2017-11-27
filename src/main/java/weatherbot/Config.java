package weatherbot;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

	private static final String     PATH       = "src/main/resources/conf.properties";
	private static       Properties properties = null;


	public static Config instance = null;

	public Config() {
	}

	public Config getInstance() {
		if (instance == null)
			instance = new Config();

		return instance;
	}

	public Properties getProperties() {
		if (properties == null) {
			try (FileInputStream fileInputStream = new FileInputStream(PATH)){
				properties = new Properties();
				properties.load(fileInputStream);
			} catch (IOException e) {
				System.out.println("Error on loading config file in: " + PATH);
				e.printStackTrace();
			}
		}

		return properties;
	}


}
