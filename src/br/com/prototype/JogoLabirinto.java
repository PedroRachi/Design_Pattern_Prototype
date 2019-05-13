package br.com.prototype;

public class JogoLabirinto {

	public static void main(String[] args) {
		RepoInimigo.loadRepo();

		Inimigo fantasma_clone = (Inimigo) RepoInimigo.getInimigo("1"); // id = 1 = fantasma
		fantasma_clone.ataque(); // fantasma ja pode atacar pois o objeto veio completo!
		System.out.println("inimigo : " + fantasma_clone.getTipo());
		System.out.println("inimigo : " + fantasma_clone.getNivel());

		Inimigo besta_clone = (Inimigo) RepoInimigo.getInimigo("2"); // id = 2 = besta
		besta_clone.ataque(); // besta ja pode atacar pois o objeto veio completo
		System.out.println("Inimigo : " + besta_clone.getTipo());
		System.out.println("Inimigo : " + besta_clone.getNivel());

	}
}
