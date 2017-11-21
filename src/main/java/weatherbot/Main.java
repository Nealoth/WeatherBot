package weatherbot;

import weatherbot.sources.Source;
import weatherbot.sources.SourcesManager;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {

        SourcesManager.start();

        ArrayList<Source> sources = SourcesManager.getSources();

//        for (Source src : sources) {
//            System.out.println(src.getView().format());
//        }

	    sources.get(1).getView();
    }
}
