package com.algaworks.curso.fjoo.excessoes;

public class TesteExcessoes {

	public static void main(String[] args) {
//		int numero = 5 / 0;
//		System.out.println(numero);
		
//		String s = "um texto";
//		s = null;
//		String maiuscula = s.toUpperCase();
		ContaCorrente cc = new ContaCorrente(100);
		
		try {
			cc.depositar(-10);
			// Várias linhas de código...
		} catch(IllegalArgumentException e) {
			System.out.println("Você executou uma operação ilegal: " + e.getMessage());
		}
		
	}

}
