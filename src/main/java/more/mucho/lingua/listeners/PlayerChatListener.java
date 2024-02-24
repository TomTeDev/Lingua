package more.mucho.lingua.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerChatListener implements Listener {

    //TODO register
    private TranslateManager translateManager = TranslateManager.getInstance();
    @EventHandler
    public void onChat(AsyncPlayerChatEvent event){
        Player player = event.getPlayer();
        String messageTranslated = translateManager.translate(player, event.getMessage());
        event.setMessage(messageTranslated);
    }
}
