package com.algaworks.curso.fjoo.sobrecarga;

public class ExMaquinaCafe {
	int acucarDisponivel;
	
	void fazerCafe(int quantidadeAcucar) {
		if (acucarDisponivel < quantidadeAcucar) {
			System.out.println("Não há açucar suficiente para fazer seu café.");
		} else {
			acucarDisponivel -= quantidadeAcucar;
			System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de açucar.");
		}
	}
	
	void fazerCafe() {
		fazerCafe(10);
	}
}
