package br.com.algaworks.curso.fjoo.treinadores;

import com.algaworks.curso.fjoo.aniaml.Cachorro;

public class TreinadorCachorro {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Tico");
		
		DonoCachorro dono = new DonoCachorro();
		dono.ensinarCachorroSentar(cachorro);
	}

}
