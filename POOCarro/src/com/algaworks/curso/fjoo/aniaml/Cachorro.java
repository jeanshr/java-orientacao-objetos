package com.algaworks.curso.fjoo.aniaml;

public class Cachorro {
	
	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void sentar() {
		System.out.println(nome + ": to sentado!");
	}
}
