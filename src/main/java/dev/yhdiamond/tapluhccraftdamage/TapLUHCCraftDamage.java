package dev.yhdiamond.tapluhccraftdamage;

import me.swipez.uhccore.api.UHCAPI;
import me.swipez.uhccore.api.UHCPlugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class TapLUHCCraftDamage extends JavaPlugin implements UHCPlugin {
    public static boolean isStarted = false;
    @Override
    public void onEnable() {
        UHCAPI.registerPlugin(this);
        Bukkit.getPluginManager().registerEvents(new CraftingListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public void stop() {
        isStarted = false;
    }

    @Override
    public void start() {
        isStarted = true;
    }

    @Override
    public String getAuthor() {
        return "YHDiamond";
    }

    @Override
    public ItemStack getDisplayStack() {
        ItemStack itemStack = new ItemStack(Material.CRAFTING_TABLE);
        ItemMeta meta = itemStack.getItemMeta();
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "Lose half a heart every time you craft!");
        meta.setDisplayName(ChatColor.RED + "Crafting Damage");
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return itemStack;
    }
}
