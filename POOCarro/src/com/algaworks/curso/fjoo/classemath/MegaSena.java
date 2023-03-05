package com.algaworks.curso.fjoo.classemath;

import java.util.Arrays;
import java.util.Scanner;

public class MegaSena {

	public static void main(String[] args) {

		Scanner leitorDados = new Scanner(System.in);
		int quantidadeJogos = 0;
		int[] tamanhoJogo = new int [quantidadeJogos];

		System.out.println("Entre com qtde de jogos: ");
		quantidadeJogos = leitorDados.nextInt();
		tamanhoJogo = Arrays.copyOf(tamanhoJogo, quantidadeJogos);

		for(int i = 0; i < tamanhoJogo.length; i++) {
			int contador = i + 1;
			int n = (int) Math.round(Math.random() * 100);
			System.out.println(contador + ": " + n);
		}

	}

}
