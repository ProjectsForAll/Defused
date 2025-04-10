package host.plas.defused.events;

import host.plas.bou.events.ListenerConglomerate;
import host.plas.defused.Defused;
import org.bukkit.Bukkit;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityExplodeEvent;
import tv.quaint.events.BaseEventHandler;

public class MainListener implements ListenerConglomerate {
    public MainListener() {
        Bukkit.getPluginManager().registerEvents(this, Defused.getInstance());
        BaseEventHandler.bake(this, Defused.getInstance());
        Defused.getInstance().logInfo("Registered MainListener!");
    }

    @EventHandler
    public void onCreeperExplode(EntityExplodeEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof Creeper) {
            // Prevent any block destruction by clearing the blocklist
            event.blockList().clear();
        }
    }
}
