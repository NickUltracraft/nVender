package me.NickUltracraft.Vender.Core;

import org.bukkit.configuration.file.FileConfiguration;

import me.NickUltracraft.Vender.Main;

public class Mensagens {
	
	public Mensagens() {
		FileConfiguration config = Main.m.getConfig();
		if(loadMessage(config, "Sem-Permissao") != null) {
			Mensagens.SEM_PERMISS�O = config.getString("Mensagens.Sem-Permissao").replace("&", "�");
		}
		if(loadMessage(config, "Configuracao-Recarregada") != null) {
			Mensagens.CONFIGURA��O_RECARREGADA = config.getString("Mensagens.Configuracao-Recarregada").replace("&", "�");
		}
		if(loadMessage(config, "Captcha-Invalido") != null) {
			Mensagens.CAPTCHA_INV�LIDO = config.getString("Mensagens.Captcha-Invalido").replace("&", "�");
		}
		if(loadMessage(config, "Vendido-Sucesso") != null) {
			Mensagens.VENDIDO = config.getString("Mensagens.Vendido-Sucesso").replace("&", "�");
		}
		if(loadMessage(config, "Sem-Itens") != null) {
			Mensagens.SEM_ITENS = config.getString("Mensagens.Sem-Itens").replace("&", "�");
		}
		if(loadMessage(config, "Inventario-Vazio") != null) {
			Mensagens.INVENT�RIO_VAZIO = config.getString("Mensagens.Inventario-Vazio").replace("&", "�");
		}
	}
	private String loadMessage(FileConfiguration config, String path) {
		if(config.isSet("Mensagens." + path)) {
			return config.getString("Mensagens." + path);
		}
		return null;
	}
	public static String SEM_PERMISS�O = "�cVoc� n�o tem permiss�o para executar este comando.";
	public static String CONFIGURA��O_RECARREGADA = "�aConfigura��o e arquivos de linguagem foram recarregados.";
	public static String CAPTCHA_INV�LIDO = "�cO captcha inserido � inv�lido.";
	public static String VENDIDO = "�aVoc� vendeu �7%itens% �aitens por �7$%dinheiro%�a.";
	public static String SEM_ITENS = "�cVoc� n�o possui itens para serem vendidos.";
	public static String INVENT�RIO_VAZIO = "�cVoc� n�o pode estar com um invent�rio vazio.";
}
