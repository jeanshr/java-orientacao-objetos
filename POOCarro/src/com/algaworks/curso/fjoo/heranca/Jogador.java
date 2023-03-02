package com.algaworks.curso.fjoo.heranca;

public class Jogador extends Pessoa{
	
	protected boolean aindajoga = false;
	
	public void dizerSeAindaJoga() {
		System.out.println("Ainda hoje?: " + aindajoga);
	}

}
