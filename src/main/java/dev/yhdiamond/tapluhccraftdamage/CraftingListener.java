package dev.yhdiamond.tapluhccraftdamage;

import me.swipez.uhccore.api.UHCAPI;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;

public class CraftingListener implements Listener {
    @EventHandler
    public void onCraft(CraftItemEvent e) {
        if (TapLUHCCraftDamage.isStarted) {
            e.getWhoClicked().setHealth(e.getWhoClicked().getHealth() - 1);
        }
    }
}
