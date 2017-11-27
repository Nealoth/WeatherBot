package weatherbot.providers;

import java.util.ArrayList;

public class ProviderManager {

    private static ArrayList<Provider> providers = new ArrayList<Provider>();

    public static void start() throws Exception {
        if (providers.size() == 0) {
            providers.add(new YandexProvider());
//            providers.add(new RamblerProvider());
        } else {
            throw new Exception("Sources monitor already started!");
        }
    }

    public static ArrayList<Provider> getSources() {
        return providers;
    }
}
