package br.com.prototype;

public class Fantasma extends Inimigo {

	public Fantasma() {
		tipo = "Fantasma";
	}

	@Override
	void ataque() {
		System.out.println("Fantasma atacando.. BOOO!");

	}

}
