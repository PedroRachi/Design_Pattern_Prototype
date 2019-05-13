package br.com.prototype;

public class Besta extends Inimigo {

	public Besta() {
		tipo = "Besta";
	}

	@Override
	void ataque() {
		System.out.println("Besta atacando.. Grrr!");

	}

}
