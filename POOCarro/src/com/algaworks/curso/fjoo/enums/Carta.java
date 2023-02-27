package com.algaworks.curso.fjoo.enums;

public class Carta {
	private int numero;
	private Naipe naipe;
	
	Carta(int numero, Naipe naipe){
		this.numero = numero;
		this.naipe = naipe;
	}
	public void imprimirCarta() {
		System.out.println("Carta: " + numero + " - " + naipe + ": " + naipe.getCor());
	}
}
