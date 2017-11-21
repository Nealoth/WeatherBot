package weatherbot.sources;

import java.util.ArrayList;

public class SourcesManager {

    private static ArrayList<Source> sources = new ArrayList<Source>();

    public static void start() throws Exception {
        if (sources.size() == 0) {
            sources.add(new Yandex());
            sources.add(new Rambler());
        } else {
            throw new Exception("Sources monitor already started!");
        }
    }

    public static ArrayList<Source> getSources() {
        return sources;
    }
}
