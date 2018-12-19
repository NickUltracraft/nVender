package me.NickUltracraft.Vender.Objetos;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.NickUltracraft.Vender.Main;

public class Item {
	
	private String dadoPuro;
	
	public Item(String dadoPuro) {
		this.dadoPuro = dadoPuro;
	}
	@SuppressWarnings("deprecation")
	public Item(ItemStack itemStack) {
		String pre�o = "1";
		for(String a : Main.m.getConfig().getStringList("Itens")) {
			if(a.startsWith(itemStack.getTypeId() + ":" + itemStack.getDurability())) {
				pre�o = a.split("-")[1];
			}
		}
		this.dadoPuro = itemStack.getTypeId() + ":" + itemStack.getDurability() + "-" + pre�o;
	}
	public static Item valueOf(ItemStack item) {
		return new Item(item);
	}
	public String getDadoPuro() {
		return dadoPuro;
	}
	public double getPre�o() {
		return Double.valueOf(dadoPuro.split("-")[1]);
	}
	public int getID() {
		String a = dadoPuro.split("-")[0];
		return Integer.valueOf(a.split(":")[0]);
	}
	public int getData() {
		String a = dadoPuro.split("-")[0];
		return Integer.valueOf(a.split(":")[1]);
	}
	@SuppressWarnings("deprecation")
	public Material getMaterial() {
		return Material.getMaterial(getID());
	}

}
