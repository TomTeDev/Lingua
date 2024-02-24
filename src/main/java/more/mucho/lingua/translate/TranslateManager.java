package more.mucho.lingua.translate;

import org.bukkit.entity.Player;

public class TranslateManager {


    private static volatile TranslateManager instance = null;

    private TranslateManager() {

    }

    public static TranslateManager getInstance() {
        synchronized (TranslateManager.class){
            if(instance == null) {
                instance = new TranslateManager();
            }
        }
        return instance;
    }

    public String translate(Player player, String message) {

    }
    public String translate(LANG lang,String message) {

    }
}
