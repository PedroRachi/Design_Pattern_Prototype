package br.com.prototype;

import java.util.Hashtable;

public class RepoInimigo {

	private static Hashtable<String, Inimigo> inimigoRepo = new Hashtable<String, Inimigo>();

	public static Inimigo getInimigo(String inimigoId) {
		Inimigo protoInimigo = inimigoRepo.get(inimigoId);
		return (Inimigo) protoInimigo.clone();
	}

	public static void loadRepo() {
		Fantasma fantasma = new Fantasma();
		fantasma.setId("1");
		fantasma.setEnergia(10);
		fantasma.setForca(5);
		fantasma.setNivel(1);
		inimigoRepo.put(fantasma.getId(), fantasma);

		Besta besta = new Besta();
		besta.setId("2");
		besta.setEnergia(20);
		besta.setForca(10);
		besta.setNivel(2);
		inimigoRepo.put(besta.getId(), besta);
	}
}
